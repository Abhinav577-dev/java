class TilingProb{


    public static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }
        // // vertical choice
        // int verticalTiles = tilingProblem(n-1);

        // //horizontal choice
        // int horizontalTiles = tilingProblem(n-2);

        // int totalWays = verticalTiles + horizontalTiles;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args){
        System.out.println(tilingProblem(4));
    }
}