package com.example.fragmenttest.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Login implements Parcelable {
    String name, NIM;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.NIM);
    }

    public Login() {
    }

    protected Login(Parcel in) {
        this.name = in.readString();
        this.NIM = in.readString();
    }

    public static final Parcelable.Creator<Login> CREATOR = new Parcelable.Creator<Login>() {
        @Override
        public Login createFromParcel(Parcel source) {
            return new Login(source);
        }

        @Override
        public Login[] newArray(int size) {
            return new Login[size];
        }
    };
}
