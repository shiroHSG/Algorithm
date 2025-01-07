package Sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++)
            arr[i] = (int)(Math.random()*10);

        InsertSort sorter = new InsertSort();
        
        System.out.println("정렬 전 배열");
        sorter.printArr(arr);

        System.out.println("정렬 후 배열");
        sorter.inserSort(arr);
        sorter.printArr(arr);

    }

    public void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void inserSort(int[] arr) {
        //2번째 요소부터 비교
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int prev = i-1;
            //값이 크면 이전 값을 다음 값으로 복사
            while(prev>=0 && arr[prev]>temp) {
                arr[prev+1] = arr[prev];
                prev--; //그 앞의 값을 비교
            }
            //값이 크지 않을 경우 그 자리에 저장했던 값을 복사
            arr[prev+1] = temp;
        }
    }
}