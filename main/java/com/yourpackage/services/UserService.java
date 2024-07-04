package com.yourpackage.services;

import com.yourpackage.dao.UserDAO;
import com.yourpackage.entities.User;
import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
