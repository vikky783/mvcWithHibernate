package org.vikky.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vikky.assignment.dao.EmployeeDAO;
import org.vikky.assignment.model.Employee;

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
