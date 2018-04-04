package com.example.springredisexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepository {


    private RedisTemplate<String, User> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public UserRepositoryImpl(RedisTemplate<String, User> redisTemplate, HashOperations hashOperations) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = hashOperations;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String id) {

    }
}
