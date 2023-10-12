package bmicalculator;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBMI Calculator Menu:");
            System.out.println("1. Calculate BMI");
            System.out.println("2. Learn about BMI");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1/2/3): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    calculateBMI(scanner);
                    break;
                case 2:
                    learnAboutBMI();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Thank you for using the BMI calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }

    public static void calculateBMI(Scanner scanner) {
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        double bmi = calculateBMIValue(weight, height);
        String weightStatus = getWeightStatus(bmi);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("You are classified as: " + weightStatus);
    }

    public static double calculateBMIValue(double weight, double height) {
        return weight / (height * height);
    }

    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void learnAboutBMI() {
        System.out.println("Body Mass Index (BMI) is a measure of body fat based on your weight and height.");
        System.out.println("It is used to categorize individuals into underweight, normal weight, overweight, or obese.");
        System.out.println("The BMI categories are as follows:");
        System.out.println("- Underweight: BMI < 18.5");
        System.out.println("- Normal Weight: BMI between 18.5 and 24.9");
        System.out.println("- Overweight: BMI between 25 and 29.9");
        System.out.println("- Obese: BMI ≥ 30");
    }
}

