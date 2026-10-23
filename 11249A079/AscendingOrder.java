import java.util.Scanner;

public class
AscendingOrder
{
public static void main(string[] args)
{
int n, temp;
Scanner S = newScanner(system.in);
system.out.print("Enter no.of elements you wnat in array:");
n = S.nextint();
int a[] = new int[n];
system.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i] = S.nextint();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
system.out.print("AscendingOrder:");
for(int i=0;i<n-1;i++)
{
system.out.print(a[i] + ",");
}
system.out.print(a[n-1]);
}
}
