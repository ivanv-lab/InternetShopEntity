package spr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

//    @Bean
//    CommandLineRunner runner(UserRepository repository){
//        return args -> {
//          User user=new User("sdfsd","sdfsd","34534");
//          repository.save(user);
//        };
//    }
    @Bean
    CommandLineRunner runner(PickPointRepository repository){
        return args -> {
            PickPoint pickPoint=new PickPoint("ТЦ Меридиан","Куйбышева, 17");
            repository.save(pickPoint);
        };
    }
}
