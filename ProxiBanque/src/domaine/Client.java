package domaine;

public class Client {

	// Propriétés

	private String nom_client;
	private String prenom_client;
	private String adresse_client;
	private String ville_client;
	int i; // 9 chiffres
	int j; // 5 chiffres
	private String codePostal_client = "" + j; // 5 chiffres
	private String telephone_client = "0" + i; // 10 chiffres
	//private String codePostal_client ; // 5 chiffres
	//private String telephone_client; // 10 chiffres
	private ConseillerClientele conseillerClientele = new ConseillerClientele();
	//private int idConseiller = conseillerClientele.getId_conseillerC();
	private Agence agenceAssociee = new Agence();
	//private String numAgence = agenceAssociee.getNumeroIdentification();
	private CompteCourant compteCourant;

	// Méthodes : getters/setters

	/**
	 * @return the conseillerClientele
	 */
	public ConseillerClientele getConseillerClientele() {
		return conseillerClientele;
	}

	/**
	 * @param conseillerClientele
	 *            the conseillerClientele to set
	 */
	public void setConseillerClientele(ConseillerClientele conseillerClientele) {
		this.conseillerClientele = conseillerClientele;
	}

	/**
	 * @return the idConseiller
	 */
	/*
	public int getIdConseiller() {
		return idConseiller;
	}*/

	/**
	 * @param idConseiller
	 *            the idConseiller to set
	 */
	/*
	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}*/

	/**
	 * @return the agenceAssociee
	 */
	public Agence getAgenceAssociee() {
		return agenceAssociee;
	}

	/**
	 * @param agenceAssociee
	 *            the agenceAssociee to set
	 */
	public void setAgenceAssociee(Agence agenceAssociee) {
		this.agenceAssociee = agenceAssociee;
	}

	/**
	 * @return the numAgence
	 */
	/*
	public String getNumAgence() {
		return numAgence;
	}*/

	/**
	 * @param numAgence
	 *            the numAgence to set
	 */
	/*
	public void setNumAgence(String numAgence) {
		this.numAgence = numAgence;
	}*/

	/**
	 * @return the compteCourant
	 */
	public Compte getCompteCourant() {
		return compteCourant;
	}

	/**
	 * @param compteCourant
	 *            the compteCourant to set
	 */
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public String getAdresse_client() {
		return adresse_client;
	}

	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}

	public String getVille_client() {
		return ville_client;
	}

	public void setVille_client(String ville_client) {
		this.ville_client = ville_client;
	}

	public String getCodePostal_client() {
		return codePostal_client;
	}

	public void setCodePostal_client(String codePostal_client) {
		this.codePostal_client = codePostal_client;
	}

	public String getTelephone_client() {
		return telephone_client;
	}

	public void setTelephone_client(String telephone_client) {
		this.telephone_client = telephone_client;
	}

	// Méthodes : Constructeurs
	public Client(String nom_client, 
			String prenom_client, 
			String adresse_client, 
			String ville_client,
			String codePostal_client2, 
			String telephone_client2) {
		super();

		if (codePostal_client2.length() == 5) {

			this.codePostal_client = codePostal_client2;

		} else {
			System.out.println("Invalid code postal");
		}

		if (telephone_client2.length() == 10) {
			this.codePostal_client = codePostal_client2;
		} else {
			System.out.println("Invalid numero de telephone");
		}

		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.adresse_client = adresse_client;
		this.ville_client = ville_client;

		this.telephone_client = telephone_client2;
	}

	

	public Client(String nom_client, 
			String prenom_client, 
			String adresse_client,
			String ville_client,
			String codePostal_client, 
			String telephone_client, 
			ConseillerClientele conseillerClientele,
			Agence agenceAssociee, 
			CompteCourant compteCourant) {
		super();
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.adresse_client = adresse_client;
		this.ville_client = ville_client;
		this.codePostal_client = codePostal_client;
		this.telephone_client = telephone_client;
		this.conseillerClientele = conseillerClientele;
		this.agenceAssociee = agenceAssociee;
		this.compteCourant = compteCourant;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
