package com.vitor.beerstockbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededException extends Exception {

    public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Beer with ID::%s to increment informed exceeds the max stock capacity: %s", id, quantityToIncrement));
    }
}
