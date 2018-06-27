package domaine;

import java.util.Date;

public class ComptePlacement extends Compte {
	
	// Propriétés
	
			private double tauxRemuneration;
			
	
	// Méthodes : getters/setters

			public double getTauxRemuneration() {
				return tauxRemuneration;
			}

			public void setTauxRemuneration(double tauxRemuneration) {
				this.tauxRemuneration = tauxRemuneration;
			}

			
	// Méthodes : Constructeurs
			
			public ComptePlacement(String numeroCompte,
					double solde, 
					Date dateOuverture, 
					double tauxRemuneration) {
				super(numeroCompte, solde, dateOuverture);
				this.tauxRemuneration = tauxRemuneration;
			}

			public ComptePlacement() {
				super();
				// TODO Auto-generated constructor stub
			}

			
			
}
