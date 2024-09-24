package user_service.controller;

import io.swagger.annotations.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import user_service.dto.UserDto;
import user_service.service.UserService;


@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @ApiOperation(value = "Create new user")
    // TODO Путь вынеси в константу
    // TODO У тебя эндпоинт создания юзера лежит сейчас на домене. Это не очень информативно. Добавь для UserController'a свой префикс, по типу /users
    @PostMapping("createUser")
    public UserDto createUser(@Valid @RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
