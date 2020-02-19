package com.example.createrestapispark;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.createrestapispark.exc.DaoException;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql20CourseDao implements CourseDao {
    private final Sql2o sql2o;

    public Sql20CourseDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void add(Course course) throws DaoException {
        String sql = "INSERT INTO courses(name, url) VALUES (:name, :url)";
        try(Connection connection = sql2o.open()){
            int id = (int) connection.createQuery(sql)
                    .bind(course)
                    .executeUpdate()
                    .getKey();
        }catch (Sql2oException ex){
            throw new DaoException(ex, "Porblem adding course");
        }
    }

    @Override
    public List<Course> findAll() {
        return null;
    }
}
