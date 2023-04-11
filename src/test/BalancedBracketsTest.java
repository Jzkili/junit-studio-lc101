package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void NormalBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsThenString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
@Test
    public void stringWithBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
}

@Test
    public void StringBracketsString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
}
@Test
    public void multiBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
}
@Test
    public void singleBracketString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
}
@Test
    public void singleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
}
@Test
public void reversedBracketsString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
}
@Test
    public void reversedBracketsOnly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
}
@Test
public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
}
@Test
    public void noBracketsString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
}

}
