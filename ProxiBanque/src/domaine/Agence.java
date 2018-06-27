package domaine;

import java.util.ArrayList;
import java.util.Date;

public class Agence {
	/*-------------------------
	 * attributs
	 -------------------------*/
	private String numeroIdentification;
	private Date dateCreation;
	private ArrayList<Client> listeClientsAgence = new ArrayList<Client>();
	private Gerant gerantAgence = new Gerant();
	private ArrayList<ConseillerClientele> listeConseillersAgence = new ArrayList<ConseillerClientele>();

	/*-------------------------
	 * methodes
	 -------------------------*/

	// getters et setters
	/**
	 * @return the numeroIdentification
	 */
	public String getNumeroIdentification() {
		return numeroIdentification;
	}

	/**
	 * @param numeroIdentification
	 *            the numeroIdentification to set
	 */
	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the listeClientsAgence
	 */
	public ArrayList<Client> getListeClientsAgence() {
		return listeClientsAgence;
	}

	/**
	 * @param listeClientsAgence
	 *            the listeClientsAgence to set
	 */
	public void setListeClientsAgence(ArrayList<Client> listeClientsAgence) {
		this.listeClientsAgence = listeClientsAgence;
	}

	/**
	 * @return the gerantAgence
	 */
	public Gerant getGerantAgence() {
		return gerantAgence;
	}

	/**
	 * @param gerantAgence
	 *            the gerantAgence to set
	 */
	public void setGerantAgence(Gerant gerantAgence) {
		this.gerantAgence = gerantAgence;
	}

	/**
	 * @return the listeConseillersAgence
	 */
	public ArrayList<ConseillerClientele> getListeConseillersAgence() {
		return listeConseillersAgence;
	}

	/**
	 * @param listeConseillersAgence
	 *            the listeConseillersAgence to set
	 */
	public void setListeConseillersAgence(ArrayList<ConseillerClientele> listeConseillersAgence) {
		this.listeConseillersAgence = listeConseillersAgence;
	}

	// constructeurs

	public Agence() {
		super();
	}

	public Agence(String numeroIdentification, 
			Date dateCreation, 
			ArrayList<Client> listeClientsAgence,
			Gerant gerantAgence, 
			ArrayList<ConseillerClientele> listeConseillersAgence) {
		super();

		// vérifier que la numero d'identification comprends bien 5 caracteres :
		if (numeroIdentification.length() == 5) {
			this.numeroIdentification = numeroIdentification;
			this.dateCreation = dateCreation;
			this.listeClientsAgence = listeClientsAgence;
			this.gerantAgence = gerantAgence;
			this.listeConseillersAgence = listeConseillersAgence;
		} else {
			System.out.println("Attention : le numéro d'identification doit avoir 5 caractères.");
		}

		
	}

	public Agence(String numeroIdentification, 
			Date dateCreation, 
			Gerant gerantAgence) {
		super();
		// vérifier que la numero d'identification comprends bien 5 caracteres :
		if (numeroIdentification.length() == 5) {
			this.numeroIdentification = numeroIdentification;
			this.dateCreation = dateCreation;
			this.gerantAgence = gerantAgence;
		} else {
			System.out.println("Attention : le numéro d'identification doit avoir 5 caractères.");
		}
		
	}

}
