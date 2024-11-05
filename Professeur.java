package fr.babylone.archeo.entites;

public class Professeur extends Archeologue {
	public final int EC = 1;
	public final int MC = 2;
	
	private int corps ;

	public Professeur(int numero, String nom, String prenom, int corps) {
		super(numero, nom, prenom);
		this.corps = corps;
	}

	public int getCorps() {
		return corps;
	}

	public void setCorps(int corps) {
		this.corps = corps;
	}

	@Override
	public String toString() {
		return "Professeur [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", corps=" + corps + "]";
	}

	
	
}
