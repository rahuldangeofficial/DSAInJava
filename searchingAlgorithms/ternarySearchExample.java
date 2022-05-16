public class ternarySearchExample{
    public static void main(String args[]){
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println(ternarySearch(arr,0,arr.length-1,target));
    }
    static int ternarySearch(int arr[],int start, int end, int target){
        if(end>=start){
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if(arr[mid1]==target){
                return mid1;
            }
            if(arr[mid2]==target){
                return mid2;
            }
            if(target<arr[mid1]){
                return ternarySearch(arr,start,mid1-1,target);
            }
            else if(target>arr[mid2]){
                return ternarySearch(arr,mid2+1,end,target);
            }
            else {
                return ternarySearch(arr,mid1+1,mid2-1,target);
            }
        }
        return -1;
    }
}