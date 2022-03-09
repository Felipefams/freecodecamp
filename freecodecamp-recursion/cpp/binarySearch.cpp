#include <bits/stdc++.h>
using namespace std;
/*
x is then number we want to find 
*/
int binarySearch(int *array, int firstIndex, int lastIndex, int x){
	if(firstIndex > lastIndex){
//	in case we cant find the number inside the array, we return -1;
		return -1;
	}
	int mid = (firstIndex + lastIndex)/2;
//	if the number the number we are looking for is in the mid, return the index; 
	if(x == array[mid]){
		return mid;
	}
//	if x < array[mid], go to the left 
	else if(x < array[mid]){
		return binarySearch(array, firstIndex, mid-1, x);
	}
//	else, go to the right	
	return binarySearch(array, mid+1, lastIndex, x);
	
}

int main (void){
	int array[] = {0, 11, 20, 32, 41, 53, 71, 89, 90, 100};
	const int k = binarySearch(array, 0, 9, 89);
	cout << k << "\n";
	cout << array[k] << "\n";
	return (0);
}
