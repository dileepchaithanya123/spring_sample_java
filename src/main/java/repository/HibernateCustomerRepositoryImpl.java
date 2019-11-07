package repository;

import model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository ")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){

        List<Customer> customers = new ArrayList<>();

        /*Customer customer = new Customer();
        customer.setFirstname("Dileep");
        customer.setLastname("Ponnuru");

        Customer customer2 = new Customer();
        customer2.setFirstname("Anusha");
        customer2.setLastname("Urimi");

        customers.add(customer);
        customers.add(customer2);*/

        customers.add(new Customer("Ponnuru", "Dileep"));

        return customers;
    }
}
