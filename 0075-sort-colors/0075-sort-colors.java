public class Solution 
{
    public static void sortColors(int[] nums) 
    {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) 
        {
            switch (nums[mid]) 
            {
                case 0:
                    swap(nums, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) 
    {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.print("Sorted Colors: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}