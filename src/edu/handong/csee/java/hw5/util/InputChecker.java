package edu.handong.csee.java.hw5.util;

public class InputChecker {

    public static void printErrorMessageForTheNumberOfRequiredInputsAndExit(String engineName,
            int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
        public static void printErrorMessageForNegativeInputsAndExit(String engineName) {
        System.out.println("The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int min) {
        System.out.println("You need at least " + min + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
