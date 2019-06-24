package com.example.android.miwok;

public class word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = -1;
    private int mAudioResourceId;

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public word(String defaultTranslation, String miwokTranslation, int AudioResourseId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourseId;
    }

    public word(String defaultTranslation, String miwokTranslation, int ImageId, int AudioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageId;
        mAudioResourceId = AudioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean HasImage(){
        if(mImageResourceId==-1)return false;
        else return true;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
