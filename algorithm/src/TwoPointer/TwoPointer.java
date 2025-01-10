package TwoPointer;

public class TwoPointer {

    public static int[] twoSum(int arr[], int target) {
        int left = 0;
        int right = arr.length-1;

        int currentSum;

        while(left<right) {
            currentSum = arr[left]+arr[right];
            if(currentSum == target)
                return new int[]{arr[left], arr[right]};
            else if(currentSum < target)
                left++;
            else
                right--;
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15, 16, 20, 25, 29 };
        int target = 35;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("두 수의 합이 " + target + "인 값은: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("두 수의 합이 " + target + "인 값을 찾을 수 없습니다.");
        }
    }
}
