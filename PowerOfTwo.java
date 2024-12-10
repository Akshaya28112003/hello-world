public class PowerOfTwo {
    // Method to check if a number is a power of 2
    public static boolean isPowerOfTwo(int num) {
        // A number is a power of 2 if num > 0 and (num & (num - 1)) == 0
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {1, 2, 4, 8, 16, 18, 32, 64, 127};

        System.out.println("Checking if numbers are power of 2:");
        for (int num : testNumbers) {
            System.out.printf("%d is a power of 2: %b%n", num, isPowerOfTwo(num));
        }
    }
}
