package Spring.services;

import Spring.doMain.Customer;
import Spring.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    //private Map<Integer, Customer> customers;

    @Autowired
    private CustomerRepository repository;

    public CustomerServiceImpl() {
        //customers = new HashMap<>();
        //loadCustomers();
    }

//    private void loadCustomers() {
//        for (int i = 1; i < 6; i++) {
//            Customer c = new Customer();
//            c.setId(i);
//            c.setFirstName("Adam" + i);
//            c.setLastName("Nowak" + i);
//            c.setPhoneNumber("48 555 999 00" + i);
//            c.setEmail("AdamNowak@" + i + ".com");
//            c.setAddressLineOne("Street " + i);
//            c.setAddressLineTwo("Flat " + i);
//            c.setCity("Krakow");
//            c.setZipCode("00-999");
//            c.setState("Main");
//            customers.put(i, c);
//        }
//    }


    @Override
    public List<Customer> listAllCustomers() {
        List<Customer> result = new LinkedList<>();
        repository.findAll().forEach(result::add);
        return result;
    }


    @Override
    public Customer getCustomerById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null) {
            return repository.save(customer);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.delete(id);
    }
//
//    private Integer getNextKey() {
//        return Collections.max(customers.keySet()) + 1;
//    }

}