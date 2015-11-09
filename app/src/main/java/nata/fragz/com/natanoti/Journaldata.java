package nata.fragz.com.natanoti;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by bill on 11/8/15.
 */
@ParseClassName("Journaldata")
public class Journaldata extends ParseObject{


    public  Journaldata(){
        //default constructor
    }
    public String getTitle(){
        return getString("jTitle");
    }
    public void setTitle(String jTitle){
        put("jTitle",jTitle);
    }
    public String getBody(){
        return getString("jBody");
    }
    public void setBody(String jBody){
        put("jBody",jBody);
    }
}
