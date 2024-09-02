package com.example.products_boot.service;


import com.example.products_boot.models.Customer;
import com.example.products_boot.repository.CustomerDao;
import com.example.products_boot.request.CustomerSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    Scanner scanner = new Scanner(System.in);

    public void saveCustomer(CustomerSave customerSave){
        Customer customer = new Customer();
        customer.setCustomerName(customerSave.getCustomerName());
        customer.setContactInfo(customerSave.getContactInfo());
        customerDao.create(customer);
    }

    public void getById(){
        System.out.println("Enter customer id: ");
        int id = scanner.nextInt();

        Customer customer = customerDao.getById(id);
        printCustomer(customer);
    }

    public void updateCustomer(){
        System.out.println("Enter customer id: ");
        int id = scanner.nextInt();
        Customer customer = customerDao.getById(id);
        printCustomer(customer);
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        if (!customerName.isEmpty()){
            customer.setCustomerName(customerName);
        }
        System.out.println("Enter contact info: ");
        String contactInfo = scanner.nextLine();
        if (!contactInfo.isEmpty()){
            customer.setContactInfo(contactInfo);
        }
        customerDao.updateCustomer(customer);
        System.out.println("Customer updated!");
    }

    public void deleteCustomerById(){
        System.out.println("Enter customer id: ");
        int id = scanner.nextInt();
        customerDao.deleteCustomer(id);
        System.out.println("Customer with id: " + id + "deleted");
    }

    private   void printCustomer(Customer customer){
        System.out.println("--------------");
        System.out.println("customer id: " + customer.getCustomerId());
        System.out.println("customer name: " + customer.getCustomerName());
        System.out.println("contact info: " + customer.getContactInfo());
        System.out.println("---------------");
    }
}
