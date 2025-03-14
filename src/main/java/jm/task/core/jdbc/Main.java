package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Fedor", "Drozdov", (byte) 23);
        userService.saveUser("Brad", "Pitt", (byte) 56);
        userService.saveUser("Kirl", "Johanson", (byte) 35);
        userService.saveUser("Crocodilo", "Bombardilo", (byte) 5);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        util.closeConnection();
    }
}
