package nata.fragz.com.natanoti;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class Natahome extends AppCompatActivity {

    private FloatingActionMenu menu1;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natahome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        menu1 = (FloatingActionMenu)findViewById(R.id.menu1);
        fab1 =(FloatingActionButton)findViewById(R.id.fab1);//Reminder
        fab2 =(FloatingActionButton)findViewById(R.id.fab2);//View
        fab3 =(FloatingActionButton)findViewById(R.id.fab3);//create new journal

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
                Intent create= new Intent(Natahome.this,Journalcreate.class);
                startActivity(create);
            }
        });

    }

}
