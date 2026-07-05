package LeetCode.LongestCommonPrefix;

public class Solution
{
    public static String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0)
        {
            return "";
        }
        // Take the first string as reference
        String prefix = strs[0];
        // Compare with each other string
        for (int i = 1; i < strs.length; i++) 
        {
            // Keep reducing prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix))
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                { 
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) 
    {
        // In-built inputs for testing
        String[] w1 = {"flower", "flow", "flight"};
        String[] w2 = {"dog", "racecar", "car"};

        System.out.println("Example 1: " + longestCommonPrefix(w1)); // Output: fl
        System.out.println("Example 2: " + longestCommonPrefix(w2)); // Output: (empty string)
    }
}