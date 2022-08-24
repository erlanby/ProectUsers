package Company.service.impl;

import Company.dao.UserDao;
import Company.model.User;
import Company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserDao userDao) {
    }


    @Override
    public void findById(List<User> users, int id) throws MyException {
        boolean a = yesOrNo(users, id);
        try {
            for (User user : users){
                if (user.getId() == id){
                    System.out.println(user);
                } else if(!a)  {
                    throw new MyException("Мындай id Жок базада");
                }
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteById(List<User> users, int id) throws MyException  {
        try {
            if (users.stream().filter(user -> user.getId() == id).findFirst().isEmpty()){

                throw new MyException("Мындай id жок");
            }
            users.removeIf(user -> user.getId() == id);
        }catch (MyException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void getAllUser(List<User> users) {
            users.forEach(System.out::println);
    }

    @Override
    public boolean yesOrNo(List<User> users, int id) {
        for (User user : users){
            if (user.getId() == id){
                return true;
            }
        }
        return false;
    }
}
