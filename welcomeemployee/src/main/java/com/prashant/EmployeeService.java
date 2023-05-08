package com.prashant;

import jakarta.inject.Singleton;

@Singleton
public class EmployeeService {

    void sendWelcomeLetter(Employee employee){
        System.out.println("Employee Consumed : " + employee.getName());
    }
}
