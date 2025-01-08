package Sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end) {
        //재귀함수 탈출 조건
        if(start<end) {
            int mid=(start+end)/2;
            //분할
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            //결합
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int leftIndex = start;
        int rightIndex = mid + 1;
        int tempIndex = start;
        //원함수에 복원하기위해 임시로 쓰는 배열
        int[] temp = new int[arr.length];   
        //한 배열의 index가 끝날때까지 값을 계속 넣어줌
        while(leftIndex <= mid && rightIndex <= end) {
            //비교해서 더 작은 값부터 순서대로 넣어줌
            if(arr[leftIndex]<arr[rightIndex]) {
                temp[tempIndex] = arr[leftIndex++];
            }
            else {
                temp[tempIndex] = arr[rightIndex++];
            }
            tempIndex++;
        }
        //배열의 남은 원소를 채워넣음
        while(leftIndex<=mid) {
            temp[tempIndex++] = arr[leftIndex++];
        }
        while(rightIndex<=end) {
            temp[tempIndex++] = arr[rightIndex++];
        }

        for(int i = start; i<=end; i++) {
            arr[i] = temp[i];
        }
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
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
        
    
}
