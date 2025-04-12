package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class CubeVolEngine implements Computable {
    private static final String engineName = "CUBEVOL";
    private double length;
    private double result;

    @Override
    public void setInput(String[] inputArgs) {
        if (inputArgs.length != 2) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        try {
            length = Double.parseDouble(inputArgs[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            System.exit(0);
        }
        if (length <= 0) {
    InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
}
    }

    @Override
    public void compute() {
        result = length * length * length;
    }

    @Override
    public double getResult() {
        return result;
    }

    public double getLength() {
        return length;
    }

    public String getEngineName() {
        return engineName;
    }
}