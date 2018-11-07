package com.saudisoft.tahamosaad.trafficapp.Assist_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.Word_Adaptor;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Common_Faults_Fragment extends Fragment {


    public Common_Faults_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_faults, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("","",R.raw.afs_off_indicator));
        words.add(new Word("","",R.raw.active_cruise_control_indicator));
        words.add(new Word("","",R.raw.air_filter_clogged_indicator));
        words.add(new Word("","",R.raw.all_wheel_drive_disabled_indicator));
        words.add(new Word("","",R.raw.all_wheel_lock));
        words.add(new Word("","",R.raw.all_wheel_drive_lock_indicator));
        words.add(new Word("","",R.raw.antilock_braking_system_trouble_light));
        words.add(new Word("","",R.raw.at_p_indicator));
        words.add(new Word("","",R.raw.blind_spot_warning_system_symbol));
        words.add(new Word("","",R.raw.auto_brake_hold_indicator));
        words.add(new Word("","",R.raw.brake_fluid_low));
        words.add(new Word("","",R.raw.automatic_headlamp_dimmer_indicator_symbol));
        words.add(new Word("","",R.raw.vehicle_stability_conrtol_off_indicator));
        words.add(new Word("","",R.raw.dsc_off_indicator));

        words.add(new Word("","",R.raw.afs_off_indicator));
        words.add(new Word("","",R.raw.active_cruise_control_indicator));
        words.add(new Word("","",R.raw.air_filter_clogged_indicator));
        words.add(new Word("","",R.raw.all_wheel_drive_disabled_indicator));
        words.add(new Word("","",R.raw.all_wheel_lock));
        words.add(new Word("","",R.raw.all_wheel_drive_lock_indicator));
        words.add(new Word("","",R.raw.antilock_braking_system_trouble_light));
        words.add(new Word("","",R.raw.at_p_indicator));
        words.add(new Word("","",R.raw.blind_spot_warning_system_symbol));
        words.add(new Word("","",R.raw.auto_brake_hold_indicator));
        words.add(new Word("","",R.raw.brake_fluid_low));
        words.add(new Word("","",R.raw.automatic_headlamp_dimmer_indicator_symbol));
        words.add(new Word("","",R.raw.vehicle_stability_conrtol_off_indicator));
        words.add(new Word("","",R.raw.dsc_off_indicator));

        words.add(new Word("","",R.raw.afs_off_indicator));
        words.add(new Word("","",R.raw.active_cruise_control_indicator));
        words.add(new Word("","",R.raw.air_filter_clogged_indicator));
        words.add(new Word("","",R.raw.all_wheel_drive_disabled_indicator));
        words.add(new Word("","",R.raw.all_wheel_lock));
        words.add(new Word("","",R.raw.all_wheel_drive_lock_indicator));
        words.add(new Word("","",R.raw.antilock_braking_system_trouble_light));
        words.add(new Word("","",R.raw.at_p_indicator));
        words.add(new Word("","",R.raw.blind_spot_warning_system_symbol));
        words.add(new Word("","",R.raw.auto_brake_hold_indicator));
        words.add(new Word("","",R.raw.brake_fluid_low));
        words.add(new Word("","",R.raw.automatic_headlamp_dimmer_indicator_symbol));
        words.add(new Word("","",R.raw.vehicle_stability_conrtol_off_indicator));
        words.add(new Word("","",R.raw.dsc_off_indicator));

        Word_Adaptor adaptor = new Word_Adaptor(getActivity(),words,R.color.primary_text);
        GridView grid = (GridView) rootView.findViewById(R.id.Grid);


        grid.setAdapter(adaptor);

        return rootView;
    }

}
