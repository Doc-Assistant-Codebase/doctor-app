package com.doctor.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<List<Drug>> getAllDrugs(@RequestParam(value = "form", defaultValue = "all") String form) {
    	List<Drug> drugs = null;
    	if(form.equalsIgnoreCase("all")){
    		drugs =  this.drugService.getAllDrugs();
    	} else {
    		drugs =  this.drugService.getDrugsByForm(form);
    	}
    	return new ResponseEntity<List<Drug>>(drugs, HttpStatus.OK);
    }
}
