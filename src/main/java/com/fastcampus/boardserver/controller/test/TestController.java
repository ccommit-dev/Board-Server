package com.fastcampus.boardserver.controller.test;

import com.fastcampus.boardserver.exception.BoardServerException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class TestController {
    @GetMapping("log-test")
    public void logTest() {
        log.fatal("FATAL");
        log.error("ERROR");
        log.warn("WARN");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");
    }

    @GetMapping("exception-test")
    public void exceptionTest() {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new BoardServerException(HttpStatus.OK, e.getMessage());
        }
    }
}
