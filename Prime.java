public class Prime{
public static void main(String[] args)
{
int n=100;

for(int i=1;i<n;i++){
boolean valid =true;

for(int j=2;j<i/2;j++){
int reminder=i%j;
if(reminder==0){
valid= false;
break;
}
}
if(valid)
System.out.println("Prime Numbers between 1 to 100 are: "+i);
}
}
}
