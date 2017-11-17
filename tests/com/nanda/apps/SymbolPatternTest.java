package com.nanda.apps;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymbolPatternTest {
    @Test
    public void pattern1() throws Exception {
        /*
        expected:
        x x x
         x x
          x x
           x
            x
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern1();
        StringBuilder expected = new StringBuilder();
        expected.append("x x x\n");
        expected.append(" x x \n");
        expected.append("  x x\n");
        expected.append("   x \n");
        expected.append("    x\n");

        Assert.assertEquals("Different result",expected.toString(),symbolObj.getPattern());
    }

    @Test
    public void pattern2() throws Exception {
    }

    @Test
    public void pattern3() throws Exception {
    }

    @Test
    public void pattern4() throws Exception {
    }

    @Test
    public void pattern5() throws Exception {
    }

    @Test
    public void pattern6() throws Exception {
    }

    @Test
    public void pattern7() throws Exception {
    }

    @Test
    public void pattern8() throws Exception {
    }

}