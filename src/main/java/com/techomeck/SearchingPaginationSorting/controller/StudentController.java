package com.techomeck.SearchingPaginationSorting.controller;


import com.techomeck.SearchingPaginationSorting.entity.Student;
import com.techomeck.SearchingPaginationSorting.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RequiredArgsConstructor
@RestController
public class StudentController {
    private final StudentRepository studentRepository;

    @GetMapping("/students")
    public Page<Student> findByName(@RequestParam Optional<String> name,
                                    @RequestParam Optional<String> page,
                                    @RequestParam Optional<String> sortBy) {
        return studentRepository.findByName(name.orElse("_"),
                PageRequest.of(Integer.parseInt(page.orElse("0")),
                        Integer.parseInt("6"), Sort.Direction.ASC, sortBy.orElse("id")));
    }
}
