import java.util.Scanner;
public class Exercise2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double rate=sc.nextDouble();
		System.out.println("Enter number of years:");
		double year=sc.nextDouble();
		for(int i=1;i<=year;i++){
			amount=amount*(1+rate/100);
		}
		System.out.println("Accumulated value is "+amount+".");
		
	}

}
