package domaine;

import java.util.ArrayList;

public class Gerant extends ConseillerClientele {
	/*-------------------------
	 * attributs
	 -------------------------*/
	private ArrayList<ConseillerClientele> listeConseillers = new ArrayList<ConseillerClientele>();

	/*-------------------------
		 * methodes
		 -------------------------*/

	// getters et setters

	/**
	 * @return the listeConseillers
	 */
	public ArrayList<ConseillerClientele> getListeConseillers() {
		return listeConseillers;
	}

	/**
	 * @param listeConseillers
	 *            the listeConseillers to set
	 */
	public void setListeConseillers(ArrayList<ConseillerClientele> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}

	// constructeurs

	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerant(int id_conseillerC, 
			String nom_conseiller, 
			String prenom_conseillerC) {
		super(id_conseillerC, nom_conseiller, prenom_conseillerC);
		// TODO Auto-generated constructor stub
	}

	// methodes métier

}
