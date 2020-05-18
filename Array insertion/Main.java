#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0,loc,val;
  std::cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr1[n+1],arr2[n];
  std::cout<<"Enter the elements in the array"<<endl;
  
  for(int i=0;i<n;i++)
  {
  
      cin>>arr1[i];
      
    
  }
  std::cout<<"Enter the location where you wish to insert an element"<<endl;
  std::cin>>loc;
  if(loc > n+2)
  {
      std::cout<<"Invalid Input";
      exit(0);
  }
  
  std::cout<<"Enter the value to insert"<<endl;
  std::cin>>val;
  int i=0;
  
  for(int j=loc-1;j<n;j++)
  {
      arr2[i]=arr1[j];
      i++;
      
  }
  
  arr1[loc-1]=val;
  for(int i=loc;i<n+1;i++)
  {
      arr1[i]=arr2[i-loc];
      
  }
  std::cout<<"Array after insertion is"<<endl;
  for(int i=0;i<n+1;i++)
  {
      std::cout<<arr1[i]<<endl;
  }
  
  
    
  return 0;
}