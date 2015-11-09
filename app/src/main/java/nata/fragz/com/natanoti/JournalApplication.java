package nata.fragz.com.natanoti;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by bill on 11/8/15.
 */
public class JournalApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Journaldata.class);

        Parse.initialize(this, "GDqpaudUzxIubXTzJTXko0i062wWxqLK1AJSzD2K", "KHiJQsUdQYQcZVtxTCuFM6MmbQGKcIGEW1idXmC0");
        ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();

        defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL,true);
    }
}
