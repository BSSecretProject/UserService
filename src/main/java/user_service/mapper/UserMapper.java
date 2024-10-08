package user_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import user_service.dto.UserDto;
import user_service.entity.User;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}
