package com.njust.facedetection;

import java.util.Date;
import java.util.UUID;

public class CapturePicture {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    public CapturePicture() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public  String getId(){
        return mTitle;
    }
    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
