package user_service.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import user_service.dto.UserDto;
import user_service.service.UserService;


@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
    @ApiOperation(value = "Create new user")
    @PostMapping
    public UserDto createUser(UserDto userDto) {
        return userDto;
    }

    public void ValidateUser(UserDto userDto) {

    }
}
