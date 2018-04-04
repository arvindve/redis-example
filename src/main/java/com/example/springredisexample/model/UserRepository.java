package com.example.springredisexample.model;

import java.util.List;

public interface UserRepository {

    void save(User user);
    List<User> findAll();
    User findById();
    void update(User user);
    void delete(String id);

}
