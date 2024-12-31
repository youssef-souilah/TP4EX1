package Geometrie;

public class Point {
	protected double x,y ;
	public Point(double x, double y) {
	this.x=x ;
	this.y=y ; }
	public void affCoord () {
		System.out.println( "Coordonnées :"+ "x= "+x+"y= "+y) ; 
	}
}
