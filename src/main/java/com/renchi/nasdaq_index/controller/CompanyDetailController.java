package com.renchi.nasdaq_index.controller;

import com.renchi.nasdaq_index.repo.CompanyDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyDetailController {

    @Value("${spring.datasource.url}")
    String dbUrl;

    @Autowired
    CompanyDetailRepository companyDetailRepository;


    @GetMapping("/list")
    void test() {
        System.out.println(dbUrl);
    }

    @GetMapping("/AAPL")
    Company getCompanyAADetail() {
        return companyDetailRepository.getCompanyAAPL();
    }

    @GetMapping("/detail")
    Company getCompanyDetailByName(@RequestParam String name) {
        return companyDetailRepository.getCompanyByName(name);
    }


}
