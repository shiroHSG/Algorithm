package Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort sorter = new SelectionSort();

        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println("정렬 전 배열");
        sorter.printArr(arr);

        System.out.println("정렬 후 배열");
        sorter.selectionSort(arr);
        sorter.printArr(arr);

    }

    public void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    //최소값을 찾아서 정렬되지 않은 배열의 맨 앞자리와 교환
    public void selectionSort(int[] arr) {
        int minIndex, temp;
        for(int i=0; i<arr.length; i++) {
            minIndex=i;
            //최소값을 갖는 index 찾기
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex]>arr[j])
                    minIndex = j;
            }
            //최소값을 정렬되지 않은 배열의 맨 앞자리와 교환
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
