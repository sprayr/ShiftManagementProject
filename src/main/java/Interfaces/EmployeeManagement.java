package Interfaces;

import java.util.List;

import Employee.Employee;

public interface EmployeeManagement {
	
	public boolean addEmployee(Employee employee, String password);
	public boolean removeEmployee(Employee employee);
	public Employee getEmployeeDetails(String username);
	public boolean changePassword(Employee employee ,String oldPassword, String newPassword);
	public Employee findEmployee(int employeeID);
	public List<Employee> getAllEmployees();
	
}
