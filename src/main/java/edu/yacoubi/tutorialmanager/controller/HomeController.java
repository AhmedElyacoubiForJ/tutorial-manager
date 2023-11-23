package edu.yacoubi.tutorialmanager.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Value("${tm.welcome.message: Spring \uD83E\uDD7E, default welcome message.}")
    private String welcomeMessage;

    @Value("${tm.about: keep in progress.}")
    private String about;

//    @GetMapping("/")
//    public String home() {
//        //return "hello please keep quiet (\uD83D\uDC49\uD83E\uDD2B\uD83D\uDC48), you're at home (\uD83E\uDD23). Thanks to Spring \uD83E\uDD7E";
//        return  welcomeMessage;
//    }

    @GetMapping("/")
    public Map<String,String> home2() {
        // output as json
        return  Map.of(
                "welcomeMessage",welcomeMessage,
                "about", about
        );
    }
}
