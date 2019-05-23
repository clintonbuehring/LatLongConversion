import java.util.Scanner;

public class DMStoDD {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		double latD, latM, latS, longD, longM, longS, lat, lon;

		System.out.print("Please enter the Degree for lat: ");
		latD = sc.nextDouble();
		System.out.print("Please enter the Minute for lat: ");
		latM = sc.nextDouble();
		System.out.print("Please enter the Second for lat: ");
		latS = sc.nextDouble();
		System.out.print("Please enter the Degree for Long: ");
		longD = sc.nextDouble();
		System.out.print("Please enter the Minute for Long: ");
		longM = sc.nextDouble();
		System.out.print("Please enter the Second for Long: ");
		longS = sc.nextDouble();
		
		lat = (latD + (latM/60 + (latS/3600)));
		lon = (longD + (longM/60 + (longS/3600)));
		
		System.out.println("Lat: " + lat + "  : Long: " + lon);
	}
}
