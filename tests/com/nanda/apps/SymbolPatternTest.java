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
        /*
        o x x
         o x
          o x
           o
            o
             o
            x o
             x o
            x x o
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern4();
        String expected =   "o x x\n" +
                            " o x \n" +
                            "  o x\n" +
                            "   o \n" +
                            "    o\n" +
                            "     o\n" +
                            "    x o\n" +
                            "     x o\n" +
                            "    x x o\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern5() throws Exception {
        /*
        o x x
         o x
          o x
           o
            o
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern5();
        String expected =   "o x x\n" +
                            " o x \n" +
                            "  o x\n" +
                            "   o \n" +
                            "    o\n" ;

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern6() throws Exception {
        /*
        o
         o
        x o
         x o
        x x o
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern6();
        String expected =   "o\n" +
                            " o\n" +
                            "x o\n" +
                            " x o\n" +
                            "x x o\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern7() throws Exception {
        /*
        xxxxx

        xxxxx

        ooooo
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern7();
        String expected =   "xxxxx\n" +
                            "     \n" +
                            "xxxxx\n" +
                            "     \n" +
                            "ooooo\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern8() throws Exception {
        /*
        x x ox
         x ox
        x ox x
         ox x
        ox x o
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern8();
        String expected =   "x x ox\n" +
                            " x ox \n" +
                            "x ox x\n" +
                            " ox x \n" +
                            "ox x o\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

    @Test
    public void pattern9() throws Exception {
        /*
        x x o
         x x o
          x x o
           x x o
            x x o
         */
        SymbolPattern symbolObj = new SymbolPattern(5);
        symbolObj.pattern9();
        String expected =   "x x o\n" +
                            " x x o\n" +
                            "  x x o\n" +
                            "   x x o\n" +
                            "    x x o\n";

        Assert.assertEquals("Different result", expected,symbolObj.getPattern());
    }

}