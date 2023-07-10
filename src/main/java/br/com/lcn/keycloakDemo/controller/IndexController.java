package br.com.lcn.keycloakDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("public")
    public String controllerPublic() {
        return "Hello World public";
    }

    @GetMapping("logged")
    public String controllerLogged() {
        return "Hello World User Logged";
    }

    @GetMapping("admin-user")
    public String controllerAdminUser() {
        return "Hello World User Admin";
    }

    @GetMapping("logged-admin")
    public String controllerLoggedAndAdmin() {
        return "Hello World Role User and Admin";
    }
}
