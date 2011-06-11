package pl.Tank;


public class czolg {
	
	double x;
	double y;
	double speed;
	double angle;
	boolean alive;
	
	//getters
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public boolean isAlive() {
		return alive;
	}
	//setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setAngle(double  angle) {
		this.angle = angle;
	}
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	//other methods	
	public void makeStep() {
		this.x = Math.cos(angle)*speed;
		this.y = Math.sin(angle)*speed;		
	}
}