package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
    @GetMapping(value = "/")
    ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name) {
        Student student = new Student("John", "Smith", "a@a.lv", "DP2-4");
        List<Student> students = new ArrayList<>();
        students.add(student);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("students", students);
        modelAndView.addObject("date", new Date().toString());
        return modelAndView;
    }
    @GetMapping(value = "/register")
    public ModelAndView test(@RequestParam HashMap<String, String> allParams, User user){

    if(allParams.containsKey("success"))
    {
        ModelAndView modelAndView = new ModelAndView("success");
        return modelAndView;
    }
    ModelAndView modelAndView = new ModelAndView("registration");
    return modelAndView;
    }


    @PostMapping(value = "/register")
    public String test1(@ModelAttribute("user") User user, BindingResult bindingResult){
        
        if (bindingResult.hasErrors()) {
            return "/register";
        }
        csv.addDataToCSV(user);
        return "redirect:/register?success";
    }
}

