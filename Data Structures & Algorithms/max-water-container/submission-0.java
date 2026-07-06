class Solution {
    public int maxArea(int[] heights) {
        int maxwater=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){

                int width=j-i;
                int height=Math.min(heights[j],heights[i]);
                int area=width*height;

                maxwater=Math.max(area,maxwater);
            }
        }
        return maxwater;
    }
}
