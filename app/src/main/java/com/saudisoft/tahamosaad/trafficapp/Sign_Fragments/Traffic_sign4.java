package com.saudisoft.tahamosaad.trafficapp.Sign_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.Word_Adaptor;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Traffic_sign4 extends Fragment {


    public Traffic_sign4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();





        words.add(new Word("",getString( R.string.lm_0 ),R.mipmap.lm_0));
        words.add(new Word("",getString( R.string.lm_1 ),R.mipmap.lm_1));
        words.add(new Word("",getString( R.string.lm_2 ),R.mipmap.lm_2));
        words.add(new Word("",getString( R.string.lm_3 ),R.mipmap.lm_3));
        words.add(new Word("",getString( R.string.lm_4 ),R.mipmap.lm_4));
        words.add(new Word("",getString( R.string.lm_5 ),R.mipmap.lm_5));
        words.add(new Word("",getString( R.string.lm_6 ),R.mipmap.lm_6));
        words.add(new Word("",getString( R.string.lm_7 ),R.mipmap.lm_7));
        words.add(new Word("",getString( R.string.lm_8 ),R.mipmap.lm_8));
        words.add(new Word("",getString( R.string.lm_9 ),R.mipmap.lm_9));
        words.add(new Word("",getString( R.string.lm_10 ),R.mipmap.lm_10));
        words.add(new Word("",getString( R.string.lm_11 ),R.mipmap.lm_11));
        words.add(new Word("",getString( R.string.lm_12 ),R.mipmap.lm_12));


        words.add(new Word("","",R.mipmap.l_1));
        words.add(new Word("","",R.mipmap.l_2));
        words.add(new Word("","",R.mipmap.l_3));
        words.add(new Word("","",R.mipmap.l_4));
        words.add(new Word("","",R.mipmap.l_5));
        words.add(new Word("","",R.mipmap.l_6));

        Word_Adaptor adaptor = new Word_Adaptor(getActivity(),words,R.color.Training);
        ListView list = (ListView) rootView.findViewById(R.id.list);


        list.setAdapter(adaptor);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Word word = words.get(position);
//
//
//                MediaPlayer mediaPlayer = MediaPlayer.create(Traffic_Training.this,word.getAudioResourseId());
//                mediaPlayer.start();
//            }
//        });

        return rootView;
    }

}
