#include<stdio.h>
#define R 3
#define C 3
int main()
{
int mat1[R][C],mat2[R][C],mat3[R][C],i,j;
printf("enter the elements of the matrix 1 is %dx%d(row-wise)- :\n",R,C);
for(i=0;i<R;i++)
for(j=0;j<C;j++)

scanf("%d",&mat1[i][j]);
printf("enter the elements of the matrix 2 is %dx%d(row-wise)- :\n",R,C);

for(i=0;i<R;i++)
for(j=0;j<C;j++)
scanf("%d",&mat2[i][j]);
//adition
for(i=0;i<R;i++)

for(j=0;j<C;j++)

mat3[i][j]=mat1[i][j]+mat2[i][j];

printf("the addition of the matrixes is \n");
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)

printf("%d\t",mat3[i][j]);
printf("\n");
}

}