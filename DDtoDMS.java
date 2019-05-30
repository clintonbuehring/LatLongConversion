import java.util.Scanner;

/* A simple program to convert users Decimal Degrees for Latitude & Longitude cordinates
 *  into Degrees Minutes Seconds (DMS).
*/

public class DDtoDMS {
	
	public static void errorMsg(int a, int b, String c){
		System.out.println("Please enter a valid " + c);
		System.out.println("  (Between " + a + " and " + b + ")");
	}

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double 	lat = 0.0,
			lon = 0.0;
		String 	a = "Latitude",
			b = "Longitude";
		boolean check = true;
		boolean negLat = false;
		boolean negLong = false;

		// Get Decimal Degrees input from user for Latitude.
		while(check){
			System.out.println("Enter Decimal Degrees for the Latitude: ");
			lat = sc.nextDouble();
			if(lat > 90 || lat < -90){
				errorMsg(90, -90, a);
			}else
				check = false;
			if(lat < 0 && lat > 90){
				negLat = true;
			}
		}check = true;

		// Get Decimal Degrees input from user for Longitude.
		while(check){
			System.out.println("Enter Decimal Degrees for the Longitude: ");
			lon = sc.nextDouble();
			if(lon > 180 || lon < -180){
				errorMsg(180, -180, b);
			}else
				check = false;
			if(lon < 0 && lon > -180){
				negLong = true;
			}
		}check = true;

		// Convert Decimal Degrees to Degrees Minutes Seconds for Latitude.
		int latD = (int) (lat/1);
		double rem = lat % 1;
		int latM = (int) (rem * 60);
		double rem2 = (rem * 60) % 1;
		double latS = (rem2 * 60);
		if(negLat)
			latD = 0 - latD;
		
		// Convert Decimal Degrees to Degrees Minutes Seconds for Longitude.
		int longD = (int) (lon/1);
		double rem3 = lon % 1;
		int longM = (int) (rem3 * 60);
		double rem4 = (rem3 * 60) % 1;
		double longS = (rem4 * 60);
		if(negLong)
			longD = 0 - longD;

		System.out.println("Latitude: " + latD + "." + latM + "'" + latS + '"');
		System.out.println("Longitude: " + longD + "." + longM + "'" + longS + '"');
	}
}
