package com.bil372.bil372.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DenemeController {

    @RequestMapping("/")
    public String welcome() {
        return "homepage";
    }




}