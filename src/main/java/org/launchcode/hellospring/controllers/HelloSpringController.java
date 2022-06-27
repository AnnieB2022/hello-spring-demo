package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloSpringController {


   // Handles request at path /hello?name=LaunchCode -- DYNAMIC
    @RequestMapping (value = "hello", method= {RequestMethod.GET, RequestMethod.POST} )
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";

    }

    // Handles request at path /hello/LaunchCode -- DYNAMIC

    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model){
        String greeting2 = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting2);
        return "hello";

    }

    // Handles request at path /form -- DYNAMIC

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }


    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);

        return "hello-list";

    }
}
