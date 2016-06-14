package sHAPES;

public class Triangle extends Shape{

	protected double height , base;

public Triangle( double h , double b){
	
	super("Triangle");
	
	height=h;base=b;
	
}
	public  double area (){
		
		return height * base / 2;
		
	}
	
}
