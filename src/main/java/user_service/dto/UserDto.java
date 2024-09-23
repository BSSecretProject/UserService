package user_service.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDto {

    private UUID id;
    @NotBlank(message = "Username can't be blank")
    @Size(min = 5, max = 50, message = "Username must be between 5 and 50 characters")
    private String username;

    @Email(message = "E-mail must match the pattern email@example.com")
    @NotBlank(message = "Email can't be blank")
    private String email;

    @Size(min = 8, message = "Password must be at least 8 characters long")
    @NotBlank(message = "Password can't be blank")
    private String password;

    @NotBlank(message = "Phone can't be blank")
    @Pattern(regexp = "^\\+\\d{11}$", message = "Phone number must be formatted (ex. +71234567890)")
    private String phoneNumber;

    private Boolean active;

    @NotNull(message = "CountryID can't be empty")
    @Positive(message = "CountryID can't be less than 1")
    private Long countryId;
}
