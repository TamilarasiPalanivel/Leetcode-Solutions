class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int n=deck.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        if(n==1)return false;
        for(int i=0;i<n;i++)
        {
            mp.put(deck[i],mp.getOrDefault(deck[i],0)+1);
            
        }
        //System.out.println(mp);
        HashSet<Integer>set=new HashSet<>();
        for(Map.Entry<Integer,Integer>ent:mp.entrySet())
        {
            set.add(ent.getValue());
        }
        int gcd=0;
        for(int num:set)
        {
            gcd=findGCD(num,gcd);
        }
        return gcd>=2;
    }
        private int findGCD(int a,int b)
        {
            if(b==0)return a;
            return findGCD(b,a%b);
        }


        
    }
