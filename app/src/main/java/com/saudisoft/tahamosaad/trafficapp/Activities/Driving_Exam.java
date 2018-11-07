package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.saudisoft.tahamosaad.trafficapp.Question_lib;
import com.saudisoft.tahamosaad.trafficapp.R;

public class Driving_Exam extends AppCompatActivity {
    private Question_lib mQuestionLibrary = new Question_lib();

    private TextView mScoreView;
    private ImageView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonquit;
    private int mAnswer;

    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int mtotalQuestion= mQuestionLibrary.gettotal();


    private void createAndShowDialog(String dialog_title,String dialog_message,String pos_button,String neg_button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Add components to the dialog (the order in which components are added does not matter)
       builder.setIcon( R.mipmap.w_45);

        builder.setTitle(dialog_title).
                setMessage(dialog_message).
//                setView(R.layout.dialog_partial_content).  // For < API 21 use setView(View)
        setPositiveButton(pos_button, new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        finish();
    }
}).
                setNegativeButton(neg_button, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        startActivity(getIntent());
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_driving__exam );
//        ArrayList<ImageView> Qustion;
//        Qustion = new ArrayList<ImageView>(  );
//        Qustion.add((ImageView) findViewById( R.id.question) );
        mScoreView = (TextView) findViewById( R.id.score );
        mQuestionView = (ImageView) findViewById( R.id.question );
        mButtonChoice1 = (Button) findViewById( R.id.choice1 );
        mButtonChoice2 = (Button) findViewById( R.id.choice2 );
        mButtonChoice3 = (Button) findViewById( R.id.choice3 );
        mButtonquit =(Button)findViewById( R.id. quit);
        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == getString(mAnswer )) {
                    updateQuestion();
                    updateScore( mScore );


                } else {
                    Toast.makeText( Driving_Exam.this, "wrong", Toast.LENGTH_SHORT ).show();
                    updateQuestion();
                }
            }
        } );

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == getString(mAnswer )) {
                    updateQuestion();
                    updateScore( mScore );

                } else {
                    Toast.makeText( Driving_Exam.this, "wrong", Toast.LENGTH_SHORT ).show();
                    updateQuestion();
                }
            }
        } );

        //End of Button Listener for Button2

//Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == getString(mAnswer )) {

                    updateQuestion();
                    updateScore( mScore );


                } else {
                    Toast.makeText( Driving_Exam.this, "wrong", Toast.LENGTH_SHORT ).show();
                    updateQuestion();
                }
            }
        } );

//End of Button Listener for Button3

        mButtonquit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here
//            Intent intent = new Intent(Driving_Exam.this,MainActivity.class);
//            startActivity(intent);
                createAndShowDialog("Exam finished ","your final score is ("+mScore+")",getString( R.string.ok_button ),getString( R.string.again_button ));


            }
        } );
    }
    private void updateQuestion(){

        if(mQuestionNumber<mtotalQuestion) {

            mQuestionView.setImageResource( mQuestionLibrary.getQuestion( mQuestionNumber ) );
            mButtonChoice1.setText( mQuestionLibrary.getChoice1( mQuestionNumber ) );
            mButtonChoice2.setText( mQuestionLibrary.getChoice2( mQuestionNumber ) );
            mButtonChoice3.setText( mQuestionLibrary.getChoice3( mQuestionNumber ) );

            mAnswer = mQuestionLibrary.getCorrectAnswer( mQuestionNumber );
            mQuestionNumber++;
        }
        else {
            //end of question

            Toast.makeText( Driving_Exam.this, "your score is ("+mScore+")", Toast.LENGTH_LONG ).show();
        }
    }


    private void updateScore(int point) {
        if (mQuestionNumber < mtotalQuestion) {
            mScore = mScore + 1;
            Toast.makeText( Driving_Exam.this, "correct", Toast.LENGTH_SHORT ).show();
            mScoreView.setText( "" + mScore );
        }else {
            //end of question
            createAndShowDialog("Exam finished ","your final score is ("+mScore+")",getString( R.string.ok_button ),getString( R.string.again_button ));


        }
    }


}
