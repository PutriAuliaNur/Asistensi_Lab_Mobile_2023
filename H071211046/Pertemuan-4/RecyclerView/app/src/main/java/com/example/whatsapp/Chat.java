package com.example.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Chat implements Parcelable {

    private String message;

    public Chat(String message){
        this.message =message;
    }

    public String getMessage(){
        return  message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    protected Chat(Parcel in) {
        message = in.readString();
    }

    public static final Creator<Chat> CREATOR = new Creator<Chat>() {
        @Override
        public Chat createFromParcel(Parcel in) {
            return new Chat(in);
        }

        @Override
        public Chat[] newArray(int size) {
            return new Chat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
    parcel.writeString(message);
    }
}
