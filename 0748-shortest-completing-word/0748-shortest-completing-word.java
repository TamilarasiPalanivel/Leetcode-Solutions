class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder res=new StringBuilder();
       String str=licensePlate.toLowerCase();
       char[] lp=str.toCharArray();
       int n=str.length();
       for(int i=0;i<n;i++)
       {
       if(lp[i]>='a' && lp[i]<='z')
       {
        res.append(lp[i]);
       }
       }
    int y=res.length();
    String ans=null;
       for(String word :words)
       {
        int c=0;
        String t=word.toLowerCase();
        StringBuilder sb=new StringBuilder(t);

        int size=word.length();
        for(int i=0;i<y;i++)
        {
            char ch=res.charAt(i);
            int ind=sb.indexOf(String.valueOf(ch));
            if(ind!=-1)
            {
                c++;
                sb.deleteCharAt(ind);
            }
        }
            if(c==y)
            {
                if(ans==null|| word.length()<ans.length())
                {
                ans=word;

                }
            }
        

       }
       return ans;
        
    }
}