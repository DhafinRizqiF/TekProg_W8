package Exercise_1_2;
class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
		System.out.println("Square Constructor");
	}
	/***
	 * area - prints "Square Area" and returns the area of the Square
	 * 
	 * @return
	 */
	public int area() {
		System.out.println("Square Area");
		return (int) (this.getLength() * this.getWidth());
	}
	/**
	 * perimeter - prints "Square Perimeter" and returns the perimeter of the Square
	 * 
	 * @return
	 */
	public int perimeter() {
		System.out.println("Square Perimeter");
		return (int) (2 * (this.getLength() + this.getWidth()));
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int side) {
		super.setLength(side);
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int side) {
		super.setWidth(side);
	}


	public String toString() {
		return "A Square with side="+this.getLength()+", which is a subclass of "+super.toString();
	}
}