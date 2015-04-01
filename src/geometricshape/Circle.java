package geometricshape;

public class Circle{
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r){
		this.xC=xC;
		this.yC=yC;
		if(r<=0)
			throw new IllegalArgumentException("The radius must be positive");
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
	
	
	public void setR(double r) {
		if (r<=0)
			throw new IllegalArgumentException("The radius must be positive");
		else
			this.r=r;
	}
	
	public double getXMin(){
		return this.xC - this.r;
	}
	
	public double getXMax(){
		return this.xC + this.r;
	}
	
	public double getYMin(){
		return this.yC - this.r;
	}
	
	public double getYMax(){
		return this.yC + this.r;
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
