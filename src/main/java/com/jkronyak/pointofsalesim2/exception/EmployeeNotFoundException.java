package com.jkronyak.pointofsalesim2.exception;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends ResourceNotFoundException {
    @Serial
    private static final long serialVersionUID = 1L;
    public EmployeeNotFoundException(String message) { super(message); }
}
