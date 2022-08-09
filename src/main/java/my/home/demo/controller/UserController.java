package my.home.demo.controller;

import lombok.AllArgsConstructor;
import my.home.demo.controller.util.ApiValidationUtils;
import my.home.demo.models.dto.UserDtoResponse;
import my.home.demo.models.entity.User;
import my.home.demo.models.mapper.UserMapper;
import my.home.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor

public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDtoResponse getUserById(@PathVariable("id") Long id) {
        Optional<User> optionalUser = service.getUserBuId(id);
        ApiValidationUtils.requireTrue(optionalUser.isPresent(), "There is no user with id=" + id);//TODO Добавить ControllerAdvice
        return mapper.toDto(optionalUser.get());
    }

}
