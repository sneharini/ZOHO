/*
 * 2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
 */

import java.util.ArrayList;

public class matrix {
    private static int[][] solve(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<Integer> rowZeros = new ArrayList<>();
        ArrayList<Integer> colZeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    rowZeros.add(i);
                    colZeros.add(j);
                }
            }
        }

        for (int i = 0; i < rowZeros.size(); i++) {
            for (int j = 0; j < m; j++) {
                arr[rowZeros.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < colZeros.size(); i++) {
            for (int j = 0; j < n; j++) {
                arr[j][colZeros.get(i)] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 24, 6, 0 },
                { 4, 2, 0, 0 },
                { 9, 0, 7, 3 }
        };
        int[][] ans = solve(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
