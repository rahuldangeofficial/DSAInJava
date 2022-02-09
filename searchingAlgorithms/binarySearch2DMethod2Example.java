import java.util.*;

public class binarySearch2DMethod2Example {
    public static void main(String[] args) {
      int[][] arr={
        {10,12,14,16},
        {18,20,22,24},
        {26,28,30,32},
        {34,36,38,40}
      };
      
      int target=38;
      
      System.out.println(Arrays.toString(search(arr,target)));
    }
    
    public static int[] search(int[][] arr,int target){
      int r=arr.length;
      int c=arr[0].length;
      int start=0;
      int end=(r*c)-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid/r][mid%c]==target){
          int i=mid/r;
          int j=mid%c;
          return new int[]{i,j};
        }
        if(arr[mid/r][mid%c]>target){
          end=mid-1;
        }
        if(arr[mid/r][mid%c]<target){
          start=mid+1;
        }
      }
      return new int[]{-1,-1};
    }
}
