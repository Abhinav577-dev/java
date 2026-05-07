import java.util.*;

class FloodFill {

    public void helper(int[][] image, int sr, int sc,
                       int color, boolean vis[][], int orgCol) {

        // Base Case
        if(sr < 0 || sc < 0 ||
           sr >= image.length ||
           sc >= image[0].length ||
           vis[sr][sc] ||
           image[sr][sc] != orgCol) {

            return;
        }

        // mark visited
        vis[sr][sc] = true;

        // change color
        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public int[][] floodFillDemo(int image[][],
                                 int sr, int sc, int color) {

        boolean vis[][] = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, image[sr][sc]);

        return image;
    }

    public static void main(String[] args) {

        FloodFill obj = new FloodFill();

        int image[][] = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };

        int ans[][] = obj.floodFillDemo(image, 1, 1, 2);

        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}