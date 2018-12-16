package com.example.demo1.test1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJUnit5Tests {
    @Test
    void myFirstTest(){
        assertEquals(2,1+1);
        System.out.println("ssss");
    }
}
