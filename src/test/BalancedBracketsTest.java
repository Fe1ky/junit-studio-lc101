package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyBracketsReturnsFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyBracketsReturnsFalse4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[][[][]][]]"));
    }
    @Test
    public void onlyBracketsReturnsFalse5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[null]"));
    }
    @Test
    public void onlyBracketsReturnsFalse6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

}
