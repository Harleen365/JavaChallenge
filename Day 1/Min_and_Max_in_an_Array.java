//Question Link: https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        long min=arr[0];
        long max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new Pair<>(min,max);
    }
}
