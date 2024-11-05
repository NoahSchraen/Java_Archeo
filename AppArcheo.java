package fr.babylone.archeo;
import fr.babylone.archeo.entites.*;
import java.util.ArrayList ;
public class AppArcheo {

	public static void main(String[] args) {
		//1-ZoneFouille
		ZoneFouille zof1 = new ZoneFouille(1, "Cramont") ;
		System.out.println(zof1.toString()) ;
		System.out.println(zof1.getNumero()) ;
		System.out.println(zof1.getVille()) ;
		zof1.setVille("Prouville");
		System.out.println(zof1.toString());
		
		//2-Site
		Site st1 = new Site(1, 4, 3, zof1);
		System.out.println(st1.toString()) ;
		System.out.println(st1.getSuperficie()) ;
		System.out.println(st1.getZone().getVille()) ;
		
		//3-Objets
		Objets obj1 = new Objets(1,"Pied de table", 1, Conservation.INTACT) ;
		System.out.println(obj1.toString()) ;
		System.out.println(obj1.getDesignation()) ;
		System.out.println(obj1.getEtat());
		
		Objets obj2 = new Objets(2, "Nez de gargouille", 2, Conservation.TRES_MAUVAIS_ETAT);
		System.out.println(obj2.toString()) ;
		System.out.println(obj2.getCompletude());
		obj2.setCompletude(1); 
		System.out.println(obj2.getCompletude()) ;
		
		
		//4-Archéologues
		Etudiant ark1 = new Etudiant(1, "OSBORN", "Harry", AnneeEtude.L3);
		System.out.println(ark1.toString()) ;
		System.out.println(ark1.getAnneeEtudes()) ;
		
		Archeologue ark2 = new Etudiant(2, "ALLEN", "Liz", AnneeEtude.M3);
		System.out.println(ark2.toString()) ;
		System.out.println(((Etudiant)ark2).getAnneeEtudes()) ;
		
		Professeur ark3 = new Professeur(1,"PARKER", "Peter", 2);
		System.out.println(ark3.toString()) ;
		System.out.println(ark3.getCorps()) ;
		
		Archeologue ark4 = new Professeur(2, "WATSON", "Mary-Jane", 1);
		System.out.println(ark4.toString()) ;
		System.out.println(((Professeur)ark4).getCorps()) ;
		
		ArrayList<Archeologue> arks = new ArrayList<Archeologue>() ;
		arks.add(ark1) ;
		arks.add(ark2) ;
		arks.add(ark3) ;
		arks.add(ark4) ;
		System.out.println(arks.toString()) ;
		for (Archeologue archeo : arks) {
			System.out.println(archeo.getNom());
		}
		//for (Archeologue etudiants : arks) {
			
		//}

	}
}