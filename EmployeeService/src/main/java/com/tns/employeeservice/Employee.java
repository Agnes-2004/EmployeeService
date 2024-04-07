package com.tns.employeeservice;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="employeeid")
	private int employeeid;
	
	@Column(name="employeename")
	private String employeename;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="salary")
	private double salary;
	
	//Generate getter setter
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//Generate Constructor -parameterized constructors
	public Employee(int employeeid, String employeename, String address, String email, String password, double salary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.address = address;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Generate toString()
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", salary=" + salary + "]";
	}
	
}


