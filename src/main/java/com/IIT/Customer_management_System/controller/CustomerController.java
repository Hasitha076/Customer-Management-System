package com.IIT.Customer_management_System.controller;

import com.IIT.Customer_management_System.dto.Customer;
import com.IIT.Customer_management_System.entity.CustomerEntity;
import com.IIT.Customer_management_System.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping( "api/v1/customer")
public class CustomerController {

    final CustomerService customerService;

    @GetMapping("getAllCustomer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping("addCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public String addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return "Customer added successfully!!!";
    }

    @PutMapping("updateCustomer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateCustomer(@RequestBody CustomerEntity customer) {
        customerService.updateCustomer(customer);
        return "Successfully updated!!!";
    }

    @GetMapping("searchCustomerById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Customer searchCustomerById(@PathVariable int id) {
        return customerService.searchCustomerById(id);
    }

    @DeleteMapping("deleteCustomerById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteCustomerById(@PathVariable int id) {
        customerService.deleteCustomerById(id);
        return "Successfully deleted!!!";
    }
}
