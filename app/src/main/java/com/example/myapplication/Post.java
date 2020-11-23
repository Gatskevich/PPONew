package com.example.myapplication;
import com.google.gson.annotations.SerializedName;
public class Post {
    private String name;
    private String surname;
    private String grup;
    @SerializedName("body")
    private String text;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGrup() {
        return grup;
    }
    public String getText() {
        return text;
    }
}
