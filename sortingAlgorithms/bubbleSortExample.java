import java.util.*;

public class bubbleSortExample {
  public static void main(String[] args) {
    int[] arr={3,7,9,2,4,8,1,5,6,0};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
    
  public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=1;j<arr.length-i;j++){
        if (arr[j-1]>arr[j]){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        } 
      }
    } 
  }
}
