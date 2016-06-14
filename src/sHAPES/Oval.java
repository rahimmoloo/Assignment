package sHAPES;

public class Oval extends Circle{

	public Oval(double rad1, double rad2){
		
		super(rad1,rad2);
	
	}
	
	public double area( ) {
        
		return Math.PI * super.maj_radius * super.min_radius; 
		}
	
}
