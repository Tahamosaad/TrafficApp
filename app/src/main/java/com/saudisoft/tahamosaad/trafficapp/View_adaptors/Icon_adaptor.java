package com.saudisoft.tahamosaad.trafficapp.View_adaptors;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * Created by taha.mosaad on 21/12/2017.
 * used to show icons image besides the textview list (as share,play,etc...)
 * edit to view simple 2 textviews together
 */

public class Icon_adaptor extends ArrayAdapter<Word> {

    /** Resource ID for the background color for this list of words */
    private int ColorResourceId;

    /**
     * Create a new {@link Word_Adaptor} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words

     */
    public Icon_adaptor(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        ColorResourceId = colorResourceId;
    }

    public Icon_adaptor(Activity context, ArrayList<Word> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tips_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mechanicalTextView = (TextView) listItemView.findViewById(R.id.meword_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        mechanicalTextView.setText(currentWord.getMewordTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView PointTextView = (TextView) listItemView.findViewById(R.id.points);
        // Get the version number from the current AndroidFlavor object and
        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) PointTextView.getBackground();
        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(currentWord.getPoint());
        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);

        // set this text on the number TextView
        PointTextView.setText(Integer.toString(currentWord.getPoint()));


        return listItemView;
    }

    /**
     * Return the color for the magnitude circle based on the intensity of the earthquake.
     *
     * @param magnitude of the earthquake
     */
    private int getMagnitudeColor(int magnitude) {
        int magnitudeColorResourceId;
        switch (magnitude) {
            case 0:

            case 2:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 12:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 24:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }

        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
