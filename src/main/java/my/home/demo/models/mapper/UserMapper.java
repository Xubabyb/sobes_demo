package my.home.demo.models.mapper;


import my.home.demo.models.dto.UserDtoResponse;
import my.home.demo.models.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDtoResponse toDto(User user);
}
