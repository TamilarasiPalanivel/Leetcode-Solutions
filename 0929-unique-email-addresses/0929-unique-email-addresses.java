class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String>set=new HashSet<>();
        int n=emails.length;
        for(int ind=0;ind<n;ind++)
        {
            String s=emails[ind];
            String[] parts=s.split("@");
            String local=parts[0];
            String domain=parts[1];
        StringBuilder res=new StringBuilder();
            for(int i=0;i<local.length();i++)
            {
                if(local.charAt(i)=='+')
                {
                   break;
                }
                if(local.charAt(i)!='.'){
                res.append(local.charAt(i));

                }

            }
            set.add(res.toString()+"@"+domain);

        }
        return set.size();

        
    }
}