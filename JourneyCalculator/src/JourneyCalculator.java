import java.util.*;
public class JourneyCalculator {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time as realnumbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalc journeyCalc = new JourneyCalc();
		scan.close();

	
	System.out.printf("%.2f",journeyCalc.calculateDistance(speed, time));

	}

	

}
