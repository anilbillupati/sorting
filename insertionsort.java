import java.util.*;
import java.util.Scanner ;


public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //  taking the array input 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //calling the bubble sort method and printing output
        insertionsort(n,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    //  insertion sort selects an element and places in its correct position or order
    static void insertionsort( int n,int arr[]){
        for (int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
              j--;
            }
        }
    } 
    
}
