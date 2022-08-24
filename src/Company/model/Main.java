package Company.model;

import Company.dao.UserDao;
import Company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Aida", 21, Gender.WOMAN));
        users.add(new User(2, "Timurlan", 24, Gender.MAN));
        users.add(new User(3, "Elnura", 20, Gender.WOMAN));

        UserDao userDao = new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl(userDao);

        userService.findById(users, 1);

        userService.getAllUser(users);

        userService.deleteById(users, 2);

        userService.getAllUser(users);

        
    }
}