import java.util.*;

class TrappedWater {
    
    public static int trap(int[] height) {
        // calculate left max boundary
        int n = height.length;
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(LeftMax[i], rightMax[i]);
            trappedWater += waterLevel -height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int p = trap(height);
        System.out.println(p);
    }
}