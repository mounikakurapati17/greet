package com.thoughtworks.greet.controller;


import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetControllerTest {

    @Test
    void greetTest() {
        GreetController greetController = new GreetController();

        ResponseEntity<String> responseEntity = greetController.greet();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Hi", responseEntity.getBody());
    }

    @Test
    void greetEndpointReturnsExpectedStatus() {
        GreetController greetController = new GreetController();

        ResponseEntity<String> responseEntity = greetController.greet();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
