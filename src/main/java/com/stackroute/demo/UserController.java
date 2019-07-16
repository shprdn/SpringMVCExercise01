package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class UserController {

    @Autowired
    User user;
    //mapping the request
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String display( Model m)
    {
       // User user = new User();
        user.setMsg("Welcome to Stackroute");
       //adding attribute to modal
        m.addAttribute("message",user.getMsg());
        return "index";
    }





}
