package com.example.springsecurityjpa;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    //We have three api's

    @GetMapping("/")  /*First api is mapped to root url and intend to accessible to everybody*/
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    // we have /user api which we want to hide behind the authentication wall before they access it
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    // someone who has admin role can acsess it
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
