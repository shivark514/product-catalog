package com.onimurasame.productcatalog.configuration;

import com.onimurasame.productcatalog.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CustomException.class})
    public ResponseEntity handleCustomException(CustomException e, WebRequest request) {
        return handleExceptionInternal(e, "This is an error message", null, HttpStatus.BAD_REQUEST, request);
    }

}
