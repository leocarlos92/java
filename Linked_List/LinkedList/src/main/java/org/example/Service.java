package org.example;

import java.util.LinkedList;

public class Service {
    public static LinkedList insert(LinkedList list, ObjectInsideLinkedList data) {
        list.add(data);
        return list;
    }

    public static LinkedList insertByIndex(LinkedList list, int index, ObjectInsideLinkedList data) {
        list.add(index, data);
        return list;
    }

    public static ObjectInsideLinkedList get(LinkedList list, int index) {
        return (ObjectInsideLinkedList) list.get(index);
    }

    public static LinkedList removeByIndex(LinkedList list, int index) {
        list.remove(index);
        return list;
    }

    public static LinkedList removeByObject(LinkedList list, Object o) {
        list.remove(o);
        return list;
    }

    public static LinkedList updateByIndex(LinkedList list, int index) {
        ObjectInsideLinkedList objectInsideLinkedList = get(list, index);
        objectInsideLinkedList.name = "Name updated";
        objectInsideLinkedList.id = Math.random();

        list.add(index, objectInsideLinkedList);

        return list;
    }

    public static void printLinkedList (LinkedList list){
        
    }
}
