#include<iostream>
using namespace std;
int main()
{
int stud,max=0;
  cin>>stud;
  int size=stud;
  int arrmks[size];
  for(int i=0;i<size;i++)
  {
  cin>>arrmks[i];
    if(arrmks[i]>=max)
      max=arrmks[i];
  }
  cout<<max;
  
}