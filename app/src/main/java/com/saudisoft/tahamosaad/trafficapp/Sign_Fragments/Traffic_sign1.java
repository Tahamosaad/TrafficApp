package com.saudisoft.tahamosaad.trafficapp.Sign_Fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.saudisoft.tahamosaad.trafficapp.R;
import com.saudisoft.tahamosaad.trafficapp.View_adaptors.Word_Adaptor;
import com.saudisoft.tahamosaad.trafficapp.Word;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageButton;


public class Traffic_sign1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Traffic_sign1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Traffic_sign1.
     */
    // TODO: Rename and change types and number of parameters
    public static Traffic_sign1 newInstance(String param1, String param2) {
        Traffic_sign1 fragment = new Traffic_sign1();
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


    private void createAndShowDialog(int mresource)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        // Inflate and set the layout for the dialog
        View v = inflater.inflate( R.layout.popup_image, null );
        // Pass null as the parent view because its going in the dialog layout
        GifImageButton gib = new GifImageButton(getActivity());

        v.findViewById( R.id.gif_img );
        v.setBackgroundResource( mresource );
        builder.setView( v );

        // Add the buttons
        builder.setPositiveButton( R.string.ok_button, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        } );

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("يجب اعطاء الافضلية للمرور للقادم من اليمين او اليسار",getString( R.string.r_2 ),R.mipmap.r_2,R.mipmap.loading));
        words.add(new Word("يمنع تجاوز لسيارات النقل على الطريق",getString( R.string.r_10 ),R.mipmap.r_10,R.raw.nopass));
        words.add(new Word("السيارات لا يجوز لها أن تتخطى السيارات التى أمامها وذلك لطبيعة الطريق مثل وجود منحنيات ومرتفعات",
                getString( R.string.r_11 ),R.mipmap.r_11,R.raw.nopass));
        words.add(new Word("يمنع الالتفاف للخلف","ممنوع الالتفاف للخلف",R.mipmap.r_12));
        words.add(new Word("يمنع الاتجاه لليمين على الطريق","ممنوع الاتجاه لليمين",R.mipmap.r_13));
        words.add(new Word("","ممنوع الاتجاه الى اليسار",R.mipmap.r_38));
        words.add(new Word("تمنح السيارات القادمة من الجهة المقابلة الافضلية بالمرور","الافضلية للسيارت القادمة ",R.mipmap.r_14));
        words.add(new Word("علامة تدل على وجود منطقة جمارك لتحصيل الرسوم","جمارك",R.mipmap.r_15));
        words.add(new Word("علامة تنظيمية للوقوف","قف",R.mipmap.r_3));
        words.add(new Word("يمنع دخول هذا الطريق او المنطقة",getString( R.string.r_7 ),R.mipmap.r_7));
        words.add(new Word("يمنع دخول الدرجات",getString( R.string.r_6 ),R.mipmap.r_6));
        words.add(new Word("يمنع دخول الحافلات","ممنوع دخول الحافلات",R.mipmap.r_16));
        words.add(new Word("يمنع استعمال الة التنبيه بالمنطقة","ممنوع استعمال المنبه",R.mipmap.r_17));
        words.add(new Word("يمنع الوقوف او الانتظار بالمنطقة","ممنوع الوقوف والانتظار",R.mipmap.r_24));
        words.add(new Word("يمنع الانتظار بالمنطقة","ممنوع الانتظار",R.mipmap.r_25));
        words.add(new Word("","ممنوع دخول المقطورات",R.mipmap.r_26));
        words.add(new Word("يمنع دخول سيارات  النقل التى تزن اكثر من 3 طن","ممنوع دخول سيارات نقل البضائع",R.mipmap.r_27));
        words.add(new Word("","ممنوع دخول المركبات عدا الدرجات الالية",R.mipmap.r_28));
        words.add(new Word("","ممنوع دخول الدرجات الهوائية",R.mipmap.r_29));
        words.add(new Word("","ممنوع دخول مركبات الاشغال العامة",R.mipmap.r_30));
        words.add(new Word("","ممنوع دخول عربات البضائع المدفوعة باليد",R.mipmap.r_31));
        words.add(new Word("","ممنوع دخول عربات التى يقطرها حيوان",R.mipmap.r_32));
        words.add(new Word("","ممنوع دخول المشاة",R.mipmap.r_33));
        words.add(new Word("","ممنوع دخول المركبات والعربات",R.mipmap.r_34));
        words.add(new Word("","ممنوع دخول المركبات الالية",R.mipmap.r_35));
        words.add(new Word("يمنع دخول عربات بارتفاع اكثر من 3 م","اقصى ارتفاع",R.mipmap.r_36));
        words.add(new Word("يمنع دخول عربات بعرض اكثر من 3 متر ودائما تكون هذه العلامة قبل الانفاق والكبارى العلوية","اقصى عرض",R.mipmap.r_37));
        words.add(new Word("علامة تنظم مستوى اقصى سرعة للطريق","السرعة القصوى ",R.mipmap.r_1));
        words.add(new Word("","اقصى طول",R.mipmap.r_39));
        words.add(new Word("","اقصى وزن محورى",R.mipmap.r_40));
        words.add(new Word("","اقصى وزن",R.mipmap.r_41));
        words.add(new Word("لاتوجد نهاية ادنى للسرعة",getString( R.string.r_8 ),R.mipmap.r_8));
        words.add(new Word("لا يجب تدنى السرعة عن 35",getString( R.string.r_9 ),R.mipmap.r_9));
        words.add(new Word("","اتجاه السير الاجبارى الى الامام",R.mipmap.r_42));
        words.add(new Word("","اتجاه السير الاجبارى الى اليمين",R.mipmap.r_44));
        words.add(new Word("","اتجاه السير الاجبارى الى اليمين او اليسار",R.mipmap.r_45));
        words.add(new Word("","اتجاه السير الاجبارى لليسار",R.mipmap.r_46));
        words.add(new Word("","اتجاه السير الاجبارى الى الامام",R.mipmap.r_47));
        words.add(new Word("","اتجاه السير الاجبارى الى الامام او الالتفاف للخلف",R.mipmap.r_48));
        words.add(new Word("","اتجاه السير الاجبارى الالتفاف للخلف",R.mipmap.r_49));
        words.add(new Word("","اتجاه السير الاجبارى فى الدوار",R.mipmap.r_50));
        words.add(new Word("","اتجاه السير الاجبارى الى الامام او اليمين",R.mipmap.r_51));
        words.add(new Word("","اتجاه السير الاجبارى الى الامام او اليسار",R.mipmap.r_52));
        words.add(new Word("","اتجاه السير الاجبارى لليمين",R.mipmap.r_53));
        words.add(new Word("","مسار الحيوانات",R.mipmap.r_54));
        words.add(new Word("","مسار المشاة",R.mipmap.r_55));
        words.add(new Word("","مسار الدراجات الهوائية",R.mipmap.r_56));
        words.add(new Word("","اتجاه اجبارى الزم اليمين",R.mipmap.r_22));
        words.add(new Word("","اتجاه اجبارى الزم اليسار",R.mipmap.r_23));

        words.add(new Word("علامة تحذيرية تدل على",getString( R.string.r_4 ),R.mipmap.r_4));
        words.add(new Word("",getString( R.string.r_5 ),R.mipmap.r_5));
        words.add(new Word("","نهاية ممنوع التجاوز لسيارات النقل",R.mipmap.r_18));
        words.add(new Word("","نهاية ممنوع التجاوز",R.mipmap.r_19));
        words.add(new Word("","نهاية ممنوع حدود السرعة",R.mipmap.r_20));
        words.add(new Word("","نهاية منطقة الممنوعات",R.mipmap.r_21));

        final Word_Adaptor adaptor = new Word_Adaptor(getActivity(),words,R.color.Training);
        ListView list = (ListView) rootView.findViewById(R.id.list);


        list.setAdapter(adaptor);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Word ResourceID = words.get( position );
                int Resource= ResourceID.getGIFResourseId();
                createAndShowDialog(Resource);


//                MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(),word.getAudioResourseId());
//                mediaPlayer.start();
            }
        });

        return rootView;


    }







}
