package SlidingWindow;

//길이가 k인 연속 부분 배열 중에서 원소의 합이 최대가 되는 값 구하기
public class FixedSlidingWindow {
    public static int maxSubSum(int[] arr, int k) {
        
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for(int i = k; i<arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr ={1, 3, 5, 2, 8, 0, 3, 6, 7};
        int k = 3;
        
        System.out.println(maxSubSum(arr, k));
    }
    
}
