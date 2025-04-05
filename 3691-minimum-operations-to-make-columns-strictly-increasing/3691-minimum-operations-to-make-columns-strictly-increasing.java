public class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int operations = 0;

        for (int col = 0; col < n; col++) {
            for (int row = 1; row < m; row++) {
                if (grid[row][col] <= grid[row - 1][col]) {
                    int required = grid[row - 1][col] + 1;
                    operations += required - grid[row][col];
                    grid[row][col] = required;  // Update for future rows
                }
            }
        }

        return operations;
    }
}
