import java.util.*;

public class selectionSortExample {
  public static void main(String[] args) {
    int[] arr={9,8,4,3,5,2,7,1,0,6};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
      int last=arr.length-1-i;
      for(int x=0;x<last;x++){
        if(arr[x]>arr[last]){
          int temp=arr[last];
          arr[last]=arr[x];
          arr[x]=temp;
        }
      }
    }
  }
}
