package ese103;

import geometricshape.*;

public class Ese103 {

	public static void main(String[] args) {
		Circle circleArray[] = new Circle[3];
		Triangle triangleArray[] = new Triangle[2];
		
		circleArray[0] = new Circle(0,0,1);
		circleArray[1] = new Circle(0.5,0.5,0.5);
		circleArray[2] = new Circle(1,1,1);
		
		Circle c;
		Triangle t;
		
		for(int i = 0;i<circleArray.length;i++){
			c=circleArray[i];
			for(int j=0;j<triangleArray.length;j++){
				t=triangleArray[j];
				if(c.contains(t)){
					System.out.println(c + " Contiene " + t);
				}
				else{
					System.out.println(c + " NON contiene " + t);
				}
			}
			
		}
		
		
		for(int i = 0;i<triangleArray.length;i++){
			t=triangleArray[i];
			for(int j=0;j<circleArray.length;j++){
				c=circleArray[j];
				if(t.contains(c)){
					System.out.println(t + " Contiene " + c);
				}
				else{
					System.out.println(t + " NON contiene " + c);
				}
			}
			
		}

	}

}