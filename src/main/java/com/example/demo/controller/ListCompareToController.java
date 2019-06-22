package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RestController
public class ListCompareToController {

    @RequestMapping("/listCompare")
    public String getCompareResult(){
        //return getSimpleList();
        return getUserList();
    }


    private String getSimpleList(){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(2);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        System.out.println(nums.toString());
        Collections.sort(nums);
        System.out.println(nums.toString());
        return nums.toString();
    }

    private String getUserList(){
        List<User> users = new ArrayList<User>();
        users.add(new User(78, 26));
        users.add(new User(67, 23));
        users.add(new User(34, 56));
        users.add(new User(55, 23));
        Collections.sort(users);
        for(User user : users){
            System.out.println(user.getScore() + "," + user.getAge());
        }
        return users.toString();
    }
}
