package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerBootstrap implements CommandLineRunner {

    private CustomerRepository customerRepository;

    public CustomerBootstrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setLastName("Lahcen");
        customer1.setFirstName("Soualhine");

        Customer customer2 = new Customer();
        customer2.setLastName("Remi");
        customer2.setFirstName("Gaillard");

        Customer customer3 = new Customer();
        customer3.setLastName("Hatim");
        customer3.setFirstName("trabelssi");

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        System.out.println("Data Loaded for customers = " + customerRepository.count());

    }
}