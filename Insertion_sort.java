package Sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr ={2,11,4,23,15,7,5};
        InsertionSort(arr);
        for(int k:arr){
            System.out.print(k + " ");
        }

    }
    public static  void InsertionSort(int [] arr){

        for (int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                 j--;
            }
            arr[j+1]=key;

        }
    }
}
