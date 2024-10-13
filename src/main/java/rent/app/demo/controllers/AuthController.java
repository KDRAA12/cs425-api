package rent.app.demo.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rent.app.demo.payloads.LoginPayload;
import rent.app.demo.payloads.RegisterPayload;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(
    @RequestBody LoginPayload loginPayload){
        return "Login successful";
    }

    @PostMapping("/register")
    public String register(
    @RequestBody RegisterPayload registerPayload){
        return "Register successful";
    }
}
