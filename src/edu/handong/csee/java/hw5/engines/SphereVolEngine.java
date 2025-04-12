package edu.handong.csee.java.hw5.engines;

import edu.handong.csee.java.hw5.util.InputChecker;

public class SphereVolEngine implements Computable {

    private static final String engineName = "SPHEREVOL";
    private double radius;
    private double result;

    @Override
    public void setInput(String[] inputArgs) {
        if (inputArgs.length != 2) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        try {
            radius = Double.parseDouble(inputArgs[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            System.exit(0);
        }

        if (radius < 0) {
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);

        }

    }

    @Override
    public void compute() {
        result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getResult() {
        return result;
    }

    public double getRadius() {
        return radius;
    }

    public String getEngineName() {
        return engineName;
    }
}
