package io.muenchendigital.digiwf.jms.integration.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ErrorHandler;

@Slf4j
public class DefaultErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
//        log.warn("In default jms error handler...");
//        log.error("Error Message : {}", t.getMessage());
    }
}
