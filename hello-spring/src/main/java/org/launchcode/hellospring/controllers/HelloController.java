package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    //Handles requests at paths "/hello"

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("bye")
    @ResponseBody
    public String bye(){
        return "Goodbye, Spring!";
    }

    //Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST},value = "hello")
    public String helloWithParam(@RequestParam String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm (){
        return "FormExercise";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("LaunchCode");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }


}

