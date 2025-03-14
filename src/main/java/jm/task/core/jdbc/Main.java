package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        userDao.dropUsersTable();
        userDao.createUsersTable();
        userDao.saveUser("Kokonito", "Kika22rdo", (byte) 82);
        userDao.saveUser("Fetuchini", "Drozdilini", (byte) 5);
        List<User> users = userDao.getAllUsers();
        users.forEach(System.out::println);
        userDao.cleanUsersTable();
    }
}
