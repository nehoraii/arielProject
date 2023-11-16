package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.server.userServer;
@Validated
@RestController
@RequestMapping("/con")
public class userController {
    @Autowired
    private userServer userServer;
    @GetMapping("/getAriel")
    //יצירת בקשה GET שמביאה את השם שהיא מקבלת בפונקציה במקרה הזה אתה אריאל
    public String getArielFn(){
        String name;
        name=userServer.getUserByUserName("Ariel");
        return name;
    }
}
