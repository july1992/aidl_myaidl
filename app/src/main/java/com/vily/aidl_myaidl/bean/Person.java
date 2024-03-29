package com.vily.aidl_myaidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chintan.desai on 29-01-2018.
 */
public class Person implements Parcelable {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
    }



    public void readFromParcel(Parcel reply) {
        this.name = reply.readString();
        this.age=reply.readInt();

    }



}
