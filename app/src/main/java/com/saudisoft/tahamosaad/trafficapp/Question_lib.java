package com.saudisoft.tahamosaad.trafficapp;

/**
 * Created by taha.mosaad on 02/01/2018.
 */

public class Question_lib  {


    int Q1_array[]={R.mipmap.g_1,R.mipmap.g_2,R.mipmap.g_3,R.mipmap.g_4,R.mipmap.g_5,
                    R.mipmap.g_6,R.mipmap.g_7,R.mipmap.g_8,R.mipmap.g_9,R.mipmap.g_10};

    int Q2_array[]={R.mipmap.r_1,R.mipmap.r_2,R.mipmap.r_3,R.mipmap.r_4,R.mipmap.r_5,
            R.mipmap.r_6,R.mipmap.r_7,R.mipmap.r_8,R.mipmap.r_9,R.mipmap.r_10};

//    private String mChoices [][] = {
//            {"Roots", "Stem", "Flower"},
//            {"Fruit", "Leaves", "Seeds"},
//            {"Bark", "Flower", "Roots"},
//            {"Flower", "Leaves", "Stem"}
//    };

    private int mChoices [][] = {
            {R.string.r_1,R.string.r_2, R.string.r_3},
            {R.string.r_4,R.string.r_5, R.string.r_2},
            {R.string.r_3,R.string.r_8, R.string.r_9},
            {R.string.r_10,R.string.r_11, R.string.r_4},
            {R.string.r_1,R.string.r_5, R.string.r_4},
            {R.string.r_10,R.string.r_6, R.string.r_7}
    };

    private int mCorrectAnswers[] = {R.string.r_1,R.string.r_2, R.string.r_3,R.string.r_4,R.string.r_5,R.string.r_6};

    public int getQuestion(int a) {
        int question = Q2_array[a];
        return question;
    }


    public int getChoice1(int a) {
        int choice0 = mChoices[a][0];
        return choice0;
    }


    public int getChoice2(int a) {
        int choice1 = mChoices[a][1];
        return choice1;
    }

    public int getChoice3(int a) {
        int choice2 = mChoices[a][2];
        return choice2;
    }

    public int getCorrectAnswer(int a) {
        int answer = mCorrectAnswers[a];
        return answer;
    }

public int gettotal (){
    int size = mChoices.length;
    return size;
}
}

