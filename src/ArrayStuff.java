//import java.util.Scanner;
import java.util.Random;
public class ArrayStuff {
    public static void main(String[] args) {
   /*     int[] dataPoints = new int[100];
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("Values in dataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
             int userInput = SafeInput.getRangedInt(scanner, "\nEnter an integer between 1 and 100", 1, 100);
             int count = 0;

        for (int num : dataPoints) {
            if (num == userInput) {
                count++;
            }
        }

        System.out.println("\nThe user's value " + userInput + " appears " + count + " times in the dataPoints array.");
        scanner.close();
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                System.out.println("\nThe value " + userInput + " was found at array index " + i);
                found = true;
                break; // Break out of the loop once the value is found
            }
        }

        if (!found) {
            System.out.println("\nThe value " + userInput + " was not found in the dataPoints array.");
        }

        scanner.close();
    }
}
        int minValue = dataPoints[0]; // Assume the first element is the initial minimum
        int maxValue = dataPoints[0]; // Assume the first element is the initial maximum
        // Loop to scan for the minimum and maximum values
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }

        System.out.println("\nMinimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
    */
        double[] dataPoints = new double[100];
        // ... Initialize the dataPoints array with random values ...
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextDouble(100) + 1;
            // Calculate and display the average of dataPoints array
            double average = getAverage(dataPoints);
            System.out.printf("The average of the dataPoints array is: %.2f%n", average);
        }
    }

        public static double getAverage (double[] array)
        {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty.");
            }

            double sum = 0;
            for (double num : array) {
                sum += num;
            }

            return sum / array.length;
        }
    }
