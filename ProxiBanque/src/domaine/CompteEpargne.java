package domaine;

import java.util.Date;

public class CompteEpargne extends Compte {
	
	// Propri�t�s
	
		private double tauxRemuneration = 0.03;
		
		
	// M�thodes : getters/setters
		public double getTauxRemuneration() {
			return tauxRemuneration;
		}

		public void setTauxRemuneration(double tauxRemuneration) {
			this.tauxRemuneration = tauxRemuneration;
		}
		
		
	// M�thodes : Constructeurs
		public CompteEpargne(String numeroCompte,
				double solde, Date dateOuverture,
				double tauxRemuneration) {
			super(numeroCompte, solde, dateOuverture);
			this.tauxRemuneration = tauxRemuneration;
		}

		public CompteEpargne() {
			super();
			// TODO Auto-generated constructor stub
		}
		
				
		

}
