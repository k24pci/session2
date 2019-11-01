package com.ucx.training.sessions.session2.cloning;

public class Customer implements Cloneable{
    private String firstName;
    private String lastName;
    private Company company;

    public Customer(String firstName, String lastName, Company company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public Company getCompany(){
        return company;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public Customer clone() throws CloneNotSupportedException{
        Customer customer = (Customer)super.clone();
        customer.company = this.company.clone();
        return customer;
    }
}
