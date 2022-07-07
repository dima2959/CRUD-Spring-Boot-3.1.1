package org.dima2959.CRUD.Spring.Boot331.service;

import org.dima2959.CRUD.Spring.Boot331.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void removeUser(long id);
}
