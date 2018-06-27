package domaine;

public class ClientEntreprise extends Client {

	// Propri�t�s
	int i; // 6 chiffres
	private String siret = "" + i; // 6 chiffres

	// M�thodes : getters/setters
	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	// M�thodes : Constructeurs
	public ClientEntreprise(String nom_client, 
			String prenom_client, 
			String adresse_client,
			String ville_client,
			String codePostal_client2, 
			String telephone_client2, 
			String siret) {
		super(nom_client, prenom_client, adresse_client, ville_client, codePostal_client2, telephone_client2);

		if (siret.length() == 6) {
			this.siret = siret;
		} else {
			System.out.println("Invalid siret");
		}

	}

}
