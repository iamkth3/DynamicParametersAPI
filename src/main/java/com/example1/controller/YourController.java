package com.example1.controller;

//YourController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example1.service.YourService;

@Controller
public class YourController {

 @Autowired
 private YourService yourService;

 @GetMapping("/api/data")
 public String handleDynamicParameters(
         @RequestParam(name = "param1", required = false) String param1,
         @RequestParam(name = "param2", required = false) String param2,
         @RequestParam(name = "param3", required = false) String param3,
         Model model) {

     String result = yourService.processDynamicParameters(param1, param2, param3);
     model.addAttribute("result", result);

     return "result";
 }
}

