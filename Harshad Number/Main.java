#include<iostream>
using namespace std;
int main()
{
int n;
int temp;
cin >> n;
int sum = 0;
temp = n;
while(temp)
{
sum += temp % 10;
temp = temp / 10;
}
int r = n % sum;
if(r == 0)
  cout <<"Harshad Number";
else
cout <<"Not Harshad Number";
return 0;
}