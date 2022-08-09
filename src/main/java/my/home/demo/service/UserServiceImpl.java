package my.home.demo.service;

import lombok.AllArgsConstructor;
import my.home.demo.dao.UserDao;
import my.home.demo.models.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Transactional
    public Optional<User> getUserBuId(Long id) {
        return userDao.findById(id);
    }

}
