package com.doctor.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.app.service.DrugService;

@RestController
public class DoctorAppController {
	
	@Autowired
	private DrugService drugService;
	
    @RequestMapping("/")
    public String index() {
        return drugService.sayHello();
    }
}
