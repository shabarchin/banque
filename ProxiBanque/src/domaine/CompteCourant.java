package domaine;

import java.util.Date;

public class CompteCourant extends Compte {

	// Propriétés

	private float plafondDecouvert = 1000;

	// Méthodes : getters/setters

	public float getPlafondDecouvert() {
		return plafondDecouvert;
	}

	public void setPlafondDecouvert(float plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	// Méthodes : Constructeurs
	public CompteCourant(String numeroCompte,
			double solde,
			Date dateOuverture, 
			float plafondDecouvert) {
		super(numeroCompte, solde, dateOuverture);
		this.plafondDecouvert = plafondDecouvert;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
