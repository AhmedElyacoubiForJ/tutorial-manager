package edu.yacoubi.tutorialmanager.controller;

import edu.yacoubi.tutorialmanager.config.ContentTutorialProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

 /*   @Value("${ct.welcome.message: Spring \uD83E\uDD7E, default welcome message.}")
    private String welcomeMessage;

    @Value("${ct.about: keep in progress.}")
    private String about;*/

//    @GetMapping("/")
//    public String home() {
//        //return "hello please keep quiet (\uD83D\uDC49\uD83E\uDD2B\uD83D\uDC48), you're at home (\uD83E\uDD23). Thanks to Spring \uD83E\uDD7E";
//        return  welcomeMessage;
//    }

//    @GetMapping("/")
//    public Map<String,String> home() {
//        // output as json
//        return  Map.of(
//                "welcomeMessage",welcomeMessage,
//                "about", about
//        );
//    }

    private final ContentTutorialProperties contentTutorialProperties;

    public HomeController(ContentTutorialProperties contentTutorialProperties) {
        this.contentTutorialProperties = contentTutorialProperties;
    }

    @GetMapping("/")
    public ContentTutorialProperties home() {
        return contentTutorialProperties;
    }
}
