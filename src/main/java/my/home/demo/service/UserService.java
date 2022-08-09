package my.home.demo.service;

import my.home.demo.models.entity.User;

import java.util.Optional;

public interface UserService {
     Optional<User> getUserBuId(Long id);
}
