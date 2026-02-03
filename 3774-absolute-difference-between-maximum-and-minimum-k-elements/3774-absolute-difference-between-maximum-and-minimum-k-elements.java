class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=n-k;
        int s1=0,s2=0;
        while(i<n){
            s1=s1+nums[i];
            i++;
        }
        i=0;
        while(i<k){
            s2=s2+nums[i];
            i++;

        }
        
        return Math.abs(s2-s1);
        
    }
}