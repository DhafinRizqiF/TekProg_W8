package Exercise_1_2;
abstract class Shape {
	private String color;
	private boolean filled;
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString() {
		String filledStr = "filled";
		if (!filled) {
			filledStr = "Not filled";
		}
		return "A Shape with color of " + color + " and " + filledStr;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}


	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}