package user_service.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import user_service.dto.UserDto;
import user_service.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-23T11:09:21+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.id( user.getId() );
        userDto.username( user.getUsername() );
        userDto.email( user.getEmail() );
        userDto.password( user.getPassword() );
        userDto.phoneNumber( user.getPhoneNumber() );
        userDto.active( user.getActive() );
        userDto.countryId( user.getCountryId() );

        return userDto.build();
    }

    @Override
    public User toUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userDto.getId() );
        user.username( userDto.getUsername() );
        user.password( userDto.getPassword() );
        user.email( userDto.getEmail() );
        user.phoneNumber( userDto.getPhoneNumber() );
        user.active( userDto.getActive() );
        user.countryId( userDto.getCountryId() );

        return user.build();
    }
}
