//Wirakarn Ponpraserd
//6409650311
package question1;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculate = new Calculator();
		
		System.out.printf("Enter Farenheit: ");
		double farenheit =scan.nextDouble();
		System.out.printf("%.1f\u00b0F -> %.1f\u00b0C \n",farenheit,Calculator.convertFarenheitToCelsius(farenheit));
		System.out.printf("--------\n");
				
		System.out.printf("please enter number to select unit weight\n1.kilogram --> pounds\n2.pounds --> kilogram\n: ");
		int choice = scan.nextInt();
		if(choice==1) {
			System.out.printf("Enter kilogram: ");
			double weightInput = scan.nextDouble();
			if(weightInput>=0) {
				System.out.printf("%.3f kg = %.3f lp\n",weightInput,calculate.convertKgToPounds(weightInput));
			}else System.out.printf("Sorry, please enter positive weight.\n");
		}
		else if(choice==2) {
			System.out.printf("Enter pound: ");
			double weightInput = scan.nextDouble();
			if(weightInput>=0) {
				System.out.printf("%.3f lp = %.3f kg\n",weightInput,calculate.convertPoundsToKg(weightInput));
			}else System.out.printf("Sorry, please enter positive weight.\n");
		}
	}
}
