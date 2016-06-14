package sHAPES;

public class main {

	public static void main(String[] args) {
       
		Shape [ ] shapeList = new Shape[6];
        
		shapeList[0] = new Circle(3.0,5.3);
        
		shapeList[1] = new Rectangle(3.0, 4.0);
        
		shapeList[2] = new Rectangle(2.5);
        
		shapeList[3] = new Circle(2.5);
        
		shapeList[4] = new Sphere(5.0);
		
		shapeList[5] = new Triangle(5.0,6.0);
        
		for (int i = 0; i < shapeList.length; i++)  {
        
			System.out.println (shapeList[i].toString( ));
	
			System.out.println (shapeList[i].area( ));

			}


	}

}
