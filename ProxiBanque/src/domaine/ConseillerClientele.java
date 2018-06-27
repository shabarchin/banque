package domaine;

import java.util.ArrayList;

import service.I_systemInformation;

public class ConseillerClientele implements I_systemInformation {

	/*-------------------------
	 * attributs
	 -------------------------*/

	private int id_conseillerC;
	private String nom_conseiller;
	private String prenom_conseillerC;
	private ArrayList<Client> listeClientsConseiller = new ArrayList<Client>();

	/*-------------------------
		 * methodes
		 -------------------------*/

	// getters et setters

	public int getId_conseillerC() {
		return id_conseillerC;
	}

	public void setId_conseillerC(int id_conseillerC) {
		this.id_conseillerC = id_conseillerC;
	}

	public String getNom_conseiller() {
		return nom_conseiller;
	}

	public void setNom_conseiller(String nom_conseiller) {
		this.nom_conseiller = nom_conseiller;
	}

	public String getPrenom_conseillerC() {
		return prenom_conseillerC;
	}

	public void setPrenom_conseillerC(String prenom_conseillerC) {
		this.prenom_conseillerC = prenom_conseillerC;
	}

	public ArrayList<Client> getListeClientsConseiller() {
		return listeClientsConseiller;
	}

	public void setListeClientsConseiller(ArrayList<Client> listeClientsConseiller) {
		if (listeClientsConseiller.size() <= 10) {
			this.listeClientsConseiller = listeClientsConseiller;
		} else {
			System.out.println("Ce conseiller a d�j� 10 clients !");
		}

	}
	// constructeurs

	public ConseillerClientele(int id_conseillerC,
			String nom_conseiller,
			String prenom_conseillerC) {
		super();
		this.id_conseillerC = id_conseillerC;
		this.nom_conseiller = nom_conseiller;
		this.prenom_conseillerC = prenom_conseillerC;
	}

	public ConseillerClientele() {
		super();
		// TODO Auto-generated constructor stub
	}

	// methodes m�tier

	@Override
	public Client creerClient(Client clientAcreer) {
		// TODO creer la methode creerClient.
		return null;
	}

	@Override
	public Client modifierClient(Client clientAmodifier) {
		// TODO cr�er le corps de la m�thode
		return null;
	}

	@Override
	public Client lireInfoClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerClient(Client clientAsupprimer) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean auditerCompteClient(Compte compteAauditer) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * M�thode pour attribuer Carte visa electron
	 * 
	 * @param compte
	 *            compte auquel est associ� la carte
	 */
	public void ouvrirVisaElectron(Compte compte) {
		// TODO cr�er le contenu de la m�thode
	}

	/**
	 * �thode pour attribuer Carte visa premier
	 * 
	 * @param compte
	 *            compte auquel est associ� la carte
	 */
	public void ouvrirVisaPremier(Compte compte) {
		// TODO cr�er le contenu de la m�thode
	}

	/**
	 * M�thode pour faire un virement de compte courant � compte courant :
	 * 
	 * @param compteAdebiter
	 *            Compte courant � d�biter
	 * @param compteAcrediter
	 *            Compte courant � cr�diter
	 * @param montantDuVirement
	 *            Montant du virement
	 */
	public void faireVirement(CompteCourant compteAdebiter, CompteCourant compteAcrediter, float montantDuVirement) {

		// 1) v�rifier que compteAdebiter != compteAcrediter
		String string1 = compteAdebiter.getNumeroCompte();
		String string2 = compteAcrediter.getNumeroCompte();
		if (string1.equals(string2) == true) {
			System.out.println("Attention, les 2 comptes ne peuvent pas �tre les m�mes. Op�ration impossible.");
		}
		// 2) verifier que le solde est suffisant pour le virement :
		else if (compteAdebiter.getSolde() + compteAdebiter.getPlafondDecouvert() <= montantDuVirement) {
			System.out.println("Le solde est insuffisant. Op�ration impossible.");
		} else {
			// 3) sinon compteAdebiter.setSolde = solde_compteAdebiter - montantDuVirement
			double solde1 = compteAdebiter.getSolde() - montantDuVirement;
			compteAdebiter.setSolde(solde1);
			// ET
			// compteAcrediter.setSolde = solde_compteAcrediter + montantDuVirement
			double solde2 = compteAcrediter.getSolde() + montantDuVirement;
			compteAcrediter.setSolde(solde2);
			System.out.println("Le virement est bien fait.");

		}

	}

