package com.IIT.Customer_management_System.service;

import com.IIT.Customer_management_System.dto.Customer;
import com.IIT.Customer_management_System.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    void addCustomer(Customer customer);

    void deleteCustomerById(int id);

    Customer searchCustomerById(int id);

    void updateCustomer(CustomerEntity customer);
}
