package com.wipro.hibernate.test;

import com.wipro.hibernate.entity.Employee;
import com.wipro.hibernate.dao.EmployeeDAO;

public class HibernateTest {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setDepartment("IT");
        employeeDAO.saveEmployee(employee);

        Employee retrievedEmployee = employeeDAO.getEmployee(employee.getId());
        System.out.println("Employee Retrieved: " + retrievedEmployee.getName() + ", " + retrievedEmployee.getDepartment());
    }
}