	/**
	 * M�thode pour faire un virement de compte �pargne � compte courant :
	 * 
	 * @param compteAdebiter
	 *            Compte �pargne � d�biter
	 * @param compteAcrediter
	 *            Compte courant � cr�diter
	 * @param montantDuVirement
	 *            Montant du virement
	 */
	public void faireVirement(CompteEpargne compteAdebiter, CompteCourant compteAcrediter, float montantDuVirement) {

		// 1) v�rifier que compteAdebiter != compteAcrediter
		String string1 = compteAdebiter.getNumeroCompte();
		String string2 = compteAcrediter.getNumeroCompte();
		if (string1.equals(string2) == true) {
			System.out.println("Attention, les 2 comptes ne peuvent pas �tre les m�mes. Op�ration impossible.");
		}

		// 2) verifier que le solde est suffisant pour le virement
		else if (compteAdebiter.getSolde() <= montantDuVirement) {
			System.out.println("Le solde est insuffisant. Op�ration impossible.");
		}

		else {
			// 3) si la v�rification pr�c�dente est vrai :

			double solde1 = compteAdebiter.getSolde() - montantDuVirement;
			compteAdebiter.setSolde(solde1);
			// ET
			double solde2 = compteAcrediter.getSolde() + montantDuVirement;
			compteAcrediter.setSolde(solde2);
			System.out.println("Le virement est bien fait");

		}

	}

	/**
	 * M�thode pour faire un virement de compte courant � compte �pargne :
	 * 
	 * @param compteAdebiter
	 *            Compte courant � d�biter
	 * @param compteAcrediter
	 *            Compte �pargne � cr�diter
	 * @param montantDuVirement
	 *            Montant du virement
	 */
	public void faireVirement(CompteCourant compteAdebiter, CompteEpargne compteAcrediter, float montantDuVirement) {

		// 1) v�rifier que compteAdebiter != compteAcrediter
		String string1 = compteAdebiter.getNumeroCompte();
		String string2 = compteAcrediter.getNumeroCompte();
		if (string1.equals(string2) == true) {
			System.out.println("Virement error");
		}

		// 2) verifier que le solde est suffisant pour le virement

		else if (compteAdebiter.getSolde() + compteAdebiter.getPlafondDecouvert() <= montantDuVirement) {
			System.out.println("Not enough money");
		}

		else {
			// 3) si la v�rification pr�c�dente est vrai :

			double solde1 = compteAdebiter.getSolde() - montantDuVirement;
			compteAdebiter.setSolde(solde1);
			// ET
			double solde2 = compteAcrediter.getSolde() + montantDuVirement;
			compteAcrediter.setSolde(solde2);
			System.out.println("Le virement est bien fait");

		}

	}

	/**
	 * M�thode pour faire un virement de compte �pargne � compte �pargne :
	 * 
	 * @param compteAdebiter
	 *            Compte �pargne � d�biter
	 * @param compteAcrediter
	 *            Compte �pargne � cr�diter
	 * @param montantDuVirement
	 *            Montant du virement
	 */
	public void faireVirement(CompteEpargne compteAdebiter, CompteEpargne compteAcrediter, float montantDuVirement) {

		// 1) v�rifier que compteAdebiter != compteAcrediter
		String string1 = compteAdebiter.getNumeroCompte();
		String string2 = compteAcrediter.getNumeroCompte();
		if (string1.equals(string2) == true) {
			System.out.println("Virement error");
		}

		// 2) verifier que le solde est suffisant pour le virement :
		else if (compteAdebiter.getSolde() <= montantDuVirement) {
			System.out.println("Not enough money");
		}

		else {
			// 3) si la v�rification pr�c�dente est vrai :

			double solde1 = compteAdebiter.getSolde() - montantDuVirement;
			compteAdebiter.setSolde(solde1);
			// ET
			double solde2 = compteAcrediter.getSolde() + montantDuVirement;
			compteAcrediter.setSolde(solde2);
			System.out.println("Le virement est bien fait");

		}

	}

