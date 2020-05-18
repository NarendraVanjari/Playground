#include <iostream>
int main() 
{
int n;
  int m;
  int r,rV=0;
  std::cin>>n;
  while( n!=0)
  {
  	r=n%10;
    rV=rV*10+r;
    n/=10;
  
    
  }
    std::cout<<rV;
}