package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class GCDEngine implements Computable {
    private static final String engineName = "GCD";
    private int[] input;
    private int result;

    @Override
    public void setInput(String[] inputArgs) {
        if (inputArgs.length != 3) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 2);
        }
        this.input = new int[2];
        try {
            this.input[0] = Integer.parseInt(inputArgs[1]);
            this.input[1] = Integer.parseInt(inputArgs[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers.");
            System.exit(0);
        }
        if ((this.input[0] <= 0)||(this.input[1] <= 0)) {
    InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
}
    }

    @Override
    public void compute() {
        result = gcd(input[0], input[1]);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public double getResult() {
        return result;
    }

    public int[] getInput() {
        return input;
    }

    public String getEngineName() {
        return engineName;
    }
}