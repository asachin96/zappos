package Controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Restaurant greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Restaurant(counter.incrementAndGet(), "test");
    }
}