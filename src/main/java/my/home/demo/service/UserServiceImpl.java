package my.home.demo.service;

import lombok.AllArgsConstructor;
import my.home.demo.dao.UserDao;
import my.home.demo.models.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;


    public Optional<User> getUserBuId(Long id) {
        return userDao.findById(id);
    }

}
