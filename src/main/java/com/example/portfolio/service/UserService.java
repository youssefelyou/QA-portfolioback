package com.example.portfolio.service;

import com.example.portfolio.bean.User;
import com.example.portfolio.dao.UserDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User save(User user ) {
        return userDao.save(user);
    }

    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
