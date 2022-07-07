package org.dima2959.CRUD.Spring.Boot331.dao;

import org.dima2959.CRUD.Spring.Boot331.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    @Transactional
    public User readUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    @Transactional
    public void removeUser(long id) {
        User user = readUser(id);
        entityManager.remove(user);
    }
}
