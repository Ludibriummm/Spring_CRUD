package web.services;

import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    public void add(User user){
        userDao.add(user);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
    @Transactional
    public void removeUserById(int id){
        userDao.removeUserById(id);
    }
    @Transactional
    public void removeUser(User user){
        userDao.removeUser(user);
    }
    @Transactional
    public void removeAllUsers(){
        userDao.removeAllUsers();
    }
    @Transactional
    public void update(int id, User user) {
        userDao.update(id, user);
    }
}