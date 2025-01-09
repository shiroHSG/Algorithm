package Search;

import java.util.Arrays;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        System.out.println(Arrays.toString(arr));

        int result = linearSearch(arr, 0);
        if(result != -1) {
            System.out.println("찾는 값의 index : "+ result);
        }
        else
            System.out.println("찾는 값이 배열 내에 없습니다.");

    }
}
