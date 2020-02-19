package com.example.createrestapispark;

import com.example.createrestapispark.exc.DaoException;

import java.util.List;

public interface CourseDao {
    void add(Course course) throws DaoException;
    List<Course> findAll();
}
