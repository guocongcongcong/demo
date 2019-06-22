
package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.ConvertBeanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConvertBeanController {

    @RequestMapping("/convertBean")
    public String convertBean(){
        User user = new User(78, 26);
        Map<String,String> map = new HashMap<String,String>();
        try {
             map = ConvertBeanService.convertBean(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map.toString();
    }
}
