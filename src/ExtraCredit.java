import java.util.Random;
public class ExtraCredit {
            public static void main(String[] args) {
            int[] dataPoints = new int[100];
            // ... Initialize the dataPoints array with random values ...
                Random random = new Random();

                for (int i = 0; i < dataPoints.length; i++) {
                    dataPoints[i] = random.nextInt(100) + 1;
                }
            int minValue = min(dataPoints);
            int maxValue = max(dataPoints);
            int target = 55;

            System.out.println("Min value: " + minValue);
            System.out.println("Max value: " + maxValue);
            System.out.println("Occurrences of target " + target + ": " + occurrenceScan(dataPoints, target));
            System.out.println("Sum of array elements: " + sum(dataPoints));
            System.out.println("Contains target " + target + ": " + contains(dataPoints, target));
        }

        public static int min(int[] values) {
            if (values.length == 0) {
                throw new IllegalArgumentException("Array must not be empty.");
            }

            int minValue = values[0];
            for (int num : values) {
                if (num < minValue) {
                    minValue = num;
                }
            }

            return minValue;
        }

        public static int max(int[] values) {
            if (values.length == 0) {
                throw new IllegalArgumentException("Array must not be empty.");
            }

            int maxValue = values[0];
            for (int num : values) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }

            return maxValue;
        }

        public static int occurrenceScan(int[] values, int target) {
            int count = 0;
            for (int num : values) {
                if (num == target) {
                    count++;
                }
            }
            return count;
        }

        public static int sum(int[] values) {
            int sum = 0;
            for (int num : values) {
                sum += num;
            }
            return sum;
        }

        public static boolean contains(int[] values, int target) {
            for (int num : values) {
                if (num == target) {
                    return true;
                }
            }
            return false;
            }
}

