package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Fedor", "Drozdov", (byte) 23);
        userService.saveUser("Brad", "Pitt", (byte) 56);
        userService.saveUser("Kirl", "Johanson", (byte) 35);
        userService.saveUser("Crocodilo", "Bombardilo", (byte) 5);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
