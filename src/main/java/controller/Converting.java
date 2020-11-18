package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converting {
    @GetMapping("/converting")
    public String convert(){
        return "index";
    }
    @PostMapping("/test")
    public String indexPost(@RequestParam Double usd, Model model){
        int vnd = (int) (23000 * usd);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
