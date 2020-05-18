#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int arr1[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
      std::cin>>arr1[i][j];
    
  } 
 
  for(int i=0;i<m;i++)
  {
  		int max= arr1[0][i];
    	
    	for(int j=1;j<n;j++)
        {
        	if (arr1[j][i] > max) 
            {
              max = arr1[j][i];
            }
        }
    	std::cout<<max<<endl;
  }
  
  return 0;
}