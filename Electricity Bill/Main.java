#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unitConsumed,bill;
  std::cin>>unitConsumed;
  if(unitConsumed<=200)
  {
    bill=unitConsumed*0.5;
  	std::cout<<"Rs."<<bill;
  }
  
}