package nata.fragz.com.natanoti;

/**
 * Created by hulk on 11/6/15.
 */

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;

public class Journal_private extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.journal_private, container, false);

//        Button btnw = findViewById(R.id.button);
//        Intent btn= new Intent(Journal_private.this,Twitt.class);
//        startActivity(btn);
    }
}
