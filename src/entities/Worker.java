package entities;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	public Worker() {
		
	}
	
	public Worker(String name, Double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		
	}
	
	public void removeContract(HourContract contract) {
		
		
	}
	
	public double income(Integer year, Integer month) {
		return 
	}	
	

}
