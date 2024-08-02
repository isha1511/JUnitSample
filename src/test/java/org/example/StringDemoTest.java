package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDemoTest {

    StringDemo sd=new StringDemo();
    @Test
    void testReverse() {

        assertEquals("ahsI",sd.reverse("Isha"));
        assertEquals("1234",sd.reverse("4321"));
    }
    @Test
    void testReverseWithNull(){

        assertThrows(IllegalArgumentException.class , ()-> sd.reverse(null));
    }

    @Test
    void testIsPalindrome() {

        assertTrue(sd.isPalindrome("madam"));
        assertFalse(sd.isPalindrome("Hello"));
    }

    @Test

    void testPalindromeWithNull(){

        assertThrows(IllegalArgumentException.class,()->sd.isPalindrome(null));
    }

}