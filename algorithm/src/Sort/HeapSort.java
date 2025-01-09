package Sort;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int arr[]) {
        int n = arr.length;

        //초기 최대힙 구성
        //가장 index가 큰 부모노드부터 루트노드까지 차례대로 heapify
        for(int i=n/2-1; i>=0; i--) {
            heapify(arr, n, i);
        }

        //오름차순으로 정렬
        //루트노드와 마지막노드를 swap하고 루트노드가 된 마지막노드를 heapify
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int p = i;
        int l = i*2+1;
        int r = i*2+2;

        //오른쪽 자식노드가 더 클 경우
        if(l<n && arr[l]>arr[p]) {
            p = l;
        }
        if(r<n && arr[r]>arr[p]) {
            p = r;
        }
        //자식노드가 더 큰 경우
        if(p!=i) {
            swap(arr, i, p);
            heapify(arr, n, p);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        System.out.println("정렬 전 배열 : ");
        printArr(arr);
        
        System.out.println("정렬 후 배열 : ");
        heapSort(arr);
        printArr(arr);
        
    }
}
