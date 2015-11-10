package nata.fragz.com.natanoti;

/**
 * Created by hulk on 11/6/15.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Journal_public extends Fragment {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.journal_public, container, false);


       // mRecyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
       // mRecyclerView.setHasFixedSize(true);

      //  mLayoutManager = new LinearLayoutManager(this);
      //  mRecyclerView.setLayoutManager(mLayoutManager);

       // mAdapter = new Journaladapter();
       // mRecyclerView.setAdapter(mAdapter);
    }
}