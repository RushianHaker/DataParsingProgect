package com.parser;

import com.entity.CurrencyRate;

import java.util.List;

public interface IParserCurrency {
    List<CurrencyRate> parser (String rateAsString);
}
