package vip.shisui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(BMSApplication.class, args);
    }

}
