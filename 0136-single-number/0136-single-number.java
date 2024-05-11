class Solution {
    public int singleNumber(int[] nums) {

        
        int i;
        int val=0;
        for(i=0;i<=nums.length-1;i++){
          val = val^nums[i]; 
     
    }
       return val;
}}