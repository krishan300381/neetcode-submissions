class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max = 0;
        while (i<j)
        {
            int water = Math.min( heights[i], heights[j]) * (j-i);
            System.out.println(water);
            if(max < water) max = water;

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
