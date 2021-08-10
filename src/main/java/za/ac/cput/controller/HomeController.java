package za.ac.cput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorspace/api/v1/")
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Spring!";
    }

}
