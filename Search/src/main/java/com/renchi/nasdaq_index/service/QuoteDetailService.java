package com.renchi.nasdaq_index.service;


import com.renchi.nasdaq_index.GlobalQuote;
import com.renchi.nasdaq_index.QuoteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteDetailService {

    @Autowired
    RestTemplate restTemplate;

    public QuoteModel getQuoteDetail(String quote) {
        String url = "https://www.alphavantage.co/query" + "?function=GLOBAL_QUOTE&symbol=" + quote + "&apikey=G1025EJ8D78XF2RV";
//        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//        System.out.println(response.toString());

        GlobalQuote globalQuote = restTemplate.getForObject(url, GlobalQuote.class);
        return globalQuote.getQuoteModel();

    }


}
