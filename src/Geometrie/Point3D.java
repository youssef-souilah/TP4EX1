package Geometrie;

public class Point3D extends Point {
	protected double z ;
	public Point3D(double x, double y,double z) {
		super(x,y) ; 
		this.z=z ;
	}
	@Override
	public void affCoord () {
		System.out.println( "Coordonnées :"+ "x= "+this.x+"y= "+this.y+"z= "+this.z) ; 
	}
}
