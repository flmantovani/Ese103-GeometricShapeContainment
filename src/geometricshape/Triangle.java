package geometricshape;

public class Triangle extends GeometricShape{
	
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

	@Override
	double getXMin() {
		return this.xV;
	}

	@Override
	double getXMax() {
		return this.xV + this.l;
	}

	@Override
	double getYMin() {
		return this.yV;
	}

	@Override
	double getYMax() {
		return this.yV + this.l * Math.sqrt(3)/2;
	}
	
	

}
