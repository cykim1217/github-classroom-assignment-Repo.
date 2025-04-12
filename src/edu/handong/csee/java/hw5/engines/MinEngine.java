package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class MinEngine implements Computable {
    private static final String engineName = "MIN";
    private double[] input;
    private double result;

//input이 엔진네임을 제외하고 
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
            if (v < result) {
                result = v;
            }
        }
    }

    @Override
    public double getResult() {
        return result;
    }
    public double[] getInput() {
        return input;
    }

    public String getEngineName() {
        return engineName;
    }
}