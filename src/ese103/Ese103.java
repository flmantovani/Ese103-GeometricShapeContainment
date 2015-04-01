package ese103;

import geometricshape.*;

public class Ese103 {

	public static void main(String[] args) {
		Circle circleArray[] = new Circle[3];
		
		circleArray[0] = new Circle(0,0,1);
		circleArray[1] = new Circle(0.5,0.5,0.5);
		circleArray[2] = new Circle(1,1,1);
		
		Circle a, b;
		
		for(int i = 0;i<circleArray.length;i++){
			a=circleArray[i];
			for(int j=0;j<circleArray.length;j++){
				b=circleArray[j];
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