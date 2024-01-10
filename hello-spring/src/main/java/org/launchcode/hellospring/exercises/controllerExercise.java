package org.launchcode.hellospring.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class controllerExercise {

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='greet' method='post'>" +
                "Name: <input type='text' name='name'><br>" +
                "Language: " +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='italian'>Italian</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='german'>German</option>" +
                "</select><br>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("greet")
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);
    }

    public static String createMessage(String name, String language) {
        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello";
        } else if (language.equals("french")) {
            greeting = "Bonjour";
        } else if (language.equals("italian")) {
            greeting = "Bonjourno";
        } else if (language.equals("spanish")) {
            greeting = "Hola";
        } else if (language.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + name;
    }
}
