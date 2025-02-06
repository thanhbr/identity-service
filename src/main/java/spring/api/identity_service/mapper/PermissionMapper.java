package spring.api.identity_service.mapper;

import org.mapstruct.Mapper;
import spring.api.identity_service.dto.request.PermissionRequest;
import spring.api.identity_service.dto.response.PermissionResponse;
import spring.api.identity_service.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
