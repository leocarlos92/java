package br.com.javamagazine.example;

import java.util.List;

public class Contact {

    private int id;
    private String name;
    private List<Phones> phones;
    private List<Emails> emails;

    public Contact(int id, String name, List<Phones> phones, List<Emails> emails){
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.emails = emails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phones> getPhones() {
        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }

    public List<Emails> getEmails() {
        return emails;
    }

    public void setEmails(List<Emails> emails) {
        this.emails = emails;
    }
}
