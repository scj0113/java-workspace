package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;


public class EmployeeController {
	
	private Employee employee = new Employee();

		
	
	
	// 오버로딩 메서드명이 같아도 매개변수 개수나 타입이 다른경우 달라 사용 가능
	
	public void add(int empNo,String name, char gender, String phone) {
			
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);

		
		
	}
	

	
	public void add(int empNo,String name, char gender, String phone, String dept, int salary, double bonus) {
		
		
		this.add(empNo, name, gender, phone);
		
//		employee.setEmpNo(empNo);
//		employee.setName(name);
//		employee.setGender(gender);
//		employee.setPhone(phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
	
		
		
		
	
	}
	
	public void modify(String phone ) {
		
		
		employee.setPhone(phone);
	

}
	
	
	
	public void modify(int salary) {
		
		
		employee.setSalary(salary);
		

		
	}
	
	
	public void modify(double bonus) {
		
		
		
		employee.setBonus(bonus);
		

	
	}
	
	
	
	
	
	
	
	
	public Employee info() {	
		return employee;
	}
	
	
	
	
}
