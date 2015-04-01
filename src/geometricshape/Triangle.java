package geometricshape;

public class Triangle {
	
	private double xV;
	private double yV;
	private double l;
	
	public Triangle(double xV, double yV, double l){
		this.xV=xV;
		this.yV=yV;
		if(l<=0)
			throw new IllegalArgumentException();
		else
			this.l=l;	
	}
	
	public double getxV() {
		return xV;
	}

	public void setxV(double xV) {
		this.xV = xV;
	}

	public double getyV() {
		return yV;
	}

	public void setyV(double yV) {
		this.yV = yV;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		if(l<=0){
			throw new IllegalArgumentException("Il lato deve essere positivo");
		}
		else{
			this.l=l;
		};
	}

	
	double getXMin() {
		return this.xV;
	}

	
	double getXMax() {
		return this.xV + this.l;
	}

	
	double getYMin() {
		return this.yV;
	}

	
	double getYMax() {
		return this.yV + this.l * Math.sqrt(3)/2;
	}
	
	public boolean contains(Triangle t){
		boolean v;
		if(this.getXMin() <= t.getXMin() && this.getYMin() <= t.getYMin() && this.getXMax() >= t.getXMax() && this.getYMax() >= t.getYMax() ){
			v=true;
		}
		else{
			v=false;
		}
		return v;
	}
	
	public boolean contains(Circle c){
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
