public class quaternarySearchExample{
    public static void main(String args[]){
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println(quaternarySearch(arr,0,arr.length-1,target));
    }
    public static int quaternarySearch(int[] arr, int start, int end, int target) {
        if(end>=start) {
            int mid1=start+(end-start)/4;
            int mid2=mid1+(end-start)/4;
            int mid3=mid2+(end-start)/4;
        if(arr[mid1]==target){
            return mid1;
        }
        if(arr[mid2]==target){
            return mid2;
        }
        if(arr[mid3]==target){
            return mid3;
        }
        if(arr[mid1]>target){
            return quaternarySearch(arr,start,mid1-1,target);
        }
        if(arr[mid2]>target){
            return quaternarySearch(arr,mid1+1,mid2-1,target);
        }
        if(arr[mid3]<target){
            return quaternarySearch(arr,mid3+1,end,target);
        }
        return quaternarySearch(arr,mid2+1,mid3-1,target);
    }
    return -1;
    }
}