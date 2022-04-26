#include <bits/stdc++.h>
using namespace std;
//this is not the version showed in the video, and is actually worse.
bool palindrome(string s, int count){
	if(s.length() == 0 || s.length() == 1 || count == s.length()/2){
		return true;	
	}	
	if(s[count] == s[s.length() -1 - count])
	{
		return palindrome(s, count + 1);
	}
	return false;
}

bool sup(string s){return palindrome(s,0);}

int main(void){
	string s;
	cin >> s;
	cout << sup(s);
	return 0;
}
