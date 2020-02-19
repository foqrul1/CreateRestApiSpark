package com.example.createrestapispark;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

public class Review {
    private int id;
    private int courseID;
    private int rating;
    private String comment;

    public Review(int id, int courseID, int rating, String comment) {
        this.id = id;
        this.courseID = courseID;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id &&
                courseID == review.courseID &&
                rating == review.rating &&
                Objects.equals(comment, review.comment);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(id, courseID, rating, comment);
    }
}
