
public class Adddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1545;
		int sum=0;
		while(n!=0) {
		sum=sum+n%10;
		n=n/10;}
		
	System.out.println("sum of digit is "+sum);
	}}