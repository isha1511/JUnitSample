package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration user=new UserRegistration();
    @Test
    void testName(){

        assertTrue(user.isValidName("Isha"));
        assertTrue(user.isValidName("Makhija"));
    }

    @Test
    void testWrongName(){

        assertFalse(user.isValidName("makhija"));
        assertFalse(user.isValidName("isha"));
    }

    @Test
    void testMail(){

        assertTrue(user.isValidEmail("makhijaisha@gmail.com"));
        assertTrue((user.isValidEmail("abc.100@yahoo.com")));

    }

    @Test
    void testWrongMail(){

        assertFalse(user.isValidEmail("abc123@.com"));
        assertFalse(user.isValidEmail("abc"));
    }

    @Test
    void testMobNo(){

        assertTrue(user.isValidMobNo("+91 1234567890"));
        assertTrue(user.isValidMobNo("1234567890"));
    }

    @Test

    void testWrongMobNo(){

        assertFalse(user.isValidMobNo("123456789"));
        assertFalse(user.isValidMobNo("+91-123456789"));
    }

    @Test
    void testPass(){

        assertTrue(user.isValidPass("Pass@123"));
        assertTrue(user.isValidPass("P123@abc"));
    }

    @Test

    void testwrongPass(){

        assertFalse(user.isValidPass("123456"));
        assertFalse(user.isValidPass("abc@123"));
    }

    private static Stream<Arguments> validEmails() {


        return Stream.of(
                Arguments.of("abc@yahoo.com"),
                Arguments.of("abc-100@yahoo.com"),
                Arguments.of("abc.100@yahoo.com"),
                Arguments.of("abc111@abc.com"),
                Arguments.of("abc-100@abc.net"),
                Arguments.of("abc.100@abc.com.au"),
                Arguments.of("abc@gmail.com.com"),
                Arguments.of("abc+100@gmail.com")
        );
    }
    @ParameterizedTest
    @MethodSource("validEmails")
    void testValidEmail(String input) {
        assertTrue(user.isValidEmail(input));
    }
    private static Stream<Arguments> InvalidEmails() {


        return Stream.of(
                Arguments.of("abc"),
                Arguments.of("abc123@gmail.a"),
                Arguments.of("abc123@.com"),
                Arguments.of("abc()*@gmail.com"),
                Arguments.of("abc@%*.com"),
                Arguments.of(" abc..2002@gmail.com"),
                Arguments.of("abc@abc@gmail.com"),
                Arguments.of("abc@gmail.com.1a")
        );
    }
    @ParameterizedTest
    @MethodSource("InvalidEmails")
    void testInValidEmail(String input) {
        assertFalse(user.isValidEmail(input));
    }







}