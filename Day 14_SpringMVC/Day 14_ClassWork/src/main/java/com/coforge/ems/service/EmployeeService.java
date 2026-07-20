package com.coforge.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.ems.model.Employee;

@Service
public class EmployeeService {
	private List<Employee> list = new ArrayList<>();

	public boolean createEmployee(Employee employee) {
		boolean status = list.add(employee);
		
		return status;
	}
	
public boolean updateEmployee(Employee employee) {
		
		boolean status = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEid() == employee.getEid()) {
				list.set(i, employee);
				return true;
			}
		}
		return status;
	}

public Employee findEmployee(int eid) {
	for (int i = 0; i < list.size(); i++) {
		Employee emp = list.get(i);
		if (emp.getEid() == eid) {
			return emp;
		}
	}

	return null;
}

public List<Employee> findALlEmployee() {
	 return list;
}

public boolean deleteEmployee(int eid) {

	for (int i = 0; i < list.size(); i++) {
		Employee emp = list.get(i);
		if (emp.getEid() == eid) {
			list.remove(i);
			return true;
		}
	}

	return false;
}
}
