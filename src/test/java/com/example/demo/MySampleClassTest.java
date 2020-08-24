package com.example.demo;

import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.*;

public class MySampleClassTest {

    @Test
    public void testMySampleMethod() {
        Optional<String> result = new MySampleClass().mySampleMethod();
        assertNotNull(result);
    }
}