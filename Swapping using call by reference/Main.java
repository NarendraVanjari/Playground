#include<iostream>
using namespace std;
  void fun(int &x,int &y)
  {
    x=x+y;
    y=x-y;
    x=x-y;
  }
  int main()
  {
    int a,b;
    cin>>a>>b;
    cout<<"Before swapping a= "<<a<<" and b="<<b;
    fun(a,b);
    cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
  }
