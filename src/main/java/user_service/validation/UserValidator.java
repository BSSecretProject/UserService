package user_service.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import user_service.exeptions.DataValidationExaption;
import user_service.repository.UserRepository;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserValidator {
    private final UserRepository userRepository;

    public void ValidateIfUserExistsById(UUID id) {
        if (!userRepository.existsById(id)) {
            throw new DataValidationExaption("User with id " + id + " does not exist");
        }
    }
}
