package com.LeaveManagement.Service;

import java.util.List;
import java.util.Optional;

import com.LeaveManagement.Model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> findAllEmployee();
	public Employee findEmployeeById(int emplid);
	public int leaveBalance(int emplid);
	public void updateLeaveBalance(int remainingLeaves, int emplid);
	public String findSupervisorNameByEmplid(int supervisorId);
	public String findLastEmplid();
}