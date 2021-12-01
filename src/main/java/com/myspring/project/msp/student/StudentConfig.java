package com.myspring.project.msp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student Faruk=new Student(
                    "Faruk",
                    32,
                    "FarukYilmaz@gmail.com",
                    LocalDate.of(1989, Month.FEBRUARY,11)

            );
            Student Fatma= new Student (
                    "Fatma",
                    28,
                    "Fatma@gmail.com",
                    LocalDate.of(1993, Month.DECEMBER,21)

            );
            Student ayca= new Student (
                    "ayca",
                    26,
                    "ayca@gmail.com",
                    LocalDate.of(1995, Month.OCTOBER,30)

            );
            repository.saveAll(
                    List.of(Faruk,Fatma,ayca)
            );
        };
    }
}
