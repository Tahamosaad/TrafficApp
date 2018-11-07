package com.saudisoft.tahamosaad.trafficapp.View_adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.saudisoft.tahamosaad.trafficapp.Parts_album;
import com.saudisoft.tahamosaad.trafficapp.R;

import java.util.List;

/**
 * Created by Ravi Tamada on 18/05/16.
 */

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    public String Part_name;
    public int Part_position;
    private Context mContext;
    private List<Parts_album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById( R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow =  (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public AlbumsAdapter(Context mContext, List<Parts_album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Parts_album album = albumList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfPart() + " parts");


        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPopupMenu(holder.overflow);
               albumList.get( position );    //object to point at the card view item position
                Part_name= album.getName(); //get the card view item name
            }
        });
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {

        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {



            switch (menuItem.getItemId()) {
                case R.id.action_show_more:
                    Toast.makeText(mContext, "Show more", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_share_with:
                    Toast.makeText(mContext, "Share with", Toast.LENGTH_SHORT).show();
                    //share problem



                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);

                    sendIntent.putExtra(Intent.EXTRA_SUBJECT, Part_name+" Problem.");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, " Could you please Help \n Describe your problem here....");
                    sendIntent.setType("text/plain");
                    mContext.startActivity(sendIntent);
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
