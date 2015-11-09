package nata.fragz.com.natanoti;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class Login extends AppCompatActivity {

        LoginButton loginButton;
        CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        setContentView(R.layout.activity_login);
        callbackManager = CallbackManager.Factory.create();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile", "user_friends"));


        Button gg= (Button)findViewById(R.id.google_plus);
        loginButton = (LoginButton)findViewById(R.id.login_button);
        loginButton.setReadPermissions("user_friends");
        List<String> permissionNeeds = Arrays.asList("user_photos", "email", "user_birthday", "public_profile");

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                System.out.println("onSuccess");
                GraphRequest request = GraphRequest.newMeRequest
                        (loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                            @Override
                            public void onCompleted(JSONObject object, GraphResponse response) {
                                // Application code
                                Log.v("LoginActivity", response.toString());
                                //System.out.println("Check: " + response.toString());
                                try {
                                    String id = object.getString("id");
                                    String name = object.getString("name");
                                    String email = object.getString("email");
                                    String gender = object.getString("gender");
                                    String birthday = object.getString("birthday");
                                    System.out.println(id + ", " + name + ", " + email + ", " + gender + ", " + birthday);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                            }
                        });
                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,email,gender, birthday");
                request.setParameters(parameters);
                request.executeAsync();
                // App code
            }

            @Override
            public void onCancel() {
                // App code

            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                System.out.println("onError");
                Log.v("LoginActivity", exception.getCause().toString());
            }
        });


        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jhome= new Intent(Login.this,Natahome.class);
                startActivity(jhome);
                finish();
            }
        });


    }
    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
