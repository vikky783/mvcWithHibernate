package org.rashmi.assignment.service;

import java.util.List;

import org.rashmi.assignment.dao.EmployeeDAO;
import org.rashmi.assignment.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Transactional
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);

	}

	@Transactional
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}
}
