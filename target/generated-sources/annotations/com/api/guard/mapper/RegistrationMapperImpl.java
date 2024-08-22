package com.api.guard.mapper;

import com.api.guard.dto.request.RegistrationCreateRequest;
import com.api.guard.dto.request.RegistrationUpdateRequest;
import com.api.guard.dto.response.RegistrationResponse;
import com.api.guard.entity.Registration;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class RegistrationMapperImpl implements RegistrationMapper {

    @Override
    public Registration toRegistration(RegistrationCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Registration.RegistrationBuilder registration = Registration.builder();

        registration.serviceId( request.getServiceId() );
        registration.customerId( request.getCustomerId() );
        registration.requirement( request.getRequirement() );
        registration.manQuantity( request.getManQuantity() );
        registration.womanQuantity( request.getWomanQuantity() );
        registration.status( request.getStatus() );
        registration.location( request.getLocation() );
        registration.interviewTime( request.getInterviewTime() );
        registration.interviewLocation( request.getInterviewLocation() );
        registration.createAt( request.getCreateAt() );
        registration.deleted( request.getDeleted() );

        return registration.build();
    }

    @Override
    public RegistrationResponse toRegistrationResponse(Registration user) {
        if ( user == null ) {
            return null;
        }

        RegistrationResponse.RegistrationResponseBuilder registrationResponse = RegistrationResponse.builder();

        registrationResponse.id( user.getId() );
        registrationResponse.serviceId( user.getServiceId() );
        registrationResponse.customerId( user.getCustomerId() );
        registrationResponse.requirement( user.getRequirement() );
        registrationResponse.manQuantity( user.getManQuantity() );
        registrationResponse.womanQuantity( user.getWomanQuantity() );
        registrationResponse.status( user.getStatus() );
        registrationResponse.location( user.getLocation() );
        registrationResponse.interviewTime( user.getInterviewTime() );
        registrationResponse.interviewLocation( user.getInterviewLocation() );
        registrationResponse.createAt( user.getCreateAt() );
        registrationResponse.deleted( user.getDeleted() );

        return registrationResponse.build();
    }

    @Override
    public void updatetoRegistration(Registration user, RegistrationUpdateRequest request) {
        if ( request == null ) {
            return;
        }

        user.setServiceId( request.getServiceId() );
        user.setCustomerId( request.getCustomerId() );
        user.setRequirement( request.getRequirement() );
        user.setManQuantity( request.getManQuantity() );
        user.setWomanQuantity( request.getWomanQuantity() );
        user.setStatus( request.getStatus() );
        user.setLocation( request.getLocation() );
        user.setInterviewTime( request.getInterviewTime() );
        user.setInterviewLocation( request.getInterviewLocation() );
        user.setCreateAt( request.getCreateAt() );
        user.setDeleted( request.getDeleted() );
    }
}
