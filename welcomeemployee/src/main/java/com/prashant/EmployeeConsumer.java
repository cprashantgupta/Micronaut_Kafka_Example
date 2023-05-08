package com.prashant;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;

@Requires(notEnv = Environment.TEST)
@KafkaListener
public class EmployeeConsumer {

    private final EmployeeService employeeService;

    public EmployeeConsumer(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Topic("employee")
    public void onboardEmployee(@KafkaKey String empId, Employee employee){
        employeeService.sendWelcomeLetter(employee);
    }
}
