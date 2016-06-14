package sHAPES;

public class Circle extends Shape{
	
   private double radius;
    
   protected double maj_radius,min_radius; 
    
   public Circle (double rad) {
       
	   super ("Circle");
        
	   radius = rad;
  
   }
  
   public Circle(double rad1 , double rad2){
    	
	   super("Oval");
    	
	   maj_radius=rad1; min_radius=rad2;
  
   }
    
   public double area( ) {
       
	   return Math.PI * radius * radius;
	   
   }
    
}

	


