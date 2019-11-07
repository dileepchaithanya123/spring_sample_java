import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

@Configuration
@ComponentScan({"java"})
public class AppConfig {

   @Bean(name="customerService")
    public CustomerService getCustomerService()
   {
        CustomerServiceImpl service = new CustomerServiceImpl();
        return service;
    }

    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
