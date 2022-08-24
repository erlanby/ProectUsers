package Company.service;

import Company.dao.UserDao;
import Company.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    void findById(List<User> users, int id);
    void deleteById(List<User> users, int id);
    void getAllUser(List<User> users);

    boolean yesOrNo (List<User> users, int id);


}
