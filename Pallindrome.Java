
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,sum=0,t;
int n=12121; 
t=n;
while(n>0) {
	r=n%10;
	sum=(sum*10)+r;
	n=n/10; 	
}
if(t==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}

}
