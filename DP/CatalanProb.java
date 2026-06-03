import java.util.*;
class CatalanProb {
    public static int catalanRec(int n) {
        if(n == 0 || n == 1) return 1;

        int ans = 0;
        for(int i=0; i<= n-1; i++) {
            ans += catalanRec(i) * catalanRec(n-1-i);
        }
        return ans;
    }

    public static int catMen(int n, int dp[]) {
        if(n ==0 || n == 1) {
            return 1;

        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += catMen(i, dp) * catMen(n-1-i, dp);
        }

        return dp[n] = ans;
    }

    public static int catTab(int n) {
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            for(int j=0; j<i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalanRec(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(catMen(n, dp));
        System.out.println(catTab(n));
    }
}