package incoming;

public class Coordinate {
	final String label;
	final double x;
	final double y;
	final double z;
	public double distance(Coordinate other) {
		System.out.println(this.label);
		// sqrt(A^2 + B^2)
		return Math.sqrt((other.x - x)*(other.x - x)
				+ (other.y - y)*(other.y - y));
	}
	// Constructor
	public Coordinate(String label, int x, int y, int z) {
		this.label = label;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static void main(String[] args) {
		Coordinate here = new Coordinate("here", 0,0,0);
		Coordinate there = new Coordinate("there", 2, 2, 0);
		System.out.println(here.distance(there));
//		System.out.println(there.z);
	}
}
