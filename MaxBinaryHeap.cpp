#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int heap[n],k,a,temp,x;
	int i=0;
	while(i<n){
		cin>>x;
		heap[i] = x;
		a = i;
		k = (a-1)/2;
		while(a != 0 && heap[k] < heap[a]){
			temp = heap[a];
			heap[a] = heap[k];
			heap[k] = temp;
			a = k;
			k = (a-1)/2;
		}
	i++;
	}
	for(int i = 0;i < n;i++){
		cout<<heap[i]<<" ";
	}	
}
