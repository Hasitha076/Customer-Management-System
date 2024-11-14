package com.IIT.Customer_management_System.dto;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private int id;
    private String name;
    private String address;
    private String email;
}
