package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private Connection connection;
    public UserDaoJDBCImpl() {

    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void createUsersTable() {
        String sql = "CREATE TABLE users (id INT AUTO_INCREMENT UNIQUE, name VARCHAR(255) NOT NULL, lastname VARCHAR(255) NOT NULL, age INT)";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void dropUsersTable() {
        String sql = "DROP TABLE users";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
