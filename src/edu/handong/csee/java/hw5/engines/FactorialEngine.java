package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class FactorialEngine implements Computable {
    private static final String engineName = "FACTORIAL";
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
        result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
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