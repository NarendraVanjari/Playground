#include<iostream>
int main()
{
	int n1,n2,exp,ans;
  std::cout<<"Enter first number : ";
  std::cout<<"Enter second number : ";
  std::cin>>n1;
    std::cin>>n2;
  
  std::cout<<"Menu\n";
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";
 
    

	std::cin>>exp;	
  switch(exp)
    {
      case 1 :  ans=n1+n2;
       			std::cout<<ans;break;
      case 2 :  ans=n1-n2;
        		std::cout<<ans;break;
      case 3 :  ans=n1*n2;
        		std::cout<<ans;break;
      case 4 :  ans=n1/n2;
        		std::cout<<ans;break;
      case 5 :  ans=n1%n2;
       			std::cout<<ans;break;
      default : 
        std::cout<<"Invalid operation";break;
      
      
    }
}