package com.spring.jpa.projections.model;

import org.springframework.beans.factory.annotation.Value;

public interface UserDto {

     int getId();
     String getFirstName();
     String getLastName();
     @Value("#{target.firstName + ' ' + target.lastName}")// bu target alanı repository'de çağrılan entity nesnesidir.
     String getFullName();

}
