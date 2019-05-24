import java.util.Scanner;

public class DDtoDMS {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter DD for the Lat: ");
		double lat = sc.nextDouble();
		System.out.println("Enter DD for the Long: ");
		double lon = sc.nextDouble();
		
		// Convert DD to DMS for Lat
		int latD = (int) (lat/1);
		double rem = lat % 1;
		int latM = (int) (rem * 60);
		double rem2 = (rem * 60) % 1;
		double latS = (rem2 * 60);
		
		// Convert DD to DMS for Long
		int longD = (int) (lon/1);
		double rem3 = lon % 1;
		int longM = (int) (rem3 * 60);
		double rem4 = (rem3 * 60) % 1;
		double longS = (rem4 * 60);
		
		System.out.println("Lat Degree: " + latD);
		System.out.println("Lat Minute: " + latM);
		System.out.println("Lat Seconds: " + latS);
		System.out.println("Long Degree: " + longD);
		System.out.println("Long Minute: " + longM);
		System.out.println("Long Seconds: " + longS);
		
	}
}
