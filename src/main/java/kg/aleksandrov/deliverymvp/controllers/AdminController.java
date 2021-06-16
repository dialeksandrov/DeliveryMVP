package kg.aleksandrov.deliverymvp.controllers;

import kg.aleksandrov.deliverymvp.models.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class AdminController {

    @GetMapping("/")
    public String showLogin(Admin admin){
        return "login";
    }

    @GetMapping("/login")
    public String SignIn(@ModelAttribute(name = "admin") Admin admin, Model model){
        String login = admin.getLogin();
        String password = admin.getPassword();

        if("admin".equals(login) && "admin".equals(password)){
            return "redirect:/orders/all";
        }
        return "login";
    }
}
