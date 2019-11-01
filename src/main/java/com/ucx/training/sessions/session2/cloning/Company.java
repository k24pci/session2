package com.ucx.training.sessions.session2.cloning;

public class Company implements Cloneable{
    private String name;

<<<<<<< HEAD
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Company(String name){
=======
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb
        this.name = name;
    }

    @Override
<<<<<<< HEAD
    public Company clone() throws CloneNotSupportedException{
        Company company = (Company) super.clone();
        return company;
=======
    public Company clone()throws CloneNotSupportedException{
        Company company = (Company) super.clone(); //casting
        // Object obj = customer;
        return  company;
>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb
    }
}
