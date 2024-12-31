package Geometrie;

public class PointNom3D extends Point3D {
	protected String nom;
	public PointNom3D(double x, double y, double z, String nom) {
		super(x, y, z);
		this.nom=nom;
	}
	@Override
	public void affCoord () {
		System.out.println( "Coordonnées :"+ "x= "+this.getX()+"y= "+this.getZ()+"z= "+this.getZ()+"nom= "+this.nom) ; 
	}
	public void tranlate (double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public boolean equals (PointNom3D o) {
		//option 1
		//return o.equals(this);
		//option 2
		return (this.nom==o.nom&&this.getX()==o.getX()&&this.getY()==o.getY()&&this.getZ()==o.getZ());
	}
}
