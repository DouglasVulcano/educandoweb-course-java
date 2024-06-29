package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration // Indicates that this is a Spring configuration class.
@Profile("test") // Specifies that this configuration will only be active when the 'test' profile is active.
public class TestConfig implements CommandLineRunner {

    @Autowired // Automatically injects an instance of UserRepository.
    private UserRepository userRepository;

    // The run method is executed when the application is initialized.
    @Override
    public void run(String... args) throws Exception {
        // Create two User objects with fictitious data.
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // Save the User objects to the database.
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
