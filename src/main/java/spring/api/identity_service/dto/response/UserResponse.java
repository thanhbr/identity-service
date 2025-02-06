package spring.api.identity_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import spring.api.identity_service.entity.Role;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String username;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Set<Role> roles;
}
