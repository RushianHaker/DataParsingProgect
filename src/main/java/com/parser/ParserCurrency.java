package com.parser;

import com.entity.CurrencyRate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ParserCurrency implements IParserCurrency{

    @Override
    public List<CurrencyRate> parser(String rateAsString) {
        return null;
    }
}
