package com.ctech.shockman.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    private Date mDate;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();

    }
}
