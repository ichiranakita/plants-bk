package com.ichiranakita.plants;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ichiranakita on 10/7/17.
 */
@RestController
public class PlantsController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
