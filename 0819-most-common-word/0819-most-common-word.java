class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String>set=new HashSet<>();
        for(String s:banned)
        {
            set.add(s.toLowerCase());
        }
        char[] str=paragraph.toLowerCase().toCharArray();
        StringBuilder res=new StringBuilder();
        for(char st:str)
        {
            if(Character.isLetter(st))
            {
                res.append(st);

            }
            else{
                res.append(" ");
            }
        }
        String[] words=res.toString().split("\\s+");
        
        int max=0;
        String maxkey="";
       
        HashMap<String,Integer>mp=new HashMap<>();
        for(String s:words)
        {
            if(!set.contains(s) && s.length()>0)
            {
            mp.put(s,mp.getOrDefault(s,0)+1);

            }

        }
        for(Map.Entry<String,Integer>ent:mp.entrySet())
        {
            if(ent.getValue()>max)
            {
                max=ent.getValue();
            maxkey=ent.getKey();
            }
        }
        return maxkey;
        
    }
}