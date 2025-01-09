package Search;

import java.util.Arrays;

public class BinarySearch {

        public static int binarySearch(int arr[], int target) {
            int left = 0;
            int right = arr.length-1;
            
            while(left<=right) {
                int mid = (left+right)/2;
                if(arr[mid] == target) {
                    return mid;
                }
                else if(arr[mid] > target) {
                    right = mid-1;
                }
                else
                    left = mid+1;
            }
            return -1;
        }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9};

        System.out.println(Arrays.toString(arr));

        int result = binarySearch(arr, 6);
        if(result != -1) 
            System.out.println("찾는 값의 index : "+ result);
        else
            System.out.println("찾는 값이 배열 내에 없습니다.");
    }
}
