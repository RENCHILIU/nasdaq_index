package com.renchi.nasdaq_index.controller;

import com.renchi.nasdaq_index.QuoteModel;
import com.renchi.nasdaq_index.service.QuoteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//TODO: url case insensitive
@RequestMapping("/quote")
public class QuoteDetailController {

    @Autowired
    QuoteDetailService quoteDetailService;

    @GetMapping("/detail")
    public QuoteModel getQuoteDetail(@RequestParam() String quote) {
        return quoteDetailService.getQuoteDetail(quote);
    }
}
