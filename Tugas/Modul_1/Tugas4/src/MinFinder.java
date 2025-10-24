public class MinFinder {
    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== SKENARIO 1: Angka 1, 2, 3 ===");
        System.out.println("Min(1,2,3) = " + findMin(1, 2, 3)); // Expected: 1
        System.out.println("Min(2,1,3) = " + findMin(2, 1, 3)); // Expected: 1
        System.out.println("Min(3,2,1) = " + findMin(3, 2, 1)); // Expected: 1

        System.out.println("\n=== SKENARIO 2: Angka -1, -2, -3 ===");
        System.out.println("Min(-1,-2,-3) = " + findMin(-1, -2, -3)); // Expected: -3
        System.out.println("Min(-2,-3,-1) = " + findMin(-2, -3, -1)); // Expected: -3
        System.out.println("Min(-3,-1,-2) = " + findMin(-3, -1, -2)); // Expected: -3

        System.out.println("\n=== SKENARIO 3: Angka 0, 0, 1 ===");
        System.out.println("Min(0,0,1) = " + findMin(0, 0, 1)); // Expected: 0
        System.out.println("Min(0,1,0) = " + findMin(0, 1, 0)); // Expected: 0
        System.out.println("Min(1,0,0) = " + findMin(1, 0, 0)); // Expected: 0

        int result1 = findMin(1, 2, 3);
        System.out.println("Skenario 1 -> Min(1,2,3) = " + result1); // Expected: 1

        int result2 = findMin(-1, -2, -3);
        System.out.println("Skenario 2 -> Min(-1,-2,-3) = " + result2); // Expected: -3

        int result3 = findMin(0, 0, 1);
        System.out.println("Skenario 3 -> Min(0,0,1) = " + result3); // Expected: 0
    }
}