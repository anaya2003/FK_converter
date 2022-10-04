import java.util.Scanner;

public class temp2 {

	
	static float Fahrenheit_to_Kelvin( float F )
	{
	    return 273.5f + ((F - 32.0f) * (5.0f/9.0f));
	}
	 
	// Driver code
	public static void main(String arg[])
	{
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter temp: ");
		
		float temp1 = myObj.nextFloat();
		float round = Math.round( temp1 *100) / 100;
		
		   
	    System.out.print("Temperature in Kelvin ( K )= " + String.format("%.02f", Fahrenheit_to_Kelvin(round)));
	    
	}
	
}
