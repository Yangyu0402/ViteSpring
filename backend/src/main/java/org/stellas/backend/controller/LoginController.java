package org.stellas.backend.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stellas.backend.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        if ("admin".equals(request.getUsername()) && "123456".equals(request.getPassword())) {
            return ResponseEntity.ok(new LoginResponse(true, "登录成功！"));
        } else {
            return ResponseEntity.ok(new LoginResponse(false, "用户名或密码错误。"));
        }
    }

    @Setter
    @Getter
    public static class LoginRequest {
        private String username;
        private String password;
    }


    @Setter
    @Getter
    public static class LoginResponse {
        private boolean success;
        private String message;

        public LoginResponse(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

    }

}
