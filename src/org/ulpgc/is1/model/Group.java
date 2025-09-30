package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Group {
    private final String name;
    private ArrayList<Contact> contacts;

    public Group(String name, Contact contacts) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contacts) {
        contacts.add(contacts);
    }

    public void removeContact(Contact contacts) {
        contacts.remove(contacts);
    }

}