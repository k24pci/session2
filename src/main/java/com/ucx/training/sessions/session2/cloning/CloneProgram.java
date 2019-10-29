package com.ucx.training.sessions.session2.cloning;

public class CloneProgram {
    public static void main(String[] args) throws Exception{
        Company company = new Company("Company Name");
        Customer customer = new Customer("John","Doe",company);
        System.out.println(customer.getFirstName() + customer.getLastName() + customer.getCompany().getName());
        Customer cloneCustomer = customer.clone();
        System.out.println(cloneCustomer.getFirstName() + cloneCustomer.getLastName() + cloneCustomer.getCompany().getName());
        Company cloneCompany = company.clone();
        System.out.println(cloneCompany.getName());


    }
}
