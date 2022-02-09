import java.util.*;

public class insertionSortExample {
  public static void main(String[] args) {
    int[] arr={9,5,6,4,3,1,0,2,8,7};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
    
  public static void insertionSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j>0;j--){
        if(arr[j]<arr[j-1]){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }else{
          break;
        }
      }
    }
  }
}
