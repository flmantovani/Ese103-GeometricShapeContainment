package geometricshape;

public class Circle extends GeometricShape{
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r){
		this.xC=xC;
		this.yC=yC;
		if(r<=0)
			throw new IllegalArgumentException();
		else
			this.r=r;	
	}
	
	public double getXC() {
		return xC;
	}
	public void setXC(double xC) {
		this.xC = xC;
	}
	public double getYC() {
		return yC;
	}
	public void setYC(double yC) {
		this.yC = yC;
	}
	public double getR() {
		return r;
	}
	
	/**
	 * 
	 * @param r
	 */
	public void setR(double r) {
		if (r<=0)
			throw new IllegalArgumentException("Il raggio deve essere positivo");
		else
			this.r=r;
	}
	
	@Override
	public double getXMin(){
		return this.xC - this.r;
	}
	
	@Override
	public double getXMax(){
		return this.xC + this.r;
	}
	
	@Override
	public double getYMin(){
		return this.yC - this.r;
	}
	
	@Override
	public double getYMax(){
		return this.yC + this.r;
	}
	
	
}
