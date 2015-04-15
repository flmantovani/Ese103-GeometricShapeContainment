package ese103;

import geometricshape.*;

public class Ese103 {

	public static void main(String[] args) {
	
		GeometricShape shapeArray[]= new GeometricShape[5];
		
		shapeArray[0]= new Circle(2,2,4);
		shapeArray[1]= new Triangle(7,1,5);
		shapeArray[2]= new Circle(5,1,7);
		shapeArray[3]= new Triangle(1,4,4);
		shapeArray[4]= new Circle(2,1,2);
		

		GeometricShape a,b;
		
		for(int i = 0;i<shapeArray.length;i++){
			a=shapeArray[i];
			for(int j=0;j<shapeArray.length;j++){
				b=shapeArray[j];
				if(a.contains(b)){
					System.out.println(a + " Contiene " + b);
				}
				else{
					System.out.println(a + " NON contiene " + b);
				}
			}
			
		}
		
		
		
		
	}

}


