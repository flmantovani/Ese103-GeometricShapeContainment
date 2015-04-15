package geometricshape;

public abstract class GeometricShape {
	
	abstract double getXMin();
	
	abstract double getXMax();
	
	abstract double getYMin();
	
	abstract double getYMax();

	public boolean contains(GeometricShape c){
		boolean v;
		if(this.getXMin() <= c.getXMin() && this.getYMin() <= c.getYMin() && this.getXMax() >= c.getXMax() && this.getYMax() >= c.getYMax() ){
			v=true;
		}
		else{
			v=false;
		}
		return v;
	}
}
