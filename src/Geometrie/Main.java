package Geometrie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex5
		/*
		 * 	Point p1=new Point(0,5);
			Point p2=new Point(0,6);
			Point3D p3=new Point3D(0,5,2);
			Point3D p4=new Point3D(0,6,1);
			PointNom3D p5=new PointNom3D(0,5,3,"p5");
			PointNom3D p6=new PointNom3D(0,6,2,"p6");
			p1.affCoord();
			p2.affCoord();
			p3.affCoord();
			p4.affCoord();
			p5.affCoord();
			p6.affCoord();
			
			EX7 
			oui on peut afficher les points dons une boucle
			
			EX8
		  	List<Point> l1=new ArrayList<Point>();
			l1.add(new Point(0,5));
			l1.add(new Point(0,6));
			l1.add(new Point3D(0,5,2));
			l1.add(new Point3D(0,6,1));
			l1.add(new PointNom3D(0,5,3,"p5"));
			l1.add(new PointNom3D(0,6,2,"p6"));
			
			for(Point p:l1) {
				p.affCoord();
			}
			 
			EX12 il faut modifier this.attribut par l'utilisation de les getters et setters
		 * 
		 */
		
		List<Point> l1=new ArrayList<Point>();
		l1.add(new Point(0,5));
		l1.add(new Point(0,6));
		l1.add(new Point3D(0,5,2));
		l1.add(new Point3D(0,6,1));
		l1.add(new PointNom3D(0,5,3,"p5"));
		l1.add(new PointNom3D(0,6,2,"p6"));
		
		for(Point p:l1) {
			p.affCoord();
		}
		
	}

}
