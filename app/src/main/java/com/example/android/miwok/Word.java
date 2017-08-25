package com.example.android.miwok;

/**
 * Created by Rean on 8/22/2017.
 */

public class Word {

    private String mDefaultTranslation = "";
    private String mMiwokTranslation = "";
    private int mListImage = 0;

    public Word(String defaultTranslation, String miwokTranslation, int listImage) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mListImage = listImage;
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
}
