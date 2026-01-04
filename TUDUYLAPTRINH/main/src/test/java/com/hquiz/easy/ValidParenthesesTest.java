package com.hquiz.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidParenthesesTest {

    @Test
    public void testIsValid_Basic() {
        assertTrue(ValidParentheses.isValid("()"), "Basic parentheses () should be valid");
        assertTrue(ValidParentheses.isValid("[]"), "Basic brackets [] should be valid");
        assertTrue(ValidParentheses.isValid("{}"), "Basic braces {} should be valid");
    }

    @Test
    public void testIsValid_Mixed() {
        assertTrue(ValidParentheses.isValid("()[]{}"), "Mixed sequential pairs ()[]{} should be valid");
        assertTrue(ValidParentheses.isValid("{[]}"), "Nested pairs {[]} should be valid");
    }

    @Test
    public void testIsValid_Invalid() {
        assertFalse(ValidParentheses.isValid("(]"), "Mismatched pair (] should be invalid");
        assertFalse(ValidParentheses.isValid("([)]"), "Interleaved pairs ([)] should be invalid");
        assertFalse(ValidParentheses.isValid("]"), "Single closing bracket ] should be invalid");
        assertFalse(ValidParentheses.isValid("(("), "Unclosed open brackets (( should be invalid");
    }

    @Test
    public void testIsValid_Empty() {
         // Assuming empty string is valid as it has no unmatched parentheses, 
         // but the current implementation logic:
         // Stack is empty initially, loop doesn't run, returns stack.isEmpty() -> true.
         // However, logic says if length % 2 != 0 return false. 0 % 2 == 0. So it returns true.
        assertTrue(ValidParentheses.isValid(""), "Empty string should be valid");
    }

    @Test
    public void testIsValid_OddLength() {
        assertFalse(ValidParentheses.isValid("("), "Odd length string ( should be invalid");
        assertFalse(ValidParentheses.isValid("())"), "Odd length string ()) should be invalid");
        assertFalse(ValidParentheses.isValid("{[}"), "Odd length string {[} should be invalid");
    }

    @Test
    public void testIsValid_ComplexNested() {
        assertTrue(ValidParentheses.isValid("({[]})"), "Deeply nested ({[]}) should be valid");
        assertFalse(ValidParentheses.isValid("({[}])"), "Incorrectly nested ({[}]) should be invalid");
        assertTrue(ValidParentheses.isValid("(([]){})"), "Complex valid structure (([]){}) should be valid");
    }
}
