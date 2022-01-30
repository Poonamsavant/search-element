// for searching an element in an array
import java.util.*;
public class searchelement
{
public static void main(String[] args)
{
int i,key,size;
boolean flag=false;
Scanner s= new Scanner(System.in);
size = s.nextInt();
//key = s.nextInt();
int arr[] = new int[size];
for(i=0; i<size; i++)
	arr[i] = s.nextInt();
	key = s.nextInt();
for(i=0; i<size; i++)
if(arr[i]==key)
{
	System.out.println("index position of" +key+ "is" +i);
	flag=true;
}
if (flag==false)
	System.out.println("not found");
}
}
//output:
5
10
20
30
40
50
10
index position of10is0


5
10
20
30
40
50
100
not found
