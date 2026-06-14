package chris.week4.controller;

import chris.week4.dto.LoginRequest;
import chris.week4.dto.SignupRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        return "회원가입 성공";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return "로그인 성공";
    }
}
