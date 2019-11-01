package com.ucx.training.sessions.session2.cloning;

<<<<<<< HEAD
import java.util.logging.Logger;

public class CloneProgram {
    private static final Logger LOGGER = Logger.getLogger(CloneProgram.class.getName());

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Company company = new Company("Company Name");
        Customer customer = new Customer("John", "Doe", company);
        LOGGER.info(customer.getFirstName() + " " + customer.getLastName() + " "  + customer.getCompany().getName());
        Customer cloneCustomer = customer.clone();
//        LOGGER.info(cloneCustomer.getFirstName() + " " + cloneCustomer.getLastName() + " " + cloneCustomer.getCompany().getName());
        Company cloneCompany = company.clone();
=======
public class CloneProgram {
    public static void main(String[] args) throws Exception{
        Company company = new Company("Company Name");
        Customer customer = new Customer("John","Doe",company);
        System.out.println(customer.getFirstName() + customer.getLastName() + customer.getCompany().getName());
        Customer cloneCustomer = customer.clone();
        System.out.println(cloneCustomer.getFirstName() + cloneCustomer.getLastName() + cloneCustomer.getCompany().getName());
        Company cloneCompany = company.clone();
        System.out.println(cloneCompany.getName());

>>>>>>> d0a6eb13c3c4b0eaa6bf22737e04a25705e4f3fb

    }
}
