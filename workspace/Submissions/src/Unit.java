import java.util.Scanner;

public class Unit
{

	public static double lengthConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("m") && (toUnit.equals("km"))) {
			System.out.print(measurement*1000);
		} else if (fromUnit.equals("m") && toUnit.equals("mi")) {
			System.out.print(measurement*0.000621371);
			
		} else if (fromUnit.equals("mi") && toUnit.equals("m")) {
			System.out.print(measurement*1609.34);
		} else if (fromUnit.equals("mi") && toUnit.equals("km")) {
			System.out.print(measurement*1.60934);
	
		} else if (fromUnit.equals("km") && toUnit.equals("m")) {
			System.out.print(measurement/1000);
		} else if (fromUnit.equals("km") && toUnit.equals("mi")) {
			System.out.print(measurement*0.62137);
		} return measurement;
	}
	

	public static double temperatureConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("F") && (toUnit.equals("C"))) {
			System.out.print((measurement-32)*5/9);
		} else if (fromUnit.equals("F") && toUnit.equals("K")) {
			System.out.print((measurement-32)*5/9+273);
		} else if (fromUnit.equals("C") && toUnit.equals("F")) {
			System.out.print(measurement*9/5+32);
		} else if (fromUnit.equals("C") && toUnit.equals("K")) {
			System.out.print(measurement+273);
		} else if (fromUnit.equals("K") && toUnit.equals("C")) {
			System.out.print(measurement-273);
		} else if (fromUnit.equals("K") && toUnit.equals("F")) {
			System.out.print((measurement-273)*9/5+32);
		} return measurement;
	}
	public static double timeConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("sec") && (toUnit.equals("min"))) {
			System.out.print(measurement/60);
		} else if (fromUnit.equals("sec") && toUnit.equals("hr")) {
			System.out.print(measurement/3600);
		} else if (fromUnit.equals("min") && toUnit.equals("sec")) {
			System.out.print(measurement*60);
		} else if (fromUnit.equals("hr") && toUnit.equals("min")) {
			System.out.print(measurement*60);
		} else if (fromUnit.equals("min") && toUnit.equals("hr")) {
			System.out.print(measurement/60);
		} else if (fromUnit.equals("hr") && toUnit.equals("sec")) {
			System.out.print(measurement*3600);
		}
	
		return measurement;
	}
	public static double massConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
			if (fromUnit.equals("g") && (toUnit.equals("kg"))) {
				System.out.print(measurement*1000);
			} else if (fromUnit.equals("kg") && toUnit.equals("g")) {
				System.out.print(measurement/1000);
			} else if (fromUnit.equals("oz") && toUnit.equals("lbs")) {
				System.out.print(measurement/16);
			} else if (fromUnit.equals("lbs") && toUnit.equals("oz")) {
				System.out.print(measurement*16);
			} else if (fromUnit.equals("g") && toUnit.equals("lbs")) {
				System.out.print(measurement*0.00220462);
			} else if (fromUnit.equals("lbs") && toUnit.equals("g")) {
				System.out.print(measurement*453.592);
			} else if (fromUnit.equals("lbs") && toUnit.equals("kg")) {
				System.out.print(measurement/2.2);
			} else if (fromUnit.equals("kg") && toUnit.equals("lbs")) {
				System.out.print(measurement*2.2);
			} else if (fromUnit.equals("g") && toUnit.equals("oz")) {
				System.out.print(measurement*0.035274);
			} else if (fromUnit.equals("oz") && toUnit.equals("g")) {
				System.out.print(measurement*28.3495);
			} else if (fromUnit.equals("kg") && toUnit.equals("oz")) {
				System.out.print(measurement*35.274);
			} else if (fromUnit.equals("oz") && toUnit.equals("kg")) {
				System.out.print(measurement/35.274);
			} return measurement;
	}
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Convert from: ");
		String fromUnit = keyboard.nextLine();
		System.out.print("Convert to: ");
		String toUnit = keyboard.nextLine();

		System.out.print("Measurement: ");
		double measurement = keyboard.nextDouble();
		//System.out.print("Take the numbers before the first period ");
		
		
		if(fromUnit.equals("m") || fromUnit.equals("km") ||(fromUnit.equals("mi")))
		measurement = lengthConversion(measurement, fromUnit, toUnit);
		else if(fromUnit.equals("g") || fromUnit.equals("kg") || (fromUnit.equals("g") || fromUnit.equals("kg")))
		measurement = massConversion(measurement, fromUnit, toUnit);
		else if(fromUnit.equals("F") || fromUnit.equals("C") || fromUnit.equals("K"))
		measurement = temperatureConversion(measurement, fromUnit, toUnit);
		else if(fromUnit.equals("sec") || fromUnit.equals("min") || fromUnit.equals("hr"))
		measurement = timeConversion(measurement, fromUnit, toUnit);

	}
}