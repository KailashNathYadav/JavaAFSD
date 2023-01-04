package dataStructure.array;
import java.util.Arrays;

public class MainArray {
	public static void main(String[] args) {
//		Array in java
		int[] arr = new int[5];
		Arrays.fill(arr,0 , 3, 5);
		System.out.println(Arrays.toString(arr));
		arr[2] = arr[4] = 3;arr[3] = 1;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(Arrays.compare(arr,new int[] {2,3,4}));
		System.out.println(Arrays.compare(new int[] {5,5,3,1,3}, arr));
		System.out.println(Arrays.compare(new int[] {2,3,4}, arr));
		System.out.println(Arrays.binarySearch(arr, 3));
		System.out.println(arr.equals(new int[] {5,5,3,1,3}));
	}
}
