package com.saudisoft.tahamosaad.trafficapp.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.saudisoft.tahamosaad.trafficapp.Assist_Fragments.Common_Faults_Fragment;
import com.saudisoft.tahamosaad.trafficapp.Assist_Fragments.Nearby_Fragment;
import com.saudisoft.tahamosaad.trafficapp.Assist_Fragments.Parts_Fragment;
import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.BottomNavigationBehavior;

public class Drive_Tips extends AppCompatActivity {

//    private MediaPlayer mediaPlayer;
//    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
////            releaseMediaPlayer();
//        }
//    };
private ActionBar toolbar;


    @Override
    protected void onPause() {
        super.onPause();
//        releaseMediaPlayer();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        releaseMediaPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.activity_driving_tips);
        toolbar = getSupportActionBar();

        // load the store fragment by default
//        toolbar.setTitle(R.string.bug_update);
        loadFragment(new Common_Faults_Fragment());
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.navigation);

         bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                switch (item.getItemId()) {
                    case R.id.Common_faults:

                        fragment = new Common_Faults_Fragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.imp_parts:

                        fragment = new Parts_Fragment();
                        loadFragment(fragment);
                        return true;

                    case R.id.workshop_place:
                        fragment = new Nearby_Fragment();
                        loadFragment(fragment);


                        return true;
                }

                return false;
            }
        });

//
//        // attaching bottom sheet behaviour - hide / show on scroll
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) bnv.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());

//        bnv = (BottomNavigationView) findViewById(R.id.navigation);
//        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) bnv.getLayoutParams();
//        layoutParams.setBehavior(new BottomNavigationBehavior());

    }

        private void loadFragment(Fragment fragment) {
            // load fragment
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, fragment);


//            transaction.addToBackStack(null);//show the last fragment after press back btn
            transaction.commit();
        }


}
