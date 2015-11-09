package nata.fragz.com.natanoti;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Appintro extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here
        // AppIntro will automatically generate the dots indicator and buttons.


        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest
        addSlide(AppIntroFragment.newInstance("title", "description", R.drawable.genge3, Color.parseColor("#3F51B5")));
        addSlide(AppIntroFragment.newInstance("title", "description", R.drawable.genge3, Color.parseColor("#3F51B5")));
        addSlide(AppIntroFragment.newInstance("title", "description", R.drawable.genge3, Color.parseColor("#3F51B5")));


        // OPTIONAL METHODS
        // Override bar/separator color
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
//        setVibrate(true);
//        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent skip = new Intent(Appintro.this,Natahome.class);
        startActivity(skip);
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent done = new Intent(Appintro.this,Natahome.class);
        startActivity(done);
    }
}