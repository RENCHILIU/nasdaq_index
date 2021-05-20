package com.renchi.nasdaq_index.controller;

import com.renchi.nasdaq_index.repo.CompanyDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//TODO: implement interface
@RestController
@RequestMapping("/company")
public class CompanyDetailController {

    @Value("${spring.datasource.url}")
    String dbUrl;


    @Autowired
    CompanyDetailRepository companyDetailRepository;

    //debug
    //TODO: add profile support

    @GetMapping("/test")
    void test() {
        System.out.println(dbUrl);
    }

    @GetMapping("/AAPL")
    Company getCompanyAADetail() {
        return companyDetailRepository.getCompanyAAPL();
    }

    //Search
    //TODO: combine all search endpoint with one switch

    @GetMapping("/detail")
    Company getCompanyDetailByName(@RequestParam String name) {
        return companyDetailRepository.getCompanyByName(name);
    }

    @GetMapping("/search")
    List<Company> searchCompanyDetail(@RequestParam(name = "query") String text, @RequestParam(required = false, defaultValue = "10") String limit) {
        //TODO: input validation
        //TODO: add search @service and handle short search and long search
        return companyDetailRepository.searchCompanyWithText(text, limit);
    }



}
