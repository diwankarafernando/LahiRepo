package lk.ijse.services.impl;

import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import lk.ijse.repository.CustomerRepo;
import lk.ijse.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> allCustomer= customerRepo.findAll();
        List<CustomerDTO> list=new ArrayList<>();

        for(Customer cus : allCustomer){
            list.add(new CustomerDTO(cus.getId(),cus.getName(),cus.getAddress(),cus.getSalary()));
        }
        return list;
    }

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        Customer custom = new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),
                customerDTO.getSalary());
        customerRepo.save(custom);

    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer=new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),
                customerDTO.getSalary());
        if(customer.getId()!=null){
            customerRepo.save(customer);
            System.out.println("Updated");
        }else{
            System.out.println("Error");
        }

    }

    @Override
    public Customer searchCustomer(Integer id) {
        Optional<Customer> cus = this.customerRepo.findById(id);
        if (cus.isPresent()) {
            return cus.get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
    }



}
