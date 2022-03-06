package com.techomeck.SearchingPaginationSorting;

import com.techomeck.SearchingPaginationSorting.entity.Student;
import com.techomeck.SearchingPaginationSorting.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SearchingPaginationSortingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchingPaginationSortingApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(new Student(null, "Robert", "One", 2010));
            studentRepository.save(new Student(null, "Jakob", "One", 1983));
            studentRepository.save(new Student(null, "James", "One", 1999));
            studentRepository.save(new Student(null, "Noa", "One", 2003));
            studentRepository.save(new Student(null, "Armin", "One", 2012));
            studentRepository.save(new Student(null, "David", "One", 2010));
            studentRepository.save(new Student(null, "Jack", "One", 2008));
            studentRepository.save(new Student(null, "Brad", "One", 2015));
            studentRepository.save(new Student(null, "Philip", "One", 2018));
            studentRepository.save(new Student(null, "Oscar", "One", 2011));
            studentRepository.save(new Student(null, "Sara", "One", 2003));
            studentRepository.save(new Student(null, "Ellen", "One", 2005));
            studentRepository.save(new Student(null, "August", "One", 2002));
            studentRepository.save(new Student(null, "Joe", "One", 2003));
            studentRepository.save(new Student(null, "Peter", "One", 2012));
            studentRepository.save(new Student(null, "Donald", "One", 2014));
            studentRepository.save(new Student(null, "Nicolas", "One", 2018));
            studentRepository.save(new Student(null, "Linda", "One", 2017));
        };
    }

}
