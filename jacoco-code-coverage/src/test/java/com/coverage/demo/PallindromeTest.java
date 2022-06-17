package com.coverage.demo;

import com.coverage.demo.Pallindrome;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PallindromeTest {
    @Test
    public void whenEmptyString_thenAccept() {
        Pallindrome palindromeTester = new Pallindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }
}
