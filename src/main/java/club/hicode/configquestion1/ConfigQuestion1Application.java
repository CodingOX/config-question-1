package club.hicode.configquestion1;

import club.hicode.configquestion1.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigQuestion1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigQuestion1Application.class, args);
    }

    @Bean
    public User user() {
        return new User();
    }
}
