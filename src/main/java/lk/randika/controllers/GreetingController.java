package lk.randika.controllers;

import lk.randika.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Randika Lakmal on 1/21/2018.
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    @Autowired
    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }

}
