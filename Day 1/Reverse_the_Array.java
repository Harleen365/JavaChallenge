//Question Link: https://www.naukri.com/code360/problems/reverse-the-array_1230540?leftPanelTabValue=PROBLEM
import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<N;i++){
          arr[i]=sc.nextInt();
		}
		reverseArr(arr,N);
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void reverseArr(int arr[],int N){
		int left=0;
		int right=N-1;
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
}
