package com.vitor.beerstockbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockEmptyException extends Exception {

    public BeerStockEmptyException(Long id, int quantityToIncrement) {
        super(String.format("Beer with ID::%s to decrement informed exceeds the minimum stock capacity: %s", id, quantityToIncrement));
    }
}
