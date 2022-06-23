package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {


   // Handles request at path /hello?name=LaunchCode -- DYNAMIC
    @RequestMapping (value = "hello", method= {RequestMethod.GET, RequestMethod.POST} )
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, "+ name + "!";

    }

    // Handles request at path /hello/LaunchCode -- DYNAMIC

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name){
        return "Hello, "+ name + "!";

    }

    // Handles request at path /form -- DYNAMIC

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

}
