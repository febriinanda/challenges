package com.nanda.apps;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPatternTest {
    @Test
    public void pattern1() throws Exception {
        /*
        12345
         1234
          123
           12
            1
         */
        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern1();
        String expected =   "12345\n" +
                            " 1234\n" +
                            "  123\n" +
                            "   12\n" +
                            "    1\n";

        Assert.assertEquals("Different result", expected,numberObj.getPattern());
    }

    @Test
    public void pattern2() throws Exception {
        /*
            1
           121
          12321
         1234321
        123454321
         */
        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern2();
        String expected =   "    1\n" +
                            "   121\n" +
                            "  12321\n" +
                            " 1234321\n" +
                            "123454321\n";

        Assert.assertEquals("Different result", expected,numberObj.getPattern());
        
    }

    @Test
    public void pattern3() throws Exception {
        /*
        123454321
         1234321
          12321
           121
            1
         */

        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern3();
        String expected =   "123454321\n" +
                            " 1234321\n" +
                            "  12321\n" +
                            "   121\n" +
                            "    1\n";
        Assert.assertEquals("Different result", expected,numberObj.getPattern());
    }

    @Test
    public void pattern4() throws Exception {
        /*
        54321
         5432
          543
           54
            5
            45
            345
            2345
            12345
         */
        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern4();
        String expected =   "54321\n" +
                            " 5432\n" +
                            "  543\n" +
                            "   54\n" +
                            "    5\n" +
                            "    45\n" +
                            "    345\n" +
                            "    2345\n" +
                            "    12345\n";
        Assert.assertEquals("Different result", expected,numberObj.getPattern());
    }

    @Test
    public void pattern5() throws Exception {
        /*
        54321
         5432
          543
           54
            5
         */
        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern5();
        String expected =   "54321\n" +
                            " 5432\n" +
                            "  543\n" +
                            "   54\n" +
                            "    5\n" ;
        Assert.assertEquals("Different result", expected,numberObj.getPattern());
    }

    @Test
    public void pattern6() throws Exception {
        /*
        5
        45
        345
        2345
        12345
         */
        NumberPattern numberObj = new NumberPattern(5);
        numberObj.pattern6();
        String expected =   "5\n" +
                            "45\n" +
                            "345\n" +
                            "2345\n" +
                            "12345\n";
        Assert.assertEquals("Different result", expected,numberObj.getPattern());
    }

    @Test
    public void pattern7() throws Exception {
    }

    @Test
    public void pattern8() throws Exception {
    }

    @Test
    public void pattern9() throws Exception {
    }

    @Test
    public void pattern10() throws Exception {
    }

}