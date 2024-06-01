package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ObjectInsideLinkedList {
    String name;
    double id;

    public ObjectInsideLinkedList(String name, double id) {
        this.name = name;
        this.id = id;
    }
}
