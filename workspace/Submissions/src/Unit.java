import java.util.Scanner;

public class Unit
{

	public static double lengthConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("m")) {
		} else if (fromUnit.equals("km") && toUnit.equals("m")) {
			System.out.print(measurement/1000);		
			return measurement;
		} else if (fromUnit.equals("km") && toUnit.equals("mi")) {
			System.out.print(measurement/0.621);		
			return measurement;
			
		} else if (fromUnit.equals("mi") && toUnit.equals("m")) {
			System.out.print(measurement/0.000621371);
			return measurement;
		} else if (fromUnit.equals("mi") && toUnit.equals("km")) {
			System.out.print(measurement*1.60934);
			return measurement;
		// Convert everything from the base unit to the desired unit
		} if (toUnit.equals("km")) {
			System.out.print(measurement*1000);
			return measurement;
		} else if (toUnit.equals("mi")){
			System.out.print(measurement*0.000621371);
			return measurement;
		}
		return measurement;
	}
	

	public static double temperatureConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("F")) {
		} else if (fromUnit.equals("C") && toUnit.equals("F")) {
			System.out.print(measurement*9/5+32);
			return measurement;
		} else if (fromUnit.equals("C") && toUnit.equals("K")) {
			System.out.print(measurement+273);
			return measurement;
		
		// Convert everything from the base unit to the desired unit
		} if (toUnit.equals("C")) {
			System.out.print((measurement-32)*5/9);
		} else if (toUnit.equals("K")) {
			System.out.print(((measurement-32)*5/9)+273);
		}
		return measurement;
	}
	public static double timeConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("sec")) {
		} else if (fromUnit.equals("min")) {
			if (toUnit.equals("sec"));
			System.out.print(measurement/60);
			
		}
		
		// Convert everything from the base unit to the desired unit
		if (toUnit.equals("min")) {
			System.out.print(measurement*60);
		} else if (toUnit.equals("hr"));
		    System.out.print(measurement*3600);
		return measurement;
	}
	public static double massConversion(double measurement, String fromUnit, String toUnit) {
		// Convert everything to some base unit (everything to, say, mm)
		if (fromUnit.equals("g")) {
		} else if (fromUnit.equals("kg")) {
			if (toUnit.equals("g"));
				System.out.print(measurement/1000);
				
		}
		
		// Convert everything from the base unit to the desired unit
		if (toUnit.equals("kg")) {
			System.out.print(measurement*1000);
		} else if (toUnit.equals("lbs"));
		    System.out.print(measurement*0.00220462);
		return measurement;
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
		System.out.print("Take the numbers before the first period ");
		
		
		
		measurement = lengthConversion(measurement, fromUnit, toUnit);
		measurement = massConversion(measurement, fromUnit, toUnit);
		measurement = temperatureConversion(measurement, fromUnit, toUnit);
		measurement = timeConversion(measurement, fromUnit, toUnit);

	}
}