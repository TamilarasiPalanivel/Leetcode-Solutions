class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        Set<String>set=new HashSet<>();
        for(String w:words)
        {
            StringBuilder res=new StringBuilder();
            for(char c:w.toCharArray())
            {
                res.append(morse[c-'a']);
            }
            set.add(res.toString());
        }
        return set.size();
        
    }
}