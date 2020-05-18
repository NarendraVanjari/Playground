#include <stdio.h>

int main()
 {
int i,j,n;

scanf("%d",&n);
for(i=1;i<=n;i++)
{
    if(i%2==0)
    {
        printf("%d",i+1);
    }
    for(j=1;j<=n-1;j++)
    {
        printf("%d",i);
    }
    if(i%2!=0)
    {
        printf("%d",i+1);
    }
        printf("\n");
    }
    
    return 0;
    
}