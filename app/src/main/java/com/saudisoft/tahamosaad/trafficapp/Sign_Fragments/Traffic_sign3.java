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
public class Traffic_sign3 extends Fragment {


    public Traffic_sign3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("علامة تحذيرية تدل على وجود مدرسة قريبة يجب الانتباه وتهدئة السرعة","معبر اطفال ",R.mipmap.w_23));
        words.add(new Word(" يوجد معبر للجمال يجب الانتباه وتهدئة السرعة","معبر جمال",R.mipmap.w_21));
        words.add(new Word("يوجد معبر للمشاة يجب الانتباه وتهدئة السرعة","معبر مشاة",R.mipmap.w_24));
        words.add(new Word("يوجد معبر للدرجات يجب الانتباه وتهدئة السرعة","معبر درجات",R.mipmap.w_22));
        words.add(new Word("يوجد معبر للحيوانات يجب الانتباه وتهدئة السرعة","معبر حيوانات",R.mipmap.w_28));
        words.add(new Word("يوجد طائرات تطير على مستوى طيران منخفض","طيران منخفض",R.mipmap.w_25));
        words.add(new Word("الطريق مجاور لمدرج طيران ولا تفاجأ بصوت أو منظر الطيارات أثناء صعودها أو هبوطها","مدرج طيران",R.mipmap.w_30));
        words.add(new Word("يوجد معبر رياح شديده","معبر رياح",R.mipmap.w_32));


        words.add(new Word("علامة تحذيرية تدل على انعطاف الطريق","منعطف لليمين",R.mipmap.w_3));
        words.add(new Word("علامة تحذيرية تدل على انعطاف الطريق بشدة","منعطف حاد لليمين",R.mipmap.w_1));
        words.add(new Word("علامة تحذيرية تدل على انعطاف الطريق لليسار","منعطف لليسار",R.mipmap.w_4));
        words.add(new Word("علامة تحذيرية تدل على انعطاف الطريق بشدة","منعطف حاد لليسار",R.mipmap.w_2));
        words.add(new Word("علامة تحذيرية تدل على","طريق متعرج لليمين",R.mipmap.w_5));
        words.add(new Word("علامة تحذيرية تدل على","طريق متعرج لليسار",R.mipmap.w_6));
        words.add(new Word("يجب الحذر وتهدئة السرعة والالتزام بالحارة اليمنى من الطريق","الطريق يوجد به منحنيان وأولهما لجهة اليمين ",R.mipmap.w_7));
        words.add(new Word("يجب الحذر وتهدئة السرعة والالتزام بالحارة اليسرى من الطريق","الطريق يوجد به منحنيان",R.mipmap.w_8));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_9));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_10));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_16));

        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_13));
        words.add(new Word("علامة تحذيرية تدل على","سلسلة مطبات",R.mipmap.w_44));
        words.add(new Word("علامة تحذيرية تدل على","طريق غير مستوى",R.mipmap.w_14));
        words.add(new Word("علامة تحذيرية تدل على وجود منطقة منخفضة على الطريق","منخفض ",R.mipmap.w_20));

        words.add(new Word("علامة تحذيرية تدل على","صعود",R.mipmap.w_11));
        words.add(new Word("علامة تحذيرية تدل على","نزول",R.mipmap.w_12));

        words.add(new Word("علامة تحذيرية تدل على وجود مطب","كتف منخفض",R.mipmap.w_40));
        words.add(new Word("يوجد حصى متطايرة بالطريق يجد غلق نوافذ السيارة","حصى متناثرة",R.mipmap.w_18));
        words.add(new Word("الطريق زلق يجب الحذر وتهدئة السرعة","طريق زلق",R.mipmap.w_19));
        words.add(new Word("يوجد محطة اطفاء قريبة","محطة اطفاء",R.mipmap.w_46));
        words.add(new Word("علامة تحذيرية تدل على اقصى ارتفاع وهو 3.7 متر","اقصى ارتفاع",R.mipmap.w_47));
        words.add(new Word("علامة تحذيرية تدل على وجود نفق","نفق",R.mipmap.w_37));
        words.add(new Word("علامة تحذيرية تدل على نهاية حافة رصيف بحرى او نهرى","الطريق يتجه لنهاية حافة رصيف",R.mipmap.w_15));
        words.add(new Word("علامة تحذيرية تدل على وجود منطقة جبلية","صخور متساقطة",R.mipmap.w_17));

        words.add(new Word("علامة تحذيرية تدل على وجود مطب","اشارة ضوئية",R.mipmap.w_26));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","اشارة ضوئية",R.mipmap.w_27));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_29));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_31));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_33));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_34));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_35));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_36));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_38));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_39));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_41));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_42));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_43));
        words.add(new Word("علامة تحذيرية تدل على وجود مطب","انتبه",R.mipmap.w_45));

        words.add(new Word("علامة تحذيرية تدل على وجود مطب","مطب صناعى",R.mipmap.w_48));
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
