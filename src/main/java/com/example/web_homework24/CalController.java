package com.example.web_homework24;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/calc")
public class CalController {

    @ResponseBody
    @RequestMapping("/sum1")
    public String sum_i(int a, int b){
        return "The answer is "+(a+b);
    }

    @RequestMapping("/sum12/{num1}/{num2}")
    public String sum_ii(@PathVariable int num1, @PathVariable int num2, Model model){
        model.addAttribute("num",num1+num2);
        return "answer_ii";
    }

    @RequestMapping(value="/aiii", method = GET)
    public String sum_iii_1(){
        return "sum_iii_get";
    }

    @ResponseBody
    @RequestMapping(value = "/aiii2", method = POST)
    public String sum_iii_2(int a, int b){
        return "The answer is "+(a+b);
    }
}
