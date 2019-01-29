package lk.ijse.services;

import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();
    void addCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    Customer searchCustomer(Integer id);
    void deleteCustomer(Integer id);

}
