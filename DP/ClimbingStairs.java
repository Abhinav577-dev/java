import java.util.*;
class ClimbingStairs {
    public static int waysMem(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        return waysMem(n-1) + waysMem(n-2);
    }
    public static int waysTab(int n, int ways[]) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(ways[n] != -1) {
            return ways[n];
        }

        ways[n] = waysTab(n-1, ways) + waysTab(n-2, ways);
        return ways[n];
    }
    public static int waysTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("Using the Memorization : " + waysMem(n));
        System.out.println("Using the Tabulation : " + waysTab(n, ways));
        System.out.println("Using the Tabulation : " + waysTabulation(n));
    }
}