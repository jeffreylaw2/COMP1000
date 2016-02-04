package incoming;
import java.util.HashMap;
import java.util.Map;
public class MapExample {
	public static void main(String[] args) {
		// hash table implementation Map<KeyType, ValueType>
		Map<String, Double> database = new HashMap<String, Double>();
		Map<String, String> types = new HashMap<String, String>();
		// Put key -> value pairs
		database.put("km", 1000.0);     types.put("km", "length");
		database.put("m", 1.0);         types.put("m", "length");
		database.put("cm", 0.01);       types.put("cm", "length");
		database.put("hour", 3600.0);   types.put("hour", "time");
		database.put("minute", 60.0);   types.put("minute", "time");
		database.put("second", 1.0);    types.put("second", "time");
		// Print out 1000.0
		System.out.println(database.get("km"));
		String fromUnit, toUnit;
		fromUnit = "km"; toUnit = "cm";
		// Print out length
		System.out.println(types.get(fromUnit).equals(types.get(toUnit)));
	}
}
