package arrayprgrams1;

import java.util.Scanner;

public class Frequency {

	public Frequency() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);

		//System.out.println("hi");
		int n =5;
		char a[]=new char[n];
		
		for(int i=0;i<n;i++){

			a[i]=s.next().charAt(0); //takes the first character of the string.
			
			//b[i]=a[i];
			//System.out.println(a[i]);
			}
			
char ch ='i';
int frequency =0;
		 for(int i = 0; i < n; i++) {
	            if(ch == a[i]) 
	            {
	                ++frequency;
	            }
	         
		 }
         
	   System.out.println("frequency of i is =" + frequency);  
	}
}
