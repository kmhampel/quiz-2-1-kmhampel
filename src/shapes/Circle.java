package shapes;

public class Circle extends Shape {
	private double radius;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles cannot have a negative radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		// TODO Implement me
		if (radius <= -1){
			throw new IllegalArgumentException("Your radius is not a valid value.");
		}
		else {
			this.radius = radius;
		}
	}

	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		double area;

		area = Math.PI * Math.pow(radius, 2);

		return area;
	}
}
