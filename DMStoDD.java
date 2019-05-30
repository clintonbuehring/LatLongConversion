import java.util.Scanner;

/*  A simple program to convert a users Degrees Mintues Seconds (DMS) to 
 *    Decimal Degrees for geographic coordinates.
*/

public class DMStoDD {

	// Print out error message if user input is out of bounds.
	public static void errorMsg(int a, int b, String c){
		System.out.println("\n" + "Please input a correct value for " + c + ".");
		System.out.println("  (Between " + a + " and " + b + ")");
	}
	
	// Scanner for users input.
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double 	latD = 0.0, 
			latM = 0.0, 
			latS = 0.0, 
			longD = 0.0, 
			longM = 0.0, 
			longS = 0.0, 
			lat, lon;
		boolean check = true;		// Boolean for checking users input.
		boolean negLat = false;		// Boolean to check if Latitude is negative.
		boolean negLong = false;	// Boolean to check if Longitude is negative.
		String 	d = "Degrees", 
			m = "Minutes", 
			s = "Seconds";

		System.out.println("********************************************");
		System.out.println("\n" + "\n" + "Degree Minute Second format: DD.MM'SS" + '"');

		// Obtain users input for Latitude DMS.
		while(check){
			System.out.print("Please enter the Degree for Latitude: ");
			latD = sc.nextDouble();
			if(latD > 90 || latD < -90){	// Check if within valid range.
				errorMsg(-90, 90, d);	//  Send error message otherwise.
			}else
				check = false;		// Input is valid.
			if(latD < 0 && latD > -90)	// Check if input is negative.
				negLat = true;		// Set negative Latitude to true.
		}check = true;				// Return check to true for next input.
		while(check){
			System.out.print("Please enter the Minute for Latitude: ");
			latM = sc.nextDouble();
			if(latM > 60 || latM < 0){
				errorMsg(0, 60, m);
			}else
				check = false;
		}check = true;
		while(check){
			System.out.print("Please enter the Second for Latitude: ");
			latS = sc.nextDouble();
			if(latS > 60 || latS < 0){
				errorMsg(0, 60, s);
			}else
				check = false;
		}check = true;

		// Obtain users input for Longitude DMS.
		while(check){
			System.out.print("Please enter the Degree for Longitude: ");
			longD = sc.nextDouble();
			if(longD > 180 || longD < -180){	// Check if within valid range.
				errorMsg(-180, 180, d);		//  Send error message otherwise.
			}else
				check = false;		// Input is valid
			if(longD < 0 && longD > -180)	// Check if input is negative
				negLong = true;		// Set negative Longitude to true.
		}check = true;				// Return check to true for next input.
		while(check){
			System.out.print("Please enter the Minute for Longitude: ");
			longM = sc.nextDouble();
			if(longM > 60 || longM < 0){
				errorMsg(0, 60, m);
			}else
				check = false;
		}check = true;
		while(check){
			System.out.print("Please enter the Second for Longitude: ");
			longS = sc.nextDouble();
			if(longS > 60 || longS < 0){
				errorMsg(0, 60, s);
			}else
				check = false;
		}check = true;
		
		// Take user input and convert to Decimal Degrees
		if(negLat)
			lat = (latD - (latM/60 + (latS/3600))); // If negative Lat
		else
			lat = (latD + (latM/60 + (latS/3600))); // If positive Lat

		if(negLong)
			lon = (longD - (longM/60 + (longS/3600)));	// If negative Long.
		else
			lon = (longD + (longM/60 + (longS/3600)));	// If positive Long.
		
		System.out.println("Latitude: " + lat + "  : Longitude: " + lon);
	}
}
