package com.greatlearning.currencyDenomination;
import java.util.Arrays;

public class MergeSort {
	int[] sort(int array[]) {
		if(array.length ==1)
			return array;
		int mid =  array.length/2;
		
		int[] leftArray = new int[array.length/2];
		int[] rightArray = new int[array.length - leftArray.length];
		
		
			leftArray = Arrays.copyOfRange(array,0,mid);

		
		sort(leftArray);
		
		rightArray = Arrays.copyOfRange(array,mid,array.length);
		rightArray = sort(rightArray);
		
		return merge(leftArray, rightArray);
	}
	
	public int[] merge (int leftArray[], int rightArray[])
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] resultArray = new int[leftArray.length + rightArray.length];
		
		while(i < leftArray.length && j < rightArray.length) {
			if(leftArray[i] > rightArray[j]) {
				resultArray[k] = leftArray[i];
				i++;
			}
			else {
				resultArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < leftArray.length) {
			resultArray[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < leftArray.length) {
			resultArray[k] = leftArray[j];
			k++;
			j++;
		}
		
		return resultArray;
	}
	
}
