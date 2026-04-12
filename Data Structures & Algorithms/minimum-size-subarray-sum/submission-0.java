class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int c;
        int sum;
        for(int i=0;i<nums.length;i++){
            c=0;
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                c++;
                if(sum>=target){
                min=Math.min(min,c);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
        return 0;}
        else{
            return min;
        }
    }
}