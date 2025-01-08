package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        // 원소가 1개 이하일 경우 정렬x
        if(left>=right)
            return;
            // 피벗을 중간값으로 선정
        int pivot = arr[(left+right)/2];

        //피벗을 기준으로 분할하여 작은 값들을 왼쪽, 큰 값들을 오른쪽으로 재배치
        pivot = partition(arr, left, right, pivot);

        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot) {
        while(left<=right) {
            //피벗을 기준으로 왼쪽값이 커지면 그 값을 선택
            while(arr[left] < pivot) {
                left++;
            }
            //피벗을 기준으로 오른쪽값이 작아지면 그 값을 선택
            while(arr[right] > pivot) {
                right--;
            }
            //left와 right가 교차되지 않았다면 교환 
            if(left<=right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        //left를 피벗으로 지정
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println("정렬 전 배열");
        printArr(arr);

        System.out.println("정렬 후 배열");
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
