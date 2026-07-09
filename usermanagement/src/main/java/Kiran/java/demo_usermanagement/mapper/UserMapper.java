package Kiran.java.demo_usermanagement.mapper;


import Kiran.java.demo_usermanagement.dto.UserDTO;
import Kiran.java.demo_usermanagement.entity.User;
import org.springframework.stereotype.Component;

@Component
//@Component → Managed by Spring (can be injected anywhere)
public class UserMapper {

    public UserDTO toDTO( User user ) {
        return new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
    }
    //✅ Converts database object → API response
    //✅ Sends only required data
        public User toEntity(UserDTO userDTO){
            return new User(
                    userDTO.id(),
                    userDTO.firstName(),
                    userDTO.lastName(),
                    userDTO.email()

            );
//✅ Converts API input → database object
//✅ Prepares data for saving in DB
    }
}
// Client → Controller → DTO
//            ↓
//         Mapper
//            ↓
//          Entity → Repository → DB


// UserMapper is a Spring component used to convert between User entity and UserDTO.
// It helps maintain separation between the database layer and API layer by isolating conversion logic.
// This improves code reusability, readability, and maintainability.