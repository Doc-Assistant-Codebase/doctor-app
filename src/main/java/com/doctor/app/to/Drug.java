package com.doctor.app.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {
	@Id 
	private Long medicineId;
	private String drugForm;
	private String tradeName;
	private double strength;
	private double frequency;
	private double duration;
	private String instructions;
	
	public Drug() { }
	
	public Drug(Long medicineId, String drugForm, String tradeName, int strength, int frequency, int duration,
			String instructions) {
		super();
		this.medicineId = medicineId;
		this.drugForm = drugForm;
		this.tradeName = tradeName;
		this.strength = strength;
		this.frequency = frequency;
		this.duration = duration;
		this.instructions = instructions;
	}
	
	public Long getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}
	public String getDrugForm() {
		return drugForm;
	}
	public void setDrugForm(String drugForm) {
		this.drugForm = drugForm;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}	
}