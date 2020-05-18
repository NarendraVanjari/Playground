#include<iostream>
using namespace std;

struct employee{
    char name[30];
    int id,age;
  	char desg[30];
  int salary;
};
 
int main()
{ 
    struct employee emp;    
    std::cout<<"Enter name:\n";
    std::cin>>emp.name;
    std::cout<<"Enter ID:\n";
  	std::cin>>emp.id;
  	std::cout<<"Enter age:\n";
  	std::cin>>emp.age;
    std::cout<<"Enter designation:\n";
  	std::cin>>emp.desg;
  	std::cout<<"Enter Salary:\n";
  	std::cin>>emp.salary;
   
    std::cout<<"Employee Details";
    std::cout<<"\nName of the Employee : "<<emp.name;
  	std::cout<<"\nID of the Employee : "<<emp.id;
  	std::cout<<"\nAge of the Employee : "<<emp.age;
  	std::cout<<"\nDesignation of the Employee : "<<emp.desg;
  	std::cout<<"\nSalary of the Employee : "<<emp.salary;
    return 0;
}
