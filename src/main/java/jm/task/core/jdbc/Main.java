package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        userDao.setConnection(util.getConnection());
        userDao.createUsersTable();
        userDao.dropUsersTable();
    }
}
