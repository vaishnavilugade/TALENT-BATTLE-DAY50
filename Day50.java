import java.util.*;
import java.lang.*;
import java.io.*;
class Day50
{
static long SumOfSquare(int arr[],int n)
 {
 long sum = 0;
 for(int i = 0 ; i<n ; i++)
 {
 sum = sum + arr[i]*arr[i];
 }
 return sum;
 }
public static void main(String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0 ; i<n ; i++)
{
arr[i] = sc.nextInt();
}
System.out.print(SumOfSquare(arr,n));
}
}

