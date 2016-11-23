package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> emps = new HashSet<Employee>();
		Employee e1 = new Employee(1,"a");
		Employee e2 = new Employee(1,"a");
		Employee e3 = new Employee(1,"c");
		emps.add(e1);
		
		emps.add(e2);
		
		emps.add(e3);
		Map<String,String> hm = new HashMap<String,String>();
		System.out.println();

	}

}

class Employee{
	private Integer id;
	private String name;
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
