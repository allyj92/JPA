package jpabook.jpashop.controller;




import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("/form")
    public String formPage(Model model){
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute User user, Model model){
        model.addAttribute("submittedUser",user);
        return "form-result";
    }

    @Getter @Setter
    class User{
        private String name;
        private String email;
    }
}
