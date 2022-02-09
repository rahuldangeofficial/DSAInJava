import java.util.*;

public class binarySearchExample {
  public static void main(String[] args) {
    int[] arr={22,24,32,33,34,66,72,77,88,99};
    int target=66; 
    System.out.println(binarySearch(arr,target));
  }
  public static int binarySearch(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==target){
        return mid;
      }else if(arr[mid]<target){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }
    return -1;
  }
}
