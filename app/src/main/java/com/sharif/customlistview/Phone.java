package com.sharif.customlistview;

public class Phone {
    String Name;
    String PhoneNumber;
    int Image;

    public Phone(String name, String phoneNumber, int image) {
        Name = name;
        PhoneNumber = phoneNumber;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
