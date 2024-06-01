package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    String name;
    Integer salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary =salary;
    }
}
