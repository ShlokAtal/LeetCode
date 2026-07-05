public class Solution 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        // Check every pair of numbers
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                // If the sum matches the target, return their index
                if (nums[i] + nums[j] == target) 
                {
                    return new int[] { i, j };
                }
            }
        }
        // Return empty array if no pair found
        return new int[] {};
    }
    public static void main(String[] args) 
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indexs: " + result[0] + ", " + result[1]);
    }
}