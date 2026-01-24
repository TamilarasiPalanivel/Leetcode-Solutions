class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0],ind=0,f=1,ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if(nums[i]>max)
           {
            max=nums[i];
            ind=i;

           }

        }
        //System.out.println(ind);
        for(int i=0;i<n;i++)
        {
            if(ind==i)
            {
                continue;
            }
            if(max>=2*nums[i])
            {
                f=1;
            }
            else
            {
                f=0;
                break;
                
            }
        }
        if(f==1)

        {
            ans=ind;
        }
        else
        {
            ans=-1;
        }
        return ans;
    }
}