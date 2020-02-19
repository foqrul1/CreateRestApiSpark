package com.example.createrestapispark;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

public class Course {
    private int id;
    private String Name;
    private String url;

    public Course(int id, String name, String url) {
        this.id = id;
        Name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id &&
                Name.equals(course.Name) &&
                url.equals(course.url);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(id, Name, url);
    }
}
