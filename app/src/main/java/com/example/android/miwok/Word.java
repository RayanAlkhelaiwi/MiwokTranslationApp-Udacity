package com.example.android.miwok;

/**
 * Created by Rean on 8/22/2017.
 */

public class Word {

    private final int NO_IMAGE = -1;
    private String mDefaultTranslation = "";
    private String mMiwokTranslation = "";
    private int mListAudio = 0;
    private int mListImage = 0;

    public Word(String defaultTranslation, String miwokTranslation, int listAudio) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mListAudio = listAudio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int listImage, int listAudio) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mListImage = listImage;
        mListAudio = listAudio;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getListImage() {
        return mListImage;
    }

    public int getListAudio() {
        return mListAudio;
    }

    public boolean hasImage() {
        return mListImage != NO_IMAGE;
    }
}
