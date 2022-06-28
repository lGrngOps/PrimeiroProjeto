package com.example.AgeProject.AgeProject.UserController;

import com.example.AgeProject.AgeProject.Idade;
import com.example.AgeProject.AgeProject.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private User user;

    @Autowired
    private Idade idade;

    @GetMapping
    public String usersForm(final Model model) {
        if (model.containsAttribute("user") == false){
            User user = new User();
            model.addAttribute("user", user);
        }
        return "userForm";
    }

    @PostMapping
    public String result(User user, Model model) {

        user = idade.idadeTeste(user);

        model.addAttribute("user", user);

        return "result";
    }
}