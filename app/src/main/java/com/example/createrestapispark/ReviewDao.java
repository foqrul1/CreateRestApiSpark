package com.example.createrestapispark;

import com.example.createrestapispark.exc.DaoException;

import java.util.List;

public interface ReviewDao {
    void add(Review review) throws DaoException;
    List<Review> findAll();

    List<Review> findByCourseID(int CourseID);

}
