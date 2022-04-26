#include <bits/stdc++.h>
using namespace std;
//not problem in memory management;
void merge(int *array, int start, int mid, int end){
//	so we can avoid modifying the original contents
	int *temp = new int[end - start + 1];
	int i = start;
	int j = mid + 1;
	int k = 0;
//	while both of the sub-array have values, then try and merge them in sorted order	
	while( i <= mid && j <= end){
		if(array[i] <= array[j]){
			temp[k++] = array[i++];
		}else{
			temp[k++] = array[j++];
		}
	}
//	add the rest of the values from the left sub-array into the result
	while(i <= mid){
		temp[k] = array[i];
		k++; i++;
	}
//	add the rest of the values from the right sub-array into the result	
	while(j <= mid){
		temp[k] = array[j];
		k++; j++;
	}
//	now we need to send the content from temp to array
//	that's the most important part of the whole code
	for(i = start; i <= end; i++){
		array[i] = temp[i - start];
	}
	free(temp);
}

void merge_sort(int* array, int start, int end){
	if(start < end){
		int mid = (start + end)/2;
	//	to the left
		merge_sort(array, start, mid);
	//	to the right
		merge_sort(array, mid + 1, end);
		merge(array, start, mid, end);
	}
}

int main(void){
	int array[] = {5,1,6,2,-3,0,14};
	cout << "first array\n";
	for(int i = 0; i < 7; i++){
		cout << array[i] << ",";
	}
	merge_sort(array, 0, 6);
	cout << "\nsorted array\n";
	for(int i = 0; i < 7;i++){
		cout << array[i] << ",";
	}
	cout << endl;
	return 0;	
}
