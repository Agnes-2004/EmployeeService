package com.tns.employeeservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	//Get all the records from the table
	public void insertRecord(Employee employee)
	{
		repo.save(employee);
	}
	
	//Show all the records from the table in database
	public List<Employee> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Employee getEmployeeById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteEmployee(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateEmployee(Integer id,Employee updateEmployee)
	{
		Employee existingEmployee=repo.findById(id).orElse(null);
		if(existingEmployee!=null)
		{
			existingEmployee.setEmployeeid(updateEmployee.getEmployeeid());
			existingEmployee.setEmployeename(updateEmployee.getEmployeename());
			existingEmployee.setAddress(updateEmployee.getAddress());
			existingEmployee.setEmail(updateEmployee.getEmail());
			existingEmployee.setPassword(updateEmployee.getPassword());
			existingEmployee.setSalary(updateEmployee.getSalary());
			repo.save(existingEmployee);
		}
	}
	
	
}
