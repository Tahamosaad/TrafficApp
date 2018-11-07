package com.saudisoft.tahamosaad.trafficapp.View_adaptors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * Created by taha.mosaad on 02/01/2018.
 */

public class Image_adaptor extends ArrayAdapter<Word>{

    private int ColorResourceId;

    public Image_adaptor(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }


    public Image_adaptor(Activity context, ArrayList<Word> words ) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,words );


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.popup_image, parent, false);
        }

        Word obj = getItem( position );

        ImageView iconView = (ImageView) view.findViewById( R.id.gif_img );
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (obj.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource( obj.getGIFResourseId() );
            // Make sure the view is visible
            iconView.setVisibility( View.VISIBLE );


        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility( View.GONE );
        }

        return view;
    }
}
