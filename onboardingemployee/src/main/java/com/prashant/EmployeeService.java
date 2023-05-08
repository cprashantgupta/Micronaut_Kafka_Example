package com.prashant;

import jakarta.inject.Singleton;

@Singleton
public class EmployeeService {

    private final EmployeePublisher employeePublisher;

    public EmployeeService(EmployeePublisher employeePublisher) {
        this.employeePublisher = employeePublisher;
    }

    Employee onBoardEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setId(100L);

        //Produce Kafka Message for Employee.
        employeePublisher.onboardEmployee("100", employee);

        return employee;
    }
}
