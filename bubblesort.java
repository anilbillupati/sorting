import java.util.*;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of an arr :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // tsking the arr input from user
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //calling the bubble sort and printing the output
        bubblesort(n,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    // bubble w=sort woking is finding the maxmimum element and swapping with the adusent element 
    static void bubblesort(int n,int arr[]){
        for(int i=n-1; i>=1;i--){ // or int i=0;i<n-1;i++
            for(int j=0;j<i-1;j++){ //or int j=0;j<n-i-1;
                if(arr[j]>arr[j+1]) {
                    // swapping the max element with adjucent number 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
}
