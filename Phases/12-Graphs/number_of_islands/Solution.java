class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    explore(grid, i, j);
                    ans++;
                }
            }
        }

        return ans;
    }

    private void explore(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1) {
            return;
        }

        if (j < 0 || j > grid[0].length - 1) {
            return;
        }

        if (grid[i][j] == '0') {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            explore(grid, i, j - 1);
            explore(grid, i, j + 1);
            explore(grid, i - 1, j);
            explore(grid, i + 1, j);
        }
    }
}