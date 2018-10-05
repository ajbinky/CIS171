package chapter8.exercise5;

/**
 * 
 * @author Andrew Behncke
 *
 * SodaCan class with getSurfaceArea() and getVolume()
 *
 */
public class SodaCan {
	
	private double height;
	private double radius;
	
	public SodaCan() {
		height = 4.83;
		radius = 1.3;
	}
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
}
