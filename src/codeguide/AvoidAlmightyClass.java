package codeguide;

/**
 * This is the example of almighty class.
 * This class calculates the area of the shapes.
 * @author Pappim Pipatkasrira
 * @version 1.0
 * @since Mar 3, 2017
 */

public class AvoidAlmightyClass {

	/**
	 * Suppose this class is named "CalculateTheSize",
	 * find the method(s) that shouldn't belong to this class.
	 */
	
	//TODO Comment the method(s) that not belong
	
	/**
	 * Calculate triangle size from base and height.
	 * @param base is the base of the triangle.
	 * @param height is the height of the triangle.
	 * @return the area of the triangle.
	 */
	public double Triangle (double base, double height){
		return base*(height/2);
	}
	
	/**
	 * Calculate circle size from radius.
	 * @param radius is the radius of the circle.
	 * @return the area of the circle.
	 */
	public double Circle (double radius){
		return Math.PI*radius*radius;
	}
	
	/**
	 * Calculate square size from sides.
	 * @param side is the side of the square.
	 * @return the area of the square.
	 */
	public double Square (double side){
		return side*side;
	}
	
	/**
	 * Calculate regtangle size from width and height.
	 * @param width is the width of the regtangle.
	 * @param height is the height of the regtangle.
	 * @return the area of the regtangle.
	 */
	public double Regtangle (double width, double height){
		return width*height;
	}
	
	/**
	 * Plus two numbers.
	 * @param number.
	 * @param number2.
	 * @return the total of the two number.
	 */
	public double plus (double number, double number2){
		return number + number2;
	}
	
	/**
	 * Multiply two numbers.
	 * @param number.
	 * @param number2.
	 * @return the product of the two number.
	 */
	public double multiply (double number, double number2){
		return number * number2;
	}
	
	/**
	 * Minus two numbers.
	 * @param number.
	 * @param number2.
	 * @return the result of minus of the two number.
	 */
	public double minus (double number, double number2){
		return number - number2;
	}
	
	/**
	 * Merge two strings.
	 * @param string1.
	 * @param string2.
	 * @return new string contains string1 and string2.
	 */
	public String addString (String string1, String string2){
		return string1 + string2;
	}

}
