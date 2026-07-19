class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start = image[sr][sc];

        if (start != color) {
            fillDFS(image, sr, sc, color, start);
        }

        return image;
    }

    private void fillDFS(int[][] image, int row, int col, int color, int start) {
        // System.out.println(Arrays.deepToString(image));
        // System.out.println(row + " " +  col);
        // System.out.println();
        if (row >= 0 && row < image.length && col >= 0 && col < image[0].length) {
            if (image[row][col] == start) {
                image[row][col] = color;

                fillDFS(image, row, col - 1, color, start);
                fillDFS(image, row, col + 1, color, start);
                fillDFS(image, row - 1, col, color, start);
                fillDFS(image, row + 1, col, color, start);
            }
        }
    }
}