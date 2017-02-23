package com.doctor.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.app.dao.DrugDao;
import com.doctor.app.service.DrugService;
import com.doctor.app.to.Drug;

@Service("drugService")
public class DrugServiceImpl implements DrugService {
	
	@Autowired
	private DrugDao drugDao;
	
	@Override
	public List<Drug> getAllDrugs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDrugList() {
		
		
	}
	
	@Override
	public String sayHello(){
		return drugDao.sayHello();
	}
}