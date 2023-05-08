package com.prashant;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;

@Requires(notEnv = Environment.TEST)
@KafkaClient
public interface EmployeePublisher {

    @Topic("employee")
    Employee onboardEmployee(@KafkaKey String empId, Employee employee);
}
