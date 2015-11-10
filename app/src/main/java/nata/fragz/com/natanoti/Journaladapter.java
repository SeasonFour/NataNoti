package nata.fragz.com.natanoti;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bill on 11/6/15.
 */
public class Journaladapter  extends RecyclerView.Adapter<Journaladapter.ViewHolder> {

    List<Journalcarditem> mItems;
    public Journaladapter(){
        mItems=new ArrayList<Journalcarditem>();
        Journalcarditem lItem = new Journalcarditem();
        lItem.setmName("The Great Barrier Reef");
        lItem.setmDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt," +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        lItem.setmThumbnail(R.drawable.ic_journal);
        mItems.add(lItem);

        lItem = new Journalcarditem();
        lItem.setmName("The Great Barrier Reef");
        lItem.setmDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt," +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        lItem.setmThumbnail(R.drawable.ic_journal);
        mItems.add(lItem);

        lItem = new Journalcarditem();
        lItem.setmName("The Great Barrier Reef");
        lItem.setmDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt," +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        lItem.setmThumbnail(R.drawable.ic_journal);
        mItems.add(lItem);

        lItem = new Journalcarditem();
        lItem.setmName("The Great Barrier Reef");
        lItem.setmDes("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt," +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        lItem.setmThumbnail(R.drawable.ic_journal);
        mItems.add(lItem);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v) ;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Journalcarditem leItem= mItems.get(position);
        holder.tvCardname.setText(leItem.getmName());
        holder.tvCarddes.setText(leItem.getmDes());
        holder.tvCardthumbnail.setImageResource(leItem.getmThumbnail());

    }

    @Override
    public int getItemCount(){
        return mItems.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView tvCardthumbnail;
        public TextView tvCardname;
        public TextView tvCarddes;

        public ViewHolder(View itemView){
            super(itemView);
            tvCardthumbnail=(ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvCarddes=(TextView)itemView.findViewById(R.id.tv_des_nature);
            tvCardname=(TextView)itemView.findViewById(R.id.tv_nature);
        }
    }
}


