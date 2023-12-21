#include <bits/stdc++.h>

using namespace std;


void distinctprimes(int n, int primes[10000]){
    int k = 0;
    int i = 2;
    while(k < n && i < 10000){
        if(primes[i] >= 3){
            ++k;
        }

        if(k == n){
            cout << i << "\n";
        }
        ++i;
    }
    
    
}

int main(){
    int T, n;

    cin >> T;

    int isPrime[10000];
    for(int i = 0; i < 10000;i++){
        isPrime[i] = 0;
    }

    for(int i = 2; i < 10000; i++){
        if(isPrime[i] == 0){
            for(int j = 2*i; j < 10000; j += i){
                ++isPrime[j];
            }
        }
    }


    for(int t = 0; t < T; t++){
        cin >> n;
        distinctprimes(n, isPrime);
    }
   
}