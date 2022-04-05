package Exercise_1_2;


class Circle extends Shape {
	private double radius;
        private String color;
	public Circle() {
		this.radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
        public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
        }
}
