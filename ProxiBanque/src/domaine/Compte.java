package domaine;

import java.util.Date;

public class Compte {
	
	// Propri�t�s
	
			private String numeroCompte;
			private double solde;
			private Date dateOuverture;
			
	// M�thodes : getters/setters
			public String getNumeroCompte() {
				return numeroCompte;
			}
			public void setNumeroCompte(String numeroCompte) {
				this.numeroCompte = numeroCompte;
			}
			public double getSolde() {
				return solde;
			}
			public void setSolde(double solde) {
				this.solde = solde;
			}
			public Date getDateOuverture() {
				return dateOuverture;
			}
			public void setDateOuverture(Date dateOuverture) {
				this.dateOuverture = dateOuverture;
			}
			
	// M�thodes : Constructeurs
			public Compte(String numeroCompte,
					double solde, 
					Date dateOuverture) {
				super();
				this.numeroCompte = numeroCompte;
				this.solde = solde;
				this.dateOuverture = dateOuverture;
			}
			public Compte() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			
			
			
			

}
