class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int nums2[]=new int[2*n];
        for(int i=0;i<nums2.length;i++){
            if(i<nums.length){
                nums2[i]=nums[i];
            } else{
                nums2[i]=nums2[i-n];
            }
        }
        return nums2;
    }
}