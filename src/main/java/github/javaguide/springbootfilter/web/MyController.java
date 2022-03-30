package github.javaguide.springbootfilter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String getHello(@RequestParam String key) throws InterruptedException {
        Thread.sleep(1000);
        return "Hello";
    }
}