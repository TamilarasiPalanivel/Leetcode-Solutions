class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n1=aliceSizes.length;
        int n2=bobSizes.length;
        int s1=0,s2=0;
        for(int i=0;i<n1;i++)
        {
            s1=s1+aliceSizes[i];
        }
        for(int i=0;i<n2;i++)
        {
            s2=s2+bobSizes[i];
        }
        int diff=(s2-s1)/2;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n2;i++)
        {
            set.add(bobSizes[i]);
        }
        for(int i=0;i<n1;i++)
        {
            int b=diff+aliceSizes[i];
            if(set.contains(b))
            {
                return new int[]{aliceSizes[i],b};
            }
        }
        return new int[0];
        
    }
}