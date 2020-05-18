#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0,m1;
  cin>>n>>m;
  int arr1[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
      cin>>arr1[i][j];
    
  }
  for(int i=0;i<n;i++)
  {
      sum=0;
      for(int j=0;j<m;j++)
      {
          if(sum < arr1[i][j])
          {
              sum=arr1[i][j];
          }
      }
      std::cout<<sum<<endl;
  }
    
    
  return 0;
}