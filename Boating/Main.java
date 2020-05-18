#include<iostream>
int main()
{
   int wB, nA, nC, tW;
  
	std::cin>>wB;
  	std::cin>>nA;
  	std::cin>>nC;
  	nA=nA*75;
  	nC=nC*30;
  	tW=nC+nA;
  	if(tW<=wB){
      std::cout<<"Boat is stable";
    }
  	else
    {
      std::cout<<"Boat will drow";
    }
}
