package com.doctor.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.app.service.DrugService;
import com.doctor.app.to.Drug;

@RestController
public class DoctorAppController {
	
	@Autowired
	private DrugService drugService;
	
    @RequestMapping("/")
    public String index() {
        return drugService.sayHello();
    }
    
    @RequestMapping("/updateDrugs")
    public String updateDrugs() {
        return this.drugService.updateDrugList();
    }
    
    @RequestMapping("/drugs")
    public ResponseEntity<List<Drug>> getAllDrugs() {
    	List<Drug> drugs =  this.drugService.getAllDrugs();
    	return new ResponseEntity<List<Drug>>(drugs, HttpStatus.OK);
    }
}
