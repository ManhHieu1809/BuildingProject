package com.demo.controllerAdvice;

import com.demo.model.ErrorResponeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = { ArithmeticException.class })
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            ArithmeticException ex, WebRequest request) {

        ErrorResponeDTO errorResponeDTO  = new ErrorResponeDTO();
        errorResponeDTO.setError(ex.getMessage());
        List<String> details = new ArrayList<>();
        details.add("so nguyen khong chia duoc cho khong");
        errorResponeDTO.setDetail(details);
        return new ResponseEntity<>(errorResponeDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
