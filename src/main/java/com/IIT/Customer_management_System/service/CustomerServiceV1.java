package com.IIT.Customer_management_System.service;

import com.IIT.Customer_management_System.dto.Customer;
import com.IIT.Customer_management_System.entity.CustomerEntity;
import com.IIT.Customer_management_System.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceV1 implements CustomerService{

    final CustomerRepo customerRepo;
    final ModelMapper modelMapper;

    public List<Customer> getAllCustomer() {
        List<CustomerEntity> customers = customerRepo.findAll();
        return modelMapper.map(customers, new TypeToken<List<Customer>>(){}.getType());
    }

    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = modelMapper.map(customer, CustomerEntity.class);
        customerRepo.save(customerEntity);
    }

    public void deleteCustomerById(int id) {
        customerRepo.deleteById(id);
    }

    public Customer searchCustomerById(int id) {
        Optional<CustomerEntity> customer = customerRepo.findById(id);
        return modelMapper.map(customer, new TypeToken<Customer>(){}.getType());
    }

    public void updateCustomer(CustomerEntity customer) {
        customerRepo.save(modelMapper.map(customer, new TypeToken<CustomerEntity>(){}.getType()));
    }
}
