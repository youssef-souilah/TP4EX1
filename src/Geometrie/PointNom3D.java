package Geometrie;

public class PointNom3D extends Point3D {
	protected String nom;
	public PointNom3D(double x, double y, double z, String nom) {
		super(x, y, z);
		this.nom=nom;
	}
	@Override
	public void affCoord () {
		System.out.println( "Coordonnées :"+ "x= "+this.x+"y= "+this.y+"z= "+this.z+"nom= "+this.nom) ; 
	}
	public void tranlate (double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public boolean equals (PointNom3D o) {
		//option 1
		//return o.equals(this);
		//option 2
		return (this.nom==o.nom&&this.x==o.x&&this.y==o.y&&this.z==o.z);
	}
}
