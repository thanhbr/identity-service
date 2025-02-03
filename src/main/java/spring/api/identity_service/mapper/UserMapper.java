package spring.api.identity_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import spring.api.identity_service.dto.request.UserCreationRequest;
import spring.api.identity_service.dto.request.UserUpdateRequest;
import spring.api.identity_service.dto.response.UserResponse;
import spring.api.identity_service.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User addUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

//    @Mapping(target = "password", ignore = true)
    UserResponse toUserResponse(User user);
}
