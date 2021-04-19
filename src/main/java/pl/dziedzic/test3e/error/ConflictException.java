package pl.dziedzic.test3e.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Cannot be divided by zero")
public class ConflictException extends RuntimeException {

}