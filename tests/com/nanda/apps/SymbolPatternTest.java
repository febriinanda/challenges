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
        String expected =   "x x x\n" +
                            " x x \n" +
                            "  x x\n" +
                            "   x \n" +
                            "    x\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern2() throws Exception {
        /*
            x
           x x
          x x x
         x x x x
        x x o x x
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern2();
        String expected =   "    x\n" +
                            "   x x\n" +
                            "  x x x\n" +
                            " x x x x\n" +
                            "x x o x x\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());

    }

    @Test
    public void pattern3() throws Exception {
        /*
        x x o x x
         x x x x
          x x x
           x x
            x
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern3();
        String expected =   "x x o x x\n" +
                            " x x x x\n" +
                            "  x x x\n" +
                            "   x x\n" +
                            "    x\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
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