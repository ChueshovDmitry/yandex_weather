package by.test.yandex_weather.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestControllerAdvice
public class CustomExceptionAdvice {

    @ExceptionHandler(RequestException.class)
    @ResponseStatus(NOT_FOUND)
    public ErrorMessage handleValidationException (RequestException requestException) {
        return ErrorMessage.builder()
                .message(requestException.getMessage())
                .status(NO_CONTENT)
                .timestamp(now())
                .build();
    }
}