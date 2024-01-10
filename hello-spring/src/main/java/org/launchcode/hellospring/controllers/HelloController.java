//package org.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//@RequestMapping("hello")
//public class HelloController {
//    //Handles requests at paths "/hello"
//
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello(){
////        return "Hello, Spring!";
////    }
//
//    @GetMapping("bye")
//    public String bye(){
//        return "Goodbye, Spring!";
//    }
//
//    //Handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST},value = "hello")
//    public String helloWithParam(@RequestParam String name){
//        return "Hello, " + name;
//    }
//
//    @GetMapping("form")
//    public String helloForm (){
//        return "<html>" +
//                "<body>" +
//                "<form action = 'hello' method = 'post' >" +
//                "<input type = 'text' name = 'name' >" +
//                "<input type = 'submit' value = 'Greet me!' >" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//
//}
//
