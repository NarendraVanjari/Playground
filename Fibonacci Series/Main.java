#include<iostream>
using namespace std;
int Fibonacci(int n)
{
    if (n <= 1) 
        return n; 
    return Fibonacci(n - 1) + Fibonacci(n - 2); 
}
int main()
{
    int n;
   // cout << "Enter the n value: ";
    cin >> n;
    cout <<"The term "<<n<<" in the fibonacci series is "<< Fibonacci(n - 1);
}