package com.coffe.FirstSpringWebApp.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//the person in the server that handel the request
//this one is controller : do a job
@RestController
//for transfer the data
//@RestController
public class HomeController {
    //im looking for the body means data not the page
    @RequestMapping("/")
    public String greet(){
        return "Aslema";
    }
}
