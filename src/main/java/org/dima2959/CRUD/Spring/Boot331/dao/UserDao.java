package org.dima2959.CRUD.Spring.Boot331.dao;

import org.dima2959.CRUD.Spring.Boot331.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User readUser(long id);

    void updateUser(User user);

    void removeUser(long id);
}
