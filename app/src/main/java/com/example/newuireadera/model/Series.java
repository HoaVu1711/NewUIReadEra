package com.example.newuireadera.model;

public class Series {
    private int mAvatar;
    private String mName;
    private String mCount;

    public Series(int mAvatar, String mName, String mCount) {
        this.mAvatar = mAvatar;
        this.mName = mName;
        this.mCount = mCount;
    }

    public int getAvatar() {
        return mAvatar;
    }

    public void setAvatar(int mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getCount() {
        return mCount;
    }

    public void setCount(String mCount) {
        this.mCount = mCount;
    }
}
