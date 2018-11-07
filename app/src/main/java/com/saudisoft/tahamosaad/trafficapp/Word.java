package com.saudisoft.tahamosaad.trafficapp;

/**
 * Created by taha.mosaad on 12/12/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMewordTranslation;
//    private int Iconresourceid=NO_IMAGE_PROVIDED;
    private int Imageresourceid = NO_IMAGE_PROVIDED;
    private int AudioResourseId ;
    private int GifResourseId ;
    private int mPoint;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String mewordTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMewordTranslation = mewordTranslation;

    }

    public Word(int Point,String Violation) {
        mPoint=Point;
        mMewordTranslation=Violation;

    }
    public Word(String defaultTranslation, String mewordTranslation, int imageresourceid) {
        mDefaultTranslation = defaultTranslation;
        mMewordTranslation = mewordTranslation;
        Imageresourceid = imageresourceid;

    }
    //for driving tips activity toshown share icons

//    public Word(String defaultTranslation, String mewordTranslation, int imageresourceid,int iconresourceid) {
//        mDefaultTranslation = defaultTranslation;
//        mMewordTranslation = mewordTranslation;
//        Imageresourceid = imageresourceid;
//        Iconresourceid=iconresourceid;
//    }
    public Word(String defaultTranslation, String mewordTranslation, int imageresourceid,int GIFResource) {
        mDefaultTranslation = defaultTranslation;
        mMewordTranslation = mewordTranslation;
        Imageresourceid = imageresourceid;
        GifResourseId = GIFResource;


    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Mechaincal word translation of the word.
     */
    public String getMewordTranslation() {
        return mMewordTranslation;
    }

    public int getImageresourceid() {
        return Imageresourceid;
    }

    public int getPoint() {
        return mPoint;
    }

    public String getViolationName(){
        return mMewordTranslation;
    }
//    public int getIconresourceid() {
//        return Iconresourceid;
//    }

    public int getAudioResourseId() {return AudioResourseId;}
    public int getGIFResourseId() {return GifResourseId;}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return Imageresourceid != NO_IMAGE_PROVIDED;
    }
//    public boolean hasIcon() {
//        return Iconresourceid != NO_IMAGE_PROVIDED;
//    }
}