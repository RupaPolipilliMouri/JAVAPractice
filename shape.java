public class Shape {

	String color;
	String filled;
	
	Scanner sc = new Scanner(System.in);
	public void shape(){
		System.out.println("please enter shape details..");
		System.out.println("Enter color");
		color = sc.next();
		System.out.println("Enter filled");
		filled = sc.next();
		
	}
	public void viewShapDetails(){

        System.out.println("employee Id =" + color);

		System.out.println("Enter Employee name=" + filled);

		}
	}
  
  
  package com.inharitencemultilevelandhierarchial;

public class Circle extends Shape{
	double radius;
	
	public void circle() {
	      System.out.println("Enter the Circle details");
	      System.out.println("Enter circle radius");
			radius = sc.nextDouble();

	   }
	public void viewCircleDetails(){

        System.out.println("radius =" + radius);

		

		}
}


package com.inharitencemultilevelandhierarchial;

public class Rectangle extends Circle {
	
double width;
double length;
public void rectangle() {
	   System.out.println("Enter the Rectangle details");
	      System.out.println("Enter  Rectangle width");
			width = sc.nextDouble();
			System.out.println("Enter Rectangle length");
			length = sc.nextDouble();

}
	public void viewCircleDetails(){

        System.out.println("radius =" + width);
        System.out.println("radius =" + length);

		

		}
}


package com.inharitencemultilevelandhierarchial;

public class Squere extends Rectangle{
	public void square() {
	      System.out.println("Enter Square");
	   }
}


package com.inharitencemultilevelandhierarchial;

public class Mainmethod {
public static void main(String[] args) {
   Rectangle r = new Rectangle();
   r.circle();
   r.shape();
   r.rectangle();
 
}
}
