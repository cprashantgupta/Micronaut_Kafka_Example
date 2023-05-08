package com.prashant;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Post
    HttpResponse<Employee> createEmployee(String name){
        Employee employee = employeeService.onBoardEmployee(name);
        return HttpResponse.created(employee);
    }
}
