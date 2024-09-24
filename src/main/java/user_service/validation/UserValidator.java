package user_service.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import user_service.exeptions.DataValidationException;




@Component
@RequiredArgsConstructor
// TODO Это можно сделать @UtilityClass и методы сделать статик
public class UserValidator {

    // TODO Я уверен, что есть какое-то элегантное решение с валидатором пароля, которое можно прикрутить на анотацию спринга
    // В целом это не плохо, но посмотри, пока проекты учебные, можно делать все как по кайфу))
    // Вот пример https://stackoverflow.com/questions/65400172/validating-password-and-confirmed-password-spring-boot
    public void validatePassword(String password) {
        if (!password.matches(".*[A-Z].*")) {
            throw new DataValidationException("Your password must contain at least 1 uppercase letter");
        }
        if (!password.matches(".*\\d.*")) {
            throw new DataValidationException("Password must contain at least 1 digit");
        }
        if (!password.matches(".*[!@#$%^&*()_+<,>./\"'}{;:№].*")) {
            throw new DataValidationException("Password must contain at least 1 special symbol");
        }
        if (!password.matches(".*[A-Za-z].*")) {  // Проверка на наличие английских букв
            throw new DataValidationException("Password must contain at least 1 English letter");
        }

        // TODO Ради всего святого, ломбок сюда, он легко подключается
        System.out.println("Password validation passed.");
    }
}