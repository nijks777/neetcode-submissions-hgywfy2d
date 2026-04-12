class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int l=0;
    int sum=0;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>=target){
            min=Math.min(i-l+1,min);
            sum-=nums[l];
            l++;
        }
    }
    if(min==Integer.MAX_VALUE){
        return 0;
    }else{
        return min;
    }
    }
}