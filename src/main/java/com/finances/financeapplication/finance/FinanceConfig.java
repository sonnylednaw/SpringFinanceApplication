package com.finances.financeapplication.finance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FinanceConfig {



}



//package com.example.demo.student;
//
//        import org.springframework.boot.CommandLineRunner;
//        import org.springframework.context.annotation.Bean;
//        import org.springframework.context.annotation.Configuration;
//
//        import java.time.LocalDate;
//        import java.time.Month;
//        import java.util.List;


// Creates and saves the created models to DB when Spring Server Starts

//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//
//            Student mayela = new Student(
//                    "Mayela",
//                    "mayela@gmail.com",
//                    LocalDate.of(1996, Month.JANUARY, 5)
//            );
//
//            Student sonny = new Student(
//                    "Sonny",
//                    "Sonny@gmail.com",
//                    LocalDate.of(1997, Month.JANUARY, 5)
//            );
//
//            repository.saveAll(
//                    List.of(mayela, sonny)
//            );
//        };
//    }
//}
