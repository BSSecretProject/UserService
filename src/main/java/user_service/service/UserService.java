package user_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import user_service.dto.UserDto;
import user_service.entity.User;
import user_service.mapper.UserMapper;
import user_service.repository.UserRepository;
import user_service.validation.UserValidator;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserValidator userValidator;
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    public UserDto createUser(UserDto userDto) {
        userValidator.validatePassword(userDto.getPassword());
        User user = userMapper.toUser(userDto);
        user.setActive(true);
        return userMapper.toUserDto(userRepository.save(user));
    }
}
