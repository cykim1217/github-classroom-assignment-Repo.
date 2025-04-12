package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class FibonacciEngine implements Computable {
    private static final String engineName = "FIBONACCI";
    private int n;
    private double result;

    @Override
    public void setInput(String[] input) {
        if (input.length != 2) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        try {
            n = Integer.parseInt(input[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
            System.exit(0);
        }

        if (n <= 0) {
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        }
    }

    @Override
    public void compute() {
        result = fibonacci(n);
    }

    private int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    @Override
    public double getResult() {
        return result;
    }

    public int getN() {
        return n;
    }

    public String getEngineName() {
        return engineName;
    }
}