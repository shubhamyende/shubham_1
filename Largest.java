//Largest  number in array
public class Largest{

public static void main(String[] args){
int arr[] = {5,12,14,16,20}; 
int max=arr[0]; 
for(int i = 0; i<arr.length; i++)
if(arr[i]>max)
max=arr[i];
System.out.println("Largest number is"+max);
}
}