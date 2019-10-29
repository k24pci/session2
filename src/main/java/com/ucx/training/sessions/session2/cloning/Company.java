package com.ucx.training.sessions.session2.cloning;

public class Company implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }

    @Override
    public Company clone()throws CloneNotSupportedException{
        Company company = (Company) super.clone(); //casting
        // Object obj = customer;
        return  company;
    }
}
