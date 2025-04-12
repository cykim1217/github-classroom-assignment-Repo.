package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;
import java.util.Arrays;

public class MaxEngine implements Computable {
    private static final String engineName = "MAX";
    private double[] input;
    private double result;

    @Override
    public void setInput(String[] input) {
        if (input.length < 3) {
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }

        this.input = new double[input.length - 1];

        try {
            for (int i = 1; i < input.length; i++) {
                this.input[i - 1] = Double.parseDouble(input[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numbers.");
            System.exit(0);
        }
        

    }

    @Override
    public void compute() {
        result = input[0];
        for (double v : input) {
            if (v > result) {
                result = v;
            }
        }
    }

    @Override
    public double getResult() {
        return result;
    }

    public double[] getInput() {
        return Arrays.copyOf(input, input.length);
    }

    public String getEngineName() {
        return engineName;
    }
}
