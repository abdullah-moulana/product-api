package uk.ac.westminster.product_api;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
        public class HelloController {
          @GetMapping("/hello")
          public String hello(){
              return "Hello World";
          }

          @GetMapping("/status")
          public String status(){
          return "API-Running Successfully";}
}

