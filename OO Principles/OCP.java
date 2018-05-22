public class OCP {
	public static void main(String[] args) {
		Circle shape = new Circle(10.1);
		PostageStamp stamp = new PostageStamp(shape);
		System.out.println(stamp.toString());
	}
}

class PostageStamp{
	PostageStamp(Shape shape){
		stampShape = shape;
	}
	public String toString(){
		return "stamp, contained in a " + stampShape.toString();
	}
	Shape stampShape; 
}

abstract class Shape {
	public abstract String toString();
}

class Square extends Shape {
	public Square(double d){
		length = d;
	}
	public String toString(){
		return "square, side of length " + length;
	}
	private double length;
}

class Circle extends Shape{
	public Circle(double d){
		radius = d;
	}
	public String toString(){
		return "circle, radius of length " + radius;
	}
	private double radius;
}