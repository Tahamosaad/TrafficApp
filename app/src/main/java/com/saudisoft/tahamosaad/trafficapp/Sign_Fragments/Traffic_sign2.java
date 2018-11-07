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


public class Traffic_sign2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public Traffic_sign2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Traffic_sign2.
     */
    // TODO: Rename and change types and number of parameters
    public static Traffic_sign2 newInstance(String param1, String param2) {
        Traffic_sign2 fragment = new Traffic_sign2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("علامة ارشادية تدل على","طريق ثانوى",R.mipmap.g_1));
        words.add(new Word("علامة ارشادية تدل على","طريق رئيسى",R.mipmap.g_2));
        words.add(new Word("علامة ارشادية تدل على","طريق فرعى",R.mipmap.g_3));
        words.add(new Word("علامة ارشادية تدل على","العلامة الدالة لمكة المكرمة",R.mipmap.g_4));


        words.add(new Word("علامة ارشادية تدل على","اتجاه الشرق",R.mipmap.g_5));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_6));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_7));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_8));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_9));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_10));

        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_11));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_12));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_13));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_14));

        words.add(new Word("ععلامة ارشادية تدل على","",R.mipmap.g_15));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_16));

        words.add(new Word("علامة ارشادية تدل على ","",R.mipmap.g_17));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_3));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_18));
        words.add(new Word("علامة ارشادية تدل على ","",R.mipmap.g_19));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_20));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_21));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_22));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_23));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_24));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_25));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_26));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_27));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_28));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_29));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_30));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_31));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_32));
        words.add(new Word("علامة ارشادية تدل على","",R.mipmap.g_33));

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
