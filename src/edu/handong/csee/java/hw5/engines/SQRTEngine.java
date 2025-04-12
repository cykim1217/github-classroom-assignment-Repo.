package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class SQRTEngine implements Computable {
    private static final String engineName = "SQRT";
    private double input;
    private double result;

    @Override
    public void setInput(String[] inputArgs) {
        if (inputArgs.length != 2) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        try {
            input = Double.parseDouble(inputArgs[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            System.exit(0);
        }

        if (input < 0) {
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        }
    }

    @Override
    public void compute() {
        result = Math.sqrt(input);
    }

    @Override
    public double getResult() {
        return result;
    }

    public double getInput() {
        return input;
    }

    public String getEngineName() {
        return engineName;
    }
}
