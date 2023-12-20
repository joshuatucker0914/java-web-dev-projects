package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void testMixedCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello[World]!"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code] is awesome]"));
    }

    @Test
    public void testMultipleBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{()}]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{()]"));
    }

    @Test
    public void testNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch Code is [awesome]!"));
    }

    @Test
    public void testEdgeCases() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void testEdgeCaseWithNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello [World]! This is [a test]"));
    }

    @Test
    public void testEdgeCaseWithMixedBracketTypes() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[{Hello}]"));
    }

    @Test
    public void testEdgeCaseWithMixedBracketOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testEdgeCaseWithMixedCharactersAndBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code] is awesome]!"));
    }


}