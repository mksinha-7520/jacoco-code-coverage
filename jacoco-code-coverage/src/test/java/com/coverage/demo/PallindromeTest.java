package com.coverage.demo;

import com.coverage.demo.Pallindrome;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PallindromeTest {
    @Test
    public void whenEmptyString_thenAccept() {
        Pallindrome palindromeTester = new Pallindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    public void whenNonEmptyPallindromeString_thenAccept() {
        Pallindrome palindromeTester = new Pallindrome();
        assertTrue(palindromeTester.isPalindrome("ana"));
    }

    @Test
    public void whenNonEmptyNonPallindromeString_thenAccept() {
        Pallindrome palindromeTester = new Pallindrome();
        assertFalse(palindromeTester.isPalindrome("and"));
    }
}
