#include <bits/stdc++.h>
using namespace std;
/*
return recursively the sum of all the numbers up to N
*/
int r_sum(int n){
	if(n <= 1){
		return n;
	}
	return n + r_sum(n-1);
}
int main (void){
	int n = 0; 
	cin >> n; 
	cout << r_sum(n);
	return 0;
}
