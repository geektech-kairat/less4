package com.example.less4.data.model;

import com.google.gson.annotations.SerializedName;

public class FilmModel {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("date_start")
    private String dateStart;

    public FilmModel(String id, String name, String dateStart) {
        this.id = id;
        this.name = name;
        this.dateStart = dateStart;
    }

    @Override
    public String toString() {
        return "FilmModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateStart='" + dateStart + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }
}