	/**
	 * M�thode pour simuler un cr�dit � la consommation
	 * 
	 * @param clientDemandeur
	 *            Client demandeur de la simulation
	 * @return true : le client peut faire le cr�dit.
	 */
	public boolean simulerCreditConsommation(Client clientDemandeur) {
		return false;

	}

	/**
	 * M�thode pour simuler un cr�dit immobilier
	 * 
	 * @param clientDemandeur
	 *            Client demandeur de la simulation
	 * @return true : le client peut faire le cr�dit
	 */
	public boolean simulerCreditImmobilier(Client clientDemandeur) {
		return false;

	}

	/**
	 * M�thode de gestion de patrimoine, pour placer l'argent des clients fortunes
	 * depuis un compte courant
	 * 
	 * @param client
	 *            : Client fortun�
	 * @param montantAplacer
	 *            : montant � placer
	 * @param compteAdebiter
	 *            : compte courant du client supp � 500 000
	 */
	public void gestionPatrimoine(ClientFortune client, double montantAplacer, CompteCourant compteAdebiter) {

		// 0) v�rifier que le client appartient bien au conseiller :
		if (client.getConseillerClientele() != this) {
			System.out.println("Ce client n'est pas sous la responsabilit� de ce conseiller. Op�ration impossible.");
		} else {
			// 1) v�rifier que compteAdebiter > 500000
			double soldeDuCompte = compteAdebiter.getSolde();

			if (soldeDuCompte < 500000) {
				System.out.println("Solde insuffisant, op�ration impossible.");
			} else {
				// 2) faire le placement
				double nouveauSolde = soldeDuCompte - montantAplacer;

				if (nouveauSolde <= compteAdebiter.getPlafondDecouvert()) {
					System.out.println("Le montant du placement est trop �lev�, op�ration impossible.");
				} else {
					// on v�rifie que le nouveau solde n'est pas inf�rieur au d�couvert autoris�.

					compteAdebiter.setSolde(nouveauSolde);

					// 3) afficher message pour dire que le virement s'est bien effectu�
					System.out.println("Le placement de " + montantAplacer + " est effectu�. Le nouveau solde est : "
							+ compteAdebiter.getSolde());
				}

			}
		}
	}

	/**
	 * M�thode de gestion de patrimoine, pour placer l'argent des clients fortunes
	 * depuis un compte �pargne
	 * 
	 * @param client
	 *            : Client fortun�
	 * @param montantAplacer
	 *            : montant � placer
	 * @param compteAdebiter
	 *            : compte �pargne du client supp � 500 000
	 */
	public void gestionPatrimoine(ClientFortune client, double montantAplacer, CompteEpargne compteAdebiter) {

		// 0) v�rifier que le client appartient bien au conseiller :
		if (client.getConseillerClientele() != this) {
			System.out.println("Ce client n'est pas sous la responsabilit� de ce conseiller. Op�ration impossible.");
		} else {
			// 1) v�rifier que compteAdebiter > 500000
			double soldeDuCompte = compteAdebiter.getSolde();

			if (soldeDuCompte < 500000) {
				System.out.println("Solde insuffisant, op�ration impossible.");
			} else {
				// 2) faire le placement
				double nouveauSolde = soldeDuCompte - montantAplacer;

				if (nouveauSolde <= 0) {
					System.out.println("Le montant du placement est trop �lev�, op�ration impossible.");
				} else {
					// on v�rifie que le nouveau solde n'est pas inf�rieur au d�couvert autoris�.

					compteAdebiter.setSolde(nouveauSolde);

					// 3) afficher message pour dire que le virement s'est bien effectu�
					System.out.println("Le placement de " + montantAplacer + " est effectu�. Le nouveau solde est : "
							+ compteAdebiter.getSolde());
				}

			}
		}
	}

}
