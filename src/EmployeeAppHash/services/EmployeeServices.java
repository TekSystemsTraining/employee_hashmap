package EmployeeAppHash.services;

import java.util.HashMap;

import EmployeeAppHash.models.Employee;
import EmployeeAppHash.models.EmployeeI;

public class EmployeeServices implements EmployeeI {

	private HashMap<Integer, Employee> employees = new HashMap<>();

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashMap<Integer, Employee> employees) {
		this.employees = employees;
	}

}
