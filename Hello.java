
//public class Hello {
//
//	public static void main(String[] args) {
//		// Single Line Comment
//		
//		/* Multi-line
//		 * Comment
//		 */
//		System.out.println("Hello World");
//		
//	}
//
//}





//// Java program to illustrate the concept of Abstraction
//
//abstract class Shape {
//	String color;
//
//	// these are abstract methods
//	abstract double area();
//	public abstract String toString();
//	
//	// abstract class can have a constructor
//	public Shape(String color)
//	{
////		System.out.println("Shape constructor called");
//		this.color = color;
//	}
//
//	// this is a concrete method
//	public String getColor()
//	{
//		return color;
//	}
//}
//class Circle extends Shape {
//	double radius;
//
//	public Circle(String color, double radius)
//	{
//
//		// calling Shape constructor
//		super(color);
////		System.out.println("Circle constructor called");
//		this.radius = radius;
//	}
//
//	@Override
//	double area()
//	{
//		return Math.PI * Math.pow(radius, 2);
//	}
//
//	@Override
//	public String toString()
//	{
//		return "Circle color is "
//			+ super.color
//			+ "and area is : "
//			+ area();
//	}
//}
//
//class Rectangle extends Shape {
//
//	double length;
//	double width;
//
//	public Rectangle(String color,
//					double length,
//					double width)
//	{
//
//		// calling Shape constructor
//		super(color);
////		System.out.println("Rectangle constructor called");
//		this.length = length;
//		this.width = width;
//	}
//
//	@Override
//	double area()
//	{
//		return length * width;
//	}
//
//	@Override
//	public String toString()
//	{
//		return "Rectangle color is "
//			+ super.color
//			+ "and area is : "
//			+ area();
//	}
//}
//
//public class Hello {
//	public static void main(String[] args)
//	{
//		Shape s1 = new Circle("Red", 2.2);
//		Shape s2 = new Rectangle("Yellow", 2, 4);
//
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//	}
//}






////Java program to demonstrate encapsulation
//
// class Encapsulate {
//
//	// private variables declared
//	// these can only be accessed by
//	// public methods of class
//	private String geekName;
//	private int geekRoll;
//	private int geekAge;
//
//	// get method for age to access
//	// private variable geekAge
//	public int getAge()
//	{
//		return geekAge;
//	}
//
//	// get method for name to access
//	// private variable geekName
//	public String getName()
//	{
//		return geekName;
//	}
//
//	// get method for roll to access
//	// private variable geekRoll
//	public int getRoll()
//	{
//		return geekRoll;
//	}
//
//	// set method for age to access
//	// private variable geekage
//	public void setAge(int newAge)
//	{
//		geekAge = newAge;
//	}
//
//	// set method for name to access
//	// private variable geekName
//	public void setName(String newName)
//	{
//		geekName = newName;
//	}
//
//	// set method for roll to access
//	// private variable geekRoll
//	public void setRoll(int newRoll)
//	{
//		geekRoll = newRoll;
//	}
//}
//
////Class to access variables
////of the class Encapsulate
//class Hello {
//	public static void main(String[] args)
//	{
//		Encapsulate obj = new Encapsulate();
//
//		// setting values of the variables
//		obj.setName("Harsh");
//		obj.setAge(19);
//		obj.setRoll(51);
//
//		// Displaying values of the variables
//		System.out.println("Geek's name: " + obj.getName());
//		System.out.println("Geek's age: " + obj.getAge());
//		System.out.println("Geek's roll: " + obj.getRoll());
//
//		// Direct access of geekRoll is not possible
//		// due to encapsulation
//		//System.out.println("Geek's roll: " + obj.geekName);
//	}
//}














////Java Program for Method Overriding
//
////Class 1
////Helper class
//class Parent {
//
//	// Method of parent class
//	void Print()
//	{
//		int a = 0;
//		// Print statement
//		System.out.println("parent class");
//	}
//	
//}
//
////Class 2
////Helper class
//class subclass1 extends Parent {
//
//	// Method
//	void Print() {
//		System.out.println("subclass1"); 
//	}
//}
//
////Class 3
////Helper class
//class subclass2 extends Parent {
//
//	// Method
//	void Print()
//	{
//
//		// Print statement
//		System.out.println("subclass2");
//	}
//}
//
////Class 4
////Main class
//class Hello {
//
//	// Main driver method
//	public static void main(String[] args)
//	{
//
//		// Creating object of class 1
//		Parent a;
//
//		// Now we will be calling print methods
//		// inside main() method
//
//		a = new subclass1();
//		a.Print();
//
//		a = new subclass2();
//		a.Print();
//	}
//}



















