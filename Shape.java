package day1;

public class Shape {
	double side;
	double length;
	double breadth;
	double Area1;
	double Area2;
public Shape(double side){
    this.side=side;
}
public Shape(double length,double breadth){
    this.length=length;
    this.breadth=breadth;   
}
public double areaOfRectangle(){
	if(length>0 && length<20 && breadth>0 && breadth <20)
	{
	return Area1=breadth*length                                                                                                                                                                    ;
	
	}else 
		{return 0.0;
		}
	}
		
public double areaOfSquare()
{
	return Area2=side*side;
}

public static void main(String s[]){
	
	{
Shape square=new Shape(5.0);
Shape rectangle = new Shape(11.0,18.0);
System.out.println("area of rect"+rectangle.areaOfRectangle());
System.out.println("area of square"+square.areaOfSquare());

	}}}