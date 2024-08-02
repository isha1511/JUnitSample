package org.example;

import org.junit.jupiter.api.*;

public class ExampleTest {

    @BeforeEach
    public void BeforeEach(){

        System.out.println("BeforeEach");
    }

    @BeforeAll
    public static void BeforeAll(){

        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void AfterAll(){

        System.out.println("AfterAll");
    }

    @AfterEach
    public void AfterEach(){

        System.out.println("AfterEach");
    }
    @Test
    public void message1(){

        System.out.println("Hello in msg1 ");
    }

    @Test
    public void message2(){

        System.out.println("Hello in msg2");
    }

}
