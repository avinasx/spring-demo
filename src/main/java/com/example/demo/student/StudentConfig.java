package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student alex =  new Student(
                        "avi",
                        "avinash.kumar@xuh.com",
                        LocalDate.of(1993, Month.JANUARY, 16)
                );

            Student adam =  new Student(
                        "avi",
                        "avinash.kumar@xuh.com",
                        LocalDate.of(1993, Month.JANUARY, 16)
                );

            repository.saveAll(
                    List.of(alex, adam)
            );

        };
    }

}
