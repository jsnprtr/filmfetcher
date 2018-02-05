package uk.co.jasonporter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason Porter, 05/02/2018
 */
@RestController
public class HelloWorldController {

    @RequestMapping(path = {"/"})
    public static String homePage(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello " + name + "!";
    }
}
