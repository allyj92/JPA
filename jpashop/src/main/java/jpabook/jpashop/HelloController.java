package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","타임리프 연습");
        return "hello";
    }

    @GetMapping("/users")
    public String users(Model model){
        List<String> userList = Arrays.asList("홍길동","김영희","이철수");
        model.addAttribute("users",userList);
        return "users";
    }



}
