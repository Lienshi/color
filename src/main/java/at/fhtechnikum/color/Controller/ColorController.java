package at.fhtechnikum.color.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    @GetMapping("/complementary/{color}")
    String GetCompColor(@PathVariable String color){
        if(color.equals("red")){
            return "The complementary color of red is green";
        }
        if(color.equals("green")){
            return "The complementary color of green is red";
        }
        if(color.equals("orange")){
            return "The complementary color of orange is blue";
        }
        if(color.equals("blue")){
            return "The complementary color of blue is orange";
        }
        if(color.equals("yellow")){
            return "The complementary color of yellow is purple";
        }
        if(color.equals("purple")){
            return "The complementary color of purple is yellow";
        }
        return "choose a complimentary color";
    }
}
