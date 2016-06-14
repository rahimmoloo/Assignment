package sHAPES;
public class Sphere extends Shape{

	protected double radius;
    
	public Sphere(double r) {
    	
		super ("Sphere");
    	
    	 radius=r;
     
	}
    
	
	public double area ( ) {
		
		return 4 * Math.PI * Math.pow(2, radius);
		
	}
    
}
