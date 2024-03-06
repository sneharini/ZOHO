/*
 * 17.Given an array of integers, compute the maximum value for each integer in the index,
 *  by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)
•	Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.

 */

public class maxDigits {

    private static int[] solve(int[] a) {
        int len = a.length;
        int[] ans = new int[len];
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            int mul = 1;
            int n = a[i];
            while (n > 0) {
                int digits = n % 10;
                sum += digits;
                mul *= digits;
                n = n / 10;
            }
            max = Math.max(sum, mul);
            ans[k++] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 120, 24, 71, 10, 59 };
        int[] result = solve(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
