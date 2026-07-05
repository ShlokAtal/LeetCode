public class Solutions 
{
    public static boolean isPalindrome(int x) 
    {
        // Negative numbers are not palindrome
        if(x < 0) 
        {
            return false;
        }
        // Store the original number
        int original = x;
        int reversed = 0;
        // Reverse the number
        while(x != 0) 
        {
            int digit = x % 10;          // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            x = x / 10;                  // Remove last digit
        }
        // Compare reversed number with original
        return original == reversed;
    }
    public static void main(String[] args) 
    {
        int num = 121;
        if (isPalindrome(num)) 
        {
            System.out.println(num + " palindrome!!!");
        } 
        else 
        {
            System.out.println(num + "not palindrome!!!");
        }
    }
}