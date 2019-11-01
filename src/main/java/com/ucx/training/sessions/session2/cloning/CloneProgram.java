package com.ucx.training.sessions.session2.cloning;

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

    }
}
