package service;

import dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import model.User;

public class UserService {
    private UserDao userDao;
    
    public UserService() {
        userDao = new UserDao();
    }
    
    public List<User> getAllUsers() throws SQLException {
        return userDao.getAllUsers();
    }
}
