package org.rashmi.assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rashmi.assignment.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Employee> getAllEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		return employeeList;
	}

	public Employee getEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, new Integer(id));
		return employee;
	}

	public Employee addEmployee(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(employee);
		return employee;
	}

	public void updateEmployee(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
	}

	public void deleteEmployee(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee p = (Employee) session.load(Employee.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
