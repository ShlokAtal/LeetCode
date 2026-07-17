class Solution
{
    public int strStr(String s, String t)
    {
        for(int i=0; i<=s.length()-t.length();i++)
        {
            if(s.substring(i, i+t.length()).equals(t))
            {
                return i;
            }
        }
        return -1;
    }
}