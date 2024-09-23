package user_service.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import user_service.exeptions.DataValidationException;




@Component
@RequiredArgsConstructor
public class UserValidator {

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
        System.out.println("Password validation passed.");
    }
}