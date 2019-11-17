package ivan.vatlin.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class TestRestController {
    private static final Logger logger = LoggerFactory.getLogger(TestRestController.class);

    @GetMapping("message")
    public Map<String, String> getMessage() {
        logger.info("Rest controller \"message\" is invoked");
        return Collections.singletonMap("message", "Hello!");
    }

    @GetMapping("greetings")
    public Map<String, String[]> getGreetings() {
        logger.info("Rest controller \"greetings\" is invoked");
        String[] greetings = {"Good morning", "Good afternoon", "Good evening", "Hi", "Hello", "What's up!"};
        return Collections.singletonMap("greetings", greetings);
    }
}
