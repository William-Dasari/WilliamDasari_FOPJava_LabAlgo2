package com.gl.currencycounting.service;

public class MergeSort {
	public void mergeSorting(int denominations[], int left, int mid, int right) {
		
		
			// Finding array size and creating new arrays
		
			int first= mid - left + 1;
			int second = right - mid;
			int leftArray[] = new int[first];
			int rightArray[] = new int[second];

			
			for (int a = 0; a < first; ++a)
				leftArray[a] = denominations[left + a];
			for (int b = 0; b < second; ++b)
				rightArray[b] = denominations[mid + 1 + b];

			// Merge the temporary arrays

			// Initial indexes of first and second sub-arrays
			int i = 0, j = 0;

			// Initial index of merged sub-array array
			int k = left;
			while (i < first && j < second) {
				
				
				
				if (leftArray[i] >= rightArray[j]) {
					denominations[k] = leftArray[i];
					i++;
				} else {
					denominations[k] = rightArray[j];
					j++;
				}
				k++;
			}

			//Copy remaining elements 
			
			
			while (i < first) {
				denominations[k] = leftArray[i];
				i++;
				k++;
			}

			while (j <second) {
				denominations[k] = rightArray[j];
				j++;
				k++;
			}
		}

		
		public void sorting(int[] denominations, int left, int right) {
			if (left < right) {
				
				
				//finding the middle point and dividing into two halves
				
				int mid = (left+right)/ 2;
				sorting(denominations, left, mid);
				sorting(denominations, mid + 1, right);

				// Merging the halves
				mergeSorting(denominations, left, mid, right);
				
				
				}
			}
		}

	


