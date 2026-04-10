package Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int [] arr={29,41,63,17,90,60,12};
        bubblesort(arr);

    }
    public static void bubblesort(int[] arr){
        for (int turn=1; turn<arr.length; turn++){
            for (int i=0; i<arr.length-turn;i++){
                if (arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
