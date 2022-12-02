package ROB;
import java.util.Scanner;
public class robot {
	private String nom;
	private int PV;
	private int PA=10;
	
	public robot(String nom) {
		this.setNom(nom);
		this.setPV(10);
		this.setPA(20);
	}
	
	public void degats(int degats) {
	this.setPV(this.getPV() - degats);
	System.out.println("Vous avez perdu"+degats+"point de vie");
	}
	
	public void Fire(robot roattaque) {
		if (roattaque.getPV()<=0) {
			System.out.println(roattaque.getNom()+" est déjà mort");
		}
		else {
			roattaque.setPV(roattaque.getPV() -2);
			System.out.println(roattaque.getNom()+" a été touché par le robot "+this.nom);
			System.out.println(" Oh "+roattaque.getNom()+" il vous reste "+roattaque.getPV()+ " points de vie");
		}
	}
	
	String getNom() {
		return nom;
	}

	public void isDead(robot ro1) {
		robot a = new robot("Zack");
		robot b = new robot("Steph");
		if(a.getPV()==0) System.out.print(a.getNom()+" vous etes mort");
		else if(b.getPV()==0) System.out.print(b.getNom()+" vous etes mort");  
	}

	public int getPV() {
		return PV;
	}

	public void setPV(int PV) {
		this.PV = PV;
	}

	public String getNom1() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPA() {
		return PA;
	}

	public void setPA(int PA) {
		this.PA = PA;
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}
	
	}

