//Wirakarn Ponpraserd
//6409650311
package question1;

public class Calculator {
	private double celsius, farenheit;
	private double lp,kg;
	
	
	public static double convertFarenheitToCelsius(double farenheit) {
		return (double)(5*(farenheit-32))/9;
	}
	
	public double convertPoundsToKg(double lp) {
		this.lp = lp*0.454;
		return this.lp;
	}
	
	public double convertKgToPounds(double kg) {
		this.kg=kg/0.454;
		return this.kg;
	}
	

}
