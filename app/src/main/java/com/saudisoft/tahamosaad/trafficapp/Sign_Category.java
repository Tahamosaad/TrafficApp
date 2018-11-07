package com.saudisoft.tahamosaad.trafficapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saudisoft.tahamosaad.trafficapp.View_adaptors.Pager_adaptor;

public class Sign_Category extends AppCompatActivity   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__category);


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Traffic_sign_1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Traffic_sign_2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Traffic_sign_3));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Traffic_sign_4));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Traffic_points));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final Pager_adaptor adapter = new Pager_adaptor(getSupportFragmentManager(),tabLayout.getTabCount());



        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        TextView Training = (TextView) findViewById(R.id.Sign_1);
//
//        Training.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link TrainingActivity}
//                Intent traficintent = new Intent(Sign_Category.this, Traffic_Training.class);
//                // Start the new activity
//                startActivity(traficintent);

//            }
//        });
    }



}
