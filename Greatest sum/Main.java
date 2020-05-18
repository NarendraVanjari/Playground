#include<iostream>
using namespace std;
int main()
{
  int n,m,rowsum=0,colsum=0,colmax=0,rowmax=0,rno,cno;
  cin>>n>>m;
  int arr[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    { 
    	cin>>arr[i][j]; 	
    }
  }
  std::cout<<"Sum of rows is ";
    for(int i=0;i<n;i++)
  {
      rowsum=0;
    for(int j=0;j<m;j++)
    {
      rowsum=rowsum+arr[i][j];
    }
      
      cout<<rowsum<<" ";
      if(rowmax < rowsum)
      {
      		rowmax=rowsum;
        	rno=i;
      }
      
  }
  std::cout<<endl;
  std::cout<<"Row "<<rno+1<<" has maximum sum"<<endl;
  std::cout<<"Sum of columns is ";
  for(int i=0;i<n;++i)
  {
    colsum=0;
    for(int j=0;j<m;++j)
    {
      colsum=colsum+arr[j][i];
  	}
      
     cout<<colsum<<" ";
    if(colmax < colsum)
    {
    	colmax=colsum;
      	cno=i;
    }
  }
  std::cout<<endl;
  std::cout<<"Column "<<cno+1<<" has maximum sum";
  
  
  return 0;
}
	