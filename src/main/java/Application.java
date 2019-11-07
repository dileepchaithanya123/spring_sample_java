import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = appContext.getBean(CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
        System.out.println((service.findAll().get(0).getLastname()));
    }
}
