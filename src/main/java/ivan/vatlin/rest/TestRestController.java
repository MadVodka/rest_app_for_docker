package ivan.vatlin.rest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class TestRestController {
    @Autowired
    private Logger logger;

    @GetMapping("message")
    public Map<String, String> getMessage() {
        return Collections.singletonMap("message", "Hello!");
    }

    @GetMapping("greetings")
    public Map<String, String[]> getGreetings() {
        String[] greetings = {"Good morning", "Good afternoon", "Good evening", "Hi", "Hello", "What's up!"};
        return Collections.singletonMap("greetings", greetings);
    }
}
