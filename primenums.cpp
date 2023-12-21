#include <bits/stdc++.h>
#include <iostream>
using namespace std;

void printPrimes(int l, int u){
    //use sieve of eratosthenes to find prime numbers smaller than u
    //use a bool array
    int isPrime[u+1];
    for(int i = 0; i < u+1; i++){
        isPrime[i] = 1;
    }
    
    for(int i = 2; i <= u;i++){
        if(isPrime[i] == 1){
            for(int j = i*i; j <= u; j += i){
                isPrime[j] = 2;
            }
        }
    }

    for(int i = l; i <= u+1; i++){
        if(isPrime[i] == 1){
            cout << i << " ";
        }
    }


}

int main(){
    //given a range of ints by lower and upper limits, construct list of all prime numbers in that range
    int l, u;
    cin >> l >> u;
    printPrimes(l,u);
    
} 