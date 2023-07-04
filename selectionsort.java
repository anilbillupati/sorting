import java.util.*;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of an arr:");
        int n=sc.nextInt();
        int arr[] =new int[n];
        // taking the array input using the for loop
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort( n, arr);
        // printing hte sorted arr
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    // creating a function that can implement the selection sort
    // in selection sort after each iteration smallest element is sorted 
    // for all the time complexity cases selection sort takes O(n^2)
    static void selectionsort(int n,int arr[]){
        for (int i=0;i<n-1;i++)
        {
            //finding the min from array and placing it in ascending order 
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            // swapping to store the array in ascending order 
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
}
