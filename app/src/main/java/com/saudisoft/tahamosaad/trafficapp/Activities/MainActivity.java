package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.Sign_Category;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
    private TextView name_txt;
    private TextView email_txt;
    private final String DEFAULT = "N/A";
    private  String user_name;
    private String email;
//    Typeface ar_font;

    @Override
    protected void onStop() {
        super.onStop();
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuLogout:

                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(this, LoginActivity.class));

                break;
        }

        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);

//        ar_font = Typeface.createFromAsset(getAssets(),"VIP TIM Bold.ttf");
//        TextView txt = (TextView) findViewById(R.id.txt1);
//        txt.setTypeface( ar_font );

        LoadUserinfo( );
         findViewById(R.id.Training).setOnClickListener( this );
         findViewById(R.id.Tips).setOnClickListener( this );
         findViewById(R.id.Exam).setOnClickListener( this );
         findViewById(R.id.About).setOnClickListener( this );

    }
public void LoadUserinfo()
{

    SharedPreferences get = getSharedPreferences( "User_data",MODE_PRIVATE );
    //get string take (key , default value when there was no values)

        name_txt = (TextView) findViewById( R.id.user_name_txt );
        name_txt.setText( get.getString("name",DEFAULT) );
        email_txt = (TextView) findViewById( R.id.email_txt );
        email_txt.setText( get.getString( "email",DEFAULT ) );
}

public void onClick(View view){

    switch(view.getId()){

        case R.id.Training:
            startActivity(new Intent(this, Sign_Category.class));
            break;
        case R.id.Tips:
            startActivity(new Intent(this, Drive_Tips.class));
            break;
        case R.id.Exam:
            startActivity(new Intent(this, Driving_Exam.class));
            break;
        case R.id.About:
            startActivity(new Intent(this, About.class));
            break;
    }
}
/*
** used to Load user data & image
*
    private void loadUserInformation() {
        final FirebaseUser user = mAuth.getCurrentUser();

        if (user != null) {
            if (user.getPhotoUrl() != null) {
                Glide.with(this)
                        .load(user.getPhotoUrl().toString())
                        .into(imageView);
            }

            if (user.getDisplayName() != null) {
                email_txt = (TextView) findViewById( R.id.email_txt );
                email_txt.setText(user.getDisplayName());
            }


        }
    }
*/

}
