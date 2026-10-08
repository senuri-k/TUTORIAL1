package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;



@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running -" + LocalDate.now();
    }

   @GetMapping("/goodbye")
    public String goodbye(){return "Goodbye from Spring Boots!";}

    @GetMapping("/date")
    public String date(){return LocalDate.now().toString(); }


}
