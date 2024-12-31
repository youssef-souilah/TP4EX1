package Geometrie;

public class Point3D extends Point {
	private double z ;
	public Point3D(double x, double y,double z) {
		super(x,y) ; 
		this.z=z ;
	}
	@Override
	public void affCoord () {
		System.out.println( "Coordonnées :"+ "x= "+this.getX()+"y= "+this.getY()+"z= "+this.getZ()) ; 
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
}
