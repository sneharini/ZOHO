/*
 * 1. Replace every element with the greatest element on right side
Last Updated: 06-05-2019
Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, 
then it should be modified to {17, 5, 5, 5, 2, -1}.

 */

public class replaceWithGreater1 {
    private static int[] solve(int[] arr) {
        int n = arr.length;
        int max = -1;

        int[] ans = new int[n];
        ans[n - 1] = -1;
        for (int i = n - 1; i > 0; i--) {
            max = Math.max(max, arr[i]);
            ans[i - 1] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int[] result = solve(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
