package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    String name;

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String doctor (@PathVariable("id") int doctorUrl) {
        switch (doctorUrl) {
            case 1: name = "William Hartnell";
            break;
            case 10: name = "David Tennant";
            break;
            case 13: name = "Jodie Whittaker";
            break;
            default: name="Not Doctor!!!";
        }
        return  "<h2>Doctor</h2>" + name;
    }
}
