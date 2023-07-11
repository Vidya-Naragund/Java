import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter principal amount");
		double principal=scan.nextDouble();
		System.out.println("Enter rate of interest");
		double rate=scan.nextDouble();
		System.out.println("Enter time");
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));
		scan.close();

	}

}
