package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
    //calling because index and viewpage are in the same folder web-inf
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @Autowired
    private User user;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String enterDetails(@RequestParam("username") String name, @RequestParam("password") String pass, Model m)
    {
        //setting the name and password of user
        user.setName(name);
        user.setPassword(pass);
        // getting name from user and printing it
        String msg = "Welcome "+user.getName()+" to Stackroute";
        m.addAttribute("msg",msg);
        return "viewpage";
    }

}
