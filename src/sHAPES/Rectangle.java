package sHAPES;

public class Rectangle extends Shape{

	
	protected double length, width;
    
	public Rectangle(double len, double wid) {
    	
		super ("Rectangle");
    	
		length = len;   
		
		width = wid;
     
	}
   
	public Rectangle(double len){
    	
		super("Square");
    	
		length=len; 
		
		width=len;
    	
    }
	
	public double area ( ) {
		
		return 2.0 * length * width;
		
	}
    
	

}
