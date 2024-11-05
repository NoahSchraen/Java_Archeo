package fr.babylone.archeo.entites;

public class Objets {
	public final int COMPLET = 1;
	public final int PARTIEL = 2;
	
	private int numero;
	private String designation ;
	private int completude = COMPLET ;
	private Conservation etat ;
	
	public Objets(int numero, String designation, int completude, Conservation etat) {
		super();
		this.numero = numero;
		this.designation = designation;
		this.completude = completude;
		this.etat = etat;
	}

	public Objets(int numero, String designation, Conservation etat) {
		super();
		this.numero = numero;
		this.designation = designation;
		this.etat = etat;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getCompletude() {
		return completude;
	}

	public void setCompletude(int completude) {
		this.completude = completude;
	}

	public Conservation getEtat() {
		return etat;
	}

	public void setEtat(Conservation etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Objets [COMPLET=" + COMPLET + ", PARTIEL=" + PARTIEL + ", numero=" + numero + ", designation="
				+ designation + ", completude=" + completude + ", etat=" + etat + "]";
	}
	
	
	
	
	
}
