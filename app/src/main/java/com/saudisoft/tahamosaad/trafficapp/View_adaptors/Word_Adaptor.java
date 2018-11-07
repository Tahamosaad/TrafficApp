package com.saudisoft.tahamosaad.trafficapp.View_adaptors;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * Created by taha.mosaad on 12/12/2017.
 * used to show image + 2 textview list
 * edit1: add 2 image + 2 textview list
 * edit2 :  show image + 2 textview list
 */

public class Word_Adaptor extends ArrayAdapter<Word> {


    /** Resource ID for the background color for this list of words */
    private int ColorResourceId;

    /**
     * Create a new {@link Word_Adaptor} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public Word_Adaptor(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        ColorResourceId = colorResourceId;
    }


    public Word_Adaptor(Activity context, ArrayList<Word> words ) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,words );


    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            //convert layout into java object
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_ltem, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mechanicalTextView = (TextView) listItemView.findViewById(R.id.meword_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        mechanicalTextView.setText(currentWord.getMewordTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentWord.getImageresourceid());
            // Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }
        ///////////////////////////////////////////////////////////////////////////
//        ImageView icon2View = (ImageView) listItemView.findViewById(R.id.image2);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        if (currentWord.hasIcon()) {
//            // If an image is available, display the provided image based on the resource ID
//            icon2View.setImageResource(currentWord.getIconresourceid());
//            // Make sure the view is visible
//            icon2View.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            icon2View.setVisibility(View.GONE);
//        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), ColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
//
        // so that it can be shown in the ListView
        return listItemView;
    }
    }

