package com.saudisoft.tahamosaad.trafficapp.View_adaptors;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_Point;
import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_sign1;
import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_sign2;
import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_sign3;
import com.saudisoft.tahamosaad.trafficapp.Sign_Fragments.Traffic_sign4;

/**
 * Created by taha.mosaad on 17/12/2017.
 * used to sort the tabs views
 */

public class Pager_adaptor extends  FragmentStatePagerAdapter {


     int NoTabs;

    public Pager_adaptor (FragmentManager fm,int NumberOfTabs){

        super(fm);
        this.NoTabs=NumberOfTabs;
    }
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                //organization signs
                Traffic_sign1 sign1=new Traffic_sign1();
                return sign1;

            case 1:
                //guided sign
                Traffic_sign2 sign2=new Traffic_sign2();
                return sign2;

            case 2:
                //warrning sign
                Traffic_sign3 sign3 = new Traffic_sign3();
                return sign3;

            case 3:
                ////land marks and light sign
                Traffic_sign4 sign4 = new Traffic_sign4();
                return sign4;
            case 4:
                ////Traffic table
                Traffic_Point point = new Traffic_Point();
                return point;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return NoTabs;
    }
}
