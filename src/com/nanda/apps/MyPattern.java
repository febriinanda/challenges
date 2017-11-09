package com.nanda.apps;

public abstract class MyPattern {
    private int input;
    private String pattern;

    MyPattern(int input) {
        this.input = input;
    }

    int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    String getPattern() {
        return pattern;
    }

    void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
