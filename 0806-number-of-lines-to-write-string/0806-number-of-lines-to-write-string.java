class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int cur=0;
        int l=1;
        for(int i=0;i<s.length();i++)
        {
            int w=widths[s.charAt(i)-'a'];
            if(w+cur<=100)
            {
                cur=cur+w;
            }
            else{
                l++;
                cur=w;
            }
        }
        return new int[]{l,cur};
        
    }
}