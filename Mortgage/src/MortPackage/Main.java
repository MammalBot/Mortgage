package MortPackage;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: ");	//Prompt for principal.
		int principal = scanner.nextInt();
		
		System.out.print("Interest Rate: ");	//Prompt for interest rate.
		float annualRate = scanner.nextFloat();
		float monthlyRate = annualRate / 100 / 12;	//Convert the annual interest rate to monthly.
		
		System.out.print("Term (years): ");	//Prompt for term
		int term = scanner.nextInt();
		int numberOfPayments = term * 12; //Convert the term in years to months.
		
		double payments = principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
									/ (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

		String paymentsFormatted = NumberFormat.getCurrencyInstance().format(payments);	//Format result to output as local currency. 
		System.out.println("Monthly Paymments: " + paymentsFormatted);
		
		
	}

	
}
