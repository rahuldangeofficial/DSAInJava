import java.util.*;

public class cyclicSortExample{
  public static void main(String[] args){
    int[] arr={3,2,5,1,4};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }
    
  public static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correctIndex=arr[i]-1;
      if(arr[i]!=arr[correctIndex]){
        int temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
      }else{
        i++;
      }
    }
  }
}
