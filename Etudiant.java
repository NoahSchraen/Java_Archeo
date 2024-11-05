package fr.babylone.archeo.entites;

public class Etudiant extends Archeologue {
	AnneeEtude anneeEtudes ;

	public Etudiant(int numero, String nom, String prenom, AnneeEtude anneeEtudes) {
		super(numero, nom, prenom);
		this.anneeEtudes = anneeEtudes;
	}

	public AnneeEtude getAnneeEtudes() {
		return anneeEtudes;
	}

	public void setAnneeEtudes(AnneeEtude anneeEtudes) {
		this.anneeEtudes = anneeEtudes;
	}

	@Override
	public String toString() {
		return "Etudiant [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", anneeEtudes=" + anneeEtudes
				+ "]";
	}

	
	

	


	
	
}
