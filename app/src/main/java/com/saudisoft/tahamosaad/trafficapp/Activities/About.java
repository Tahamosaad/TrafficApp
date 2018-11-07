package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.saudisoft.tahamosaad.trafficapp.R;

public class About extends AppCompatActivity {
    Dialog MyDialog;
    private Button press_btn;
    private ImageView mImageView;

    public void createAndShowDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        // Get the layout inflater


        LayoutInflater inflater = this.getLayoutInflater();
        View v = inflater.inflate( R.layout.popup_image, null );
        v.findViewById( R.id.gif_img );
        v.setBackgroundResource( R.mipmap.loading );
        builder.setView( v );

        // Add the buttons
        builder.setPositiveButton( R.string.ok_button, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        } );

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void MyCustomAlertDialog() {
        MyDialog = new Dialog( this );
        MyDialog.setContentView( R.layout.popup_image );
        mImageView = (ImageView) findViewById( R.id.gif_img );
        mImageView.setImageResource( R.mipmap.loading );

        MyDialog.show();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_about );
        press_btn = (Button) findViewById( R.id.btn_1 );

//        StringBuilder bulid = new StringBuilder();
//        bulid.append("world");
//        bulid.deleteCharAt(4);
//        bulid.append(" builder").append(".");
//        String text = bulid.toString();

        press_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAndShowDialog();
//            MyCustomAlertDialog();
            }
        } );


    }

}
