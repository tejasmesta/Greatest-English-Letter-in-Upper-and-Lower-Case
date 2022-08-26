class Solution {
    public String greatestLetter(String s) {
        int n = s.length();
        
        boolean upper[] = new boolean[26];
        boolean lower[] = new boolean[26];
        
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
            {
                upper[c-'A'] = true;
            }
            else
            {
                lower[c-'a'] = true;
            }
        }
        
        String ans = ""; 
        
        for(int i=25;i>=0;i--)
        {
            if(upper[i]==true && lower[i]==true)
            {
                ans += (char)('A'+i);
                break;
            }
        }
        
        return ans;
    }
}
