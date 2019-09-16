package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Le prix ne peut être 0")
public class ProduitGratuitException extends RuntimeException {
    public ProduitGratuitException(String s) {
        super(s);
    }
}
