class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int i;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int max=0,val=0;
        for(Map.Entry<Integer,Integer>ent:mp.entrySet())
        {
            if(ent.getValue()>max)
            {
                max=ent.getValue();
                val=ent.getKey();
            }
        }
        return val;
        
    }
}