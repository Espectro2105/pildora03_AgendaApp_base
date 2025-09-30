package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getName();

    public abstract void add(Contact contacts);

    public abstract void remove(Contact contacts);
}