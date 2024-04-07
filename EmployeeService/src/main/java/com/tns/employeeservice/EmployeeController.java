package com.tns.employeeservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employeeservice")
	public void add(@RequestBody Employee employee)
	{
		service.insertRecord(employee);
	}
	
	@GetMapping("/employeeservice")
	public List<Employee> ShowAll()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/employeeservice/{id}")
	public Employee getEmployeeById(@PathVariable Integer id)
	{
		return service.getEmployeeById(id);
	}
	
	@DeleteMapping("/employeeservice/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		service.deleteEmployee(id);
	}
	
	@PutMapping("/employeeservice/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable Integer id,@RequestBody Employee updatedEmployee)
	{
		service.updateEmployee(id,updatedEmployee);
		return ResponseEntity.ok("Employee updated Successfully");
	}

}
