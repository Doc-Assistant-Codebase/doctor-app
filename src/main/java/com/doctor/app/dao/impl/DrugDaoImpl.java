package com.doctor.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.doctor.app.dao.AbstractDao;
import com.doctor.app.dao.DrugDao;
import com.doctor.app.to.Drug;

@Repository
public class DrugDaoImpl extends AbstractDao<Long, Drug> implements DrugDao{

	@Override
	public List<Drug> getAllDrugs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDrugList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String sayHello() {
		return "Hello from DAO";
	}

}
