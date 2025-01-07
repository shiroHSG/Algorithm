package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        BubbleSort sorter = new BubbleSort();
        System.out.println("정렬 전 배열");
        sorter.printArr(arr);

        System.out.println("오름차순 정렬 후 배열");
        sorter.bubbleSort(arr);
        sorter.printArr(arr);
    }

    public void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                //오름차순
                if(arr[j] > arr[j+1]) { //인접한 것 둘 비교
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

