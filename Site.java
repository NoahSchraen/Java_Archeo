package fr.babylone.archeo.entites;

public class Site {
	private int numero;
	private int longueur;
	private int largeur ;
	public ZoneFouille zone ;
	
	
	public Site(int numero, int longueur, int largeur, ZoneFouille zone) {
		this.numero = numero;
		this.longueur = longueur;
		this.largeur = largeur;
		this.zone = zone;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getLongueur() {
		return longueur;
	}


	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}


	public int getLargeur() {
		return largeur;
	}


	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	public ZoneFouille getZone() {
		return zone;
	}


	public void setZone(ZoneFouille zone) {
		this.zone = zone;
	}


	@Override
	public String toString() {
		return "Site [numero=" + numero + ", longueur=" + longueur + ", largeur=" + largeur + ", zone=" + zone + "]";
	}
	
	public int getSuperficie() {
		int superficie = this.longueur * this.largeur ;
		return superficie ;
	}
	
	
	

}
