package domaine;

public class ClientParticulier extends Client {

	// Propriétés

	//int i; // 13 chiffres
	//private String numeroSecuriteSociale = "" + i;
	private String numeroSecuriteSociale;
	private CompteEpargne compteEpargne = new CompteEpargne();
	

	// Méthodes : getters/setters
	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	/**
	 * @return the compteEpargne
	 */
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	/**
	 * @param compteEpargne the compteEpargne to set
	 */
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	// Méthodes : Constructeurs
	public ClientParticulier(String nom_client, 
			String prenom_client, 
			String adresse_client, 
			String ville_client,
			String codePostal_client2, 
			String telephone_client2, 
			String numeroSecuriteSociale) {
		super(nom_client, prenom_client, adresse_client, ville_client, codePostal_client2, telephone_client2);

		if (numeroSecuriteSociale.length() == 13) {
			this.numeroSecuriteSociale = numeroSecuriteSociale;
		} else {
			System.out.println("Invalid numero Securite Sociale");
		}
	}

	public ClientParticulier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
