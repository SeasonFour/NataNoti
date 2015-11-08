package nata.fragz.com.natanoti;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.parse.Parse;
import com.parse.ParseObject;

public class Journalcreate extends AppCompatActivity {

    private FloatingActionMenu menu1;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;
    String journalTitle;
    String journalCompose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journalcreate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Parse API codes
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "GDqpaudUzxIubXTzJTXko0i062wWxqLK1AJSzD2K", "KHiJQsUdQYQcZVtxTCuFM6MmbQGKcIGEW1idXmC0");

        //Parse test
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        final EditText jTitle=(EditText)findViewById(R.id.journal_title);
        final EditText jCompose=(EditText)findViewById(R.id.journal_compose);
        final Button btnSave = (Button)findViewById(R.id.btn_save_journal);
        menu1 = (FloatingActionMenu)findViewById(R.id.menu1);
        fab1 =(com.github.clans.fab.FloatingActionButton)findViewById(R.id.fab1);
        fab2 =(com.github.clans.fab.FloatingActionButton)findViewById(R.id.fab2);
        fab3 =(com.github.clans.fab.FloatingActionButton)findViewById(R.id.fab3);

        //Text to string
        journalTitle= jTitle.getText().toString().trim();
        journalCompose=jCompose.getText().toString().trim();


        //Click listeners

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Reminder dialog pop up",Snackbar.LENGTH_SHORT).setAction("Setup",null).show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Viewing saved journals",Snackbar.LENGTH_SHORT).setAction("Viewing",null).show();
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent create= new Intent(Journalcreate.this,Journalcreate.class);
                startActivity(create);
            }
        });

        //journal save button
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
