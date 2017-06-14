package com.example.android.miwok;

/**
 * Created by sanjeev on 9/6/17.
 */

public class Word {
    private static final int NOIMAGE=-1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mimageId=NOIMAGE;
    private int maudio;

    public boolean hasImage()
    {
        return   mimageId != NOIMAGE;
    }


    public Word(String DefaultTranslation , String MiwokTranslation  , int audio)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        maudio=audio;

    }

    public Word(String DefaultTranslation , String MiwokTranslation , int ImageId , int audio)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mimageId=ImageId;
        maudio=audio;
    }

    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getImageId()
    {
        return mimageId;
    }

    public int getAudio()
    {
        return maudio;
    }
}
