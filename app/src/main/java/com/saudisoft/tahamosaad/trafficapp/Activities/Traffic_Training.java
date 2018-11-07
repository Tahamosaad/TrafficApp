package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_sign3;

public class Traffic_Training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Traffic_sign3())
                .commit();

        Typeface ar_font;
        ar_font = Typeface.createFromAsset(getAssets(),"VIP TIM Bold.ttf");
        TextView txt = (TextView) findViewById(R.id.meword_text_view);
        txt.setTypeface( ar_font );
        TextView textView = (TextView)findViewById( R.id.default_text_view ) ;
        textView.setTypeface( ar_font );
        CardView cardView1 = (CardView) findViewById(R.id.Training);
    }
}
