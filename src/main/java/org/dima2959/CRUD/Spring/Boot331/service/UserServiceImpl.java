package org.dima2959.CRUD.Spring.Boot331.service;

import org.dima2959.CRUD.Spring.Boot331.dao.UserDao;
import org.dima2959.CRUD.Spring.Boot331.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }
}
