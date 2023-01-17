package web.services;

import web.dao.UserDaoImpl;
import web.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDaoImpl userDaoImpl;
    @Autowired
    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }
    public void add(User user){
        userDaoImpl.add(user);
    }

    public List<User> getAllUsers(){
        return userDaoImpl.getAllUsers();
    }

    public User getUserById(int id) {
        return userDaoImpl.getUserById(id);
    }

    public void removeUserById(int id){
        userDaoImpl.removeUserById(id);
    }

    public void removeUser(User user){
        userDaoImpl.removeUser(user);
    }

    public void removeAllUsers(){
        userDaoImpl.removeAllUsers();
    }
    public void update(int id, User user) {
        userDaoImpl.update(id, user);
    }
}