package com.saudisoft.tahamosaad.trafficapp.Sign_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.Icon_adaptor;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Traffic_Point extends Fragment {

    public Traffic_Point() {
        // Required empty public constructor

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("النقاط","مسمى المخالفة"));
        words.add(new Word(24,"قيادة المركبة تحت تأثير مسكر أو مخدر"));
        words.add(new Word(24,"التفحيط"));
        words.add(new Word(12,"تجاوز إشارة المرور الضوئية أثناء الضوء الأحمر"));
        words.add(new Word(12,"قيادة المركبة بالاتجاه المعاكس لحركة السير"));
        words.add(new Word(8,"المراوغة بسرعة بين المركبات على الطرق العامة"));
        words.add(new Word(8,"عدم التقيد بإشارة رجل الأمن اليدوية"));
        words.add(new Word(8,"قيادة المركبة بدون مكابح أو أنوار"));
        words.add(new Word(6,"عدم الوقوف تماماً عند إشارة قف"));
        words.add(new Word(6,"عدم مراعاة قواعد الأفضلية"));
        words.add(new Word(6,"تجاوز السرعة المحددة بأكثر من 25 كم في الساعة"));
        words.add(new Word(6,"عدم إعطاء الأفضلية للسيارات التي بداخل الدوار"));
        words.add(new Word(6,"التجاوز في المناطق التي يمنع التجاوز فيها"));
        words.add(new Word(4,"لوقوف على خطوط السكة الحديدية"));
        words.add(new Word(4,"تجاوز السرعة المحددة بمقدار لا يزيد عن 25 كم في الساعة"));
        words.add(new Word(4,"القيادة في مسارات غير مخصصة لذلك"));
        words.add(new Word(4,"تجاوز حافلات النقل المدرسي عند توقفها للتحميل والتنزيل"));
        words.add(new Word(4,"عدم تغطية وتربيط الحمولة المنقولة"));
        words.add(new Word(4,"إجراء أي تعديل أو أضافه على هيكل أو جسم المركبة بدون اتخاذ الإجراءات النظامية"));
        words.add(new Word(2,"عدم ربط حزام الأمان"));
        words.add(new Word(2,"استخدام الهاتف المحمول باليد أثناء القيادة"));
        words.add(new Word(2,"عدم ارتداء الخوذة أثناء قيادة الدراجات الآلية " ));
        Icon_adaptor adaptor = new Icon_adaptor(getActivity(),words,R.color.tan_background);
        ListView list = (ListView) rootView.findViewById(R.id.list);


        list.setAdapter(adaptor);
        return rootView;
    }


}
