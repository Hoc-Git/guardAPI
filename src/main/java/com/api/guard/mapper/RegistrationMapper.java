package com.api.guard.mapper;

import com.api.guard.dto.request.RegistrationCreateRequest;
import com.api.guard.dto.request.RegistrationUpdateRequest;
import com.api.guard.dto.response.RegistrationResponse;
import com.api.guard.entity.Registration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {
    Registration toRegistration(RegistrationCreateRequest request);

    RegistrationResponse toRegistrationResponse (Registration user);

    void updatetoRegistration(@MappingTarget Registration user, RegistrationUpdateRequest
            request);
}
