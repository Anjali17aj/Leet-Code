class Solution {
    public int trap(int[] height) {
             int leftMax[]= new int[height.length];  //leftmax has size: height of own building and max of left buildings
        leftMax[0]=height[0]; //our 0th index building has no left so its height is 0 and is compared with 0.
        for(int i=1; i<height.length; i++) {// for i =0 it has already been calculated in the previous line.
            leftMax[i] = Math.max(height[i],leftMax[i-1]); // finding maximum from height[i] which is current height , leftMax[i-1] is left max height of building. 
        }

        //calculate right maximum boundary - auxiliary arrays
         int rightMax[]=new int[height.length];
         rightMax[height.length-1]=height[height.length-1];
         for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }

         int trappedRwater=0;
         //loop
         for(int i=0; i<height.length; i++) {
         int waterlevel = Math.min(leftMax[i], rightMax[i]);//waterlevel= min(left maximum boundary, right maximum boundary)
         trappedRwater += waterlevel - height[i]; //Trapped RainWater = (waterlevel - height[i])*width.
         }
         return trappedRwater;
    }
    }