package lanceur;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import domaine.Agence;
import domaine.Client;
import domaine.ClientEntreprise;
import domaine.ClientFortune;
import domaine.ClientParticulier;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.ConseillerClientele;
import domaine.Gerant;

public class ProxiBanqueSI {

	public static void main(String[] args) {

		// creer un gerant d'agence
		Gerant gerant1 = new Gerant(1, "Big", "Boss");

		// creer une agence :
		Date dateCreationAgence1 = new Date("25/06/2018");

		Agence agence1 = new Agence("age01", dateCreationAgence1, gerant1);
		System.out.println("Bonjour, bienvenue dans notre agence " + agence1.getNumeroIdentification()
				+ ", gérée par : " + gerant1.getNom_conseiller() + " " + gerant1.getPrenom_conseillerC());
		System.out.println("---");
		// creer une liste de conseillers attribués à l'agence

		ConseillerClientele conseiller1 = new ConseillerClientele(1, "DUPOND", "Sylvie");
		ConseillerClientele conseiller2 = new ConseillerClientele(1, "RICHE", "Richy");

		ArrayList<ConseillerClientele> listeConseillersAgence = new ArrayList<ConseillerClientele>();
		listeConseillersAgence.add(conseiller1);
		listeConseillersAgence.add(conseiller2);
		agence1.setListeConseillersAgence(listeConseillersAgence);

		System.out.println("Voici la liste des conseillers : ");

		for (ConseillerClientele cons : listeConseillersAgence) {
			System.out.println(cons.getPrenom_conseillerC() + " " + cons.getNom_conseiller());
		}
		System.out.println("---");

		// creer une liste de client liée à l'agence

		ClientParticulier client1 = new ClientParticulier("Client1", "prenomClient1", "rue du client",
				"ville du client", "31000", "0500000000", "1111111111111");
		client1.setConseillerClientele(conseiller1);
		client1.setAgenceAssociee(agence1);

		ClientEntreprise client2 = new ClientEntreprise("Client2", "prenomClient2", "rue du client", "ville du client",
				"31000", "0500000000", "222222");
		client2.setConseillerClientele(conseiller2);
		client2.setAgenceAssociee(agence1);

		ClientFortune client3 = new ClientFortune("Client3", "prenomClient3", "rue du client", "ville du client",
				"31000", "0500000000", "3333333333333");
		client3.setConseillerClientele(conseiller1);
		client3.setAgenceAssociee(agence1);

		ClientFortune client4 = new ClientFortune("Client4", "prenomClient4", "rue du client", "ville du client",
				"31000", "0500000000", "3333333333333");
		client4.setConseillerClientele(conseiller2);
		client4.setAgenceAssociee(agence1);

		ArrayList<Client> listeClientsAgence = new ArrayList<Client>();
		listeClientsAgence.add(client1);
		listeClientsAgence.add(client2);
		listeClientsAgence.add(client3);
		listeClientsAgence.add(client4);

		// créer une liste de clients attribués aux conseillers

		ArrayList<Client> listeClientsConseiller1 = new ArrayList<Client>();
		listeClientsConseiller1.add(client1);
		listeClientsConseiller1.add(client3);
		conseiller1.setListeClientsConseiller(listeClientsConseiller1);

		ArrayList<Client> listeClientsConseiller2 = new ArrayList<Client>();
		listeClientsConseiller2.add(client2);
		listeClientsConseiller2.add(client4);

		conseiller2.setListeClientsConseiller(listeClientsConseiller2);

		// attribuer un compte à chaque client :
		CompteCourant comptecourantClient1 = new CompteCourant("cc1111111", 1000, new Date("25/06/2018"), 100);
		CompteEpargne compteEpargneClient1 = new CompteEpargne("ce1111111", 500, new Date("25/06/2018"), 0.05);
		client1.setCompteCourant(comptecourantClient1);
		client1.setCompteEpargne(compteEpargneClient1);

		CompteCourant comptecourantClient2 = new CompteCourant("cc2222222", 10000, new Date("25/06/2018"), 1000);
		client2.setCompteCourant(comptecourantClient2);

		CompteCourant comptecourantClient3 = new CompteCourant("cc3333333", 1000000, new Date("25/06/2018"), 10000);
		client3.setCompteCourant(comptecourantClient3);

		CompteCourant comptecourantClient4 = new CompteCourant("cc4444444", 2000000, new Date("25/06/2018"), 100000);
		client4.setCompteCourant(comptecourantClient4);

		System.out.println("la liste des clients de l'agence : ");
		for (Client clientAgence : listeClientsAgence) {
			System.out.println(clientAgence.getNom_client() + " " + clientAgence.getPrenom_client() + " solde : "
					+ clientAgence.getCompteCourant().getSolde() + "€");
		}
		System.out.println("---");

		System.out.println(conseiller1.getPrenom_conseillerC() + " " + conseiller1.getNom_conseiller()
				+ " gère les clients suivant : ");
		for (Client clientCons1 : listeClientsConseiller1) {
			System.out.println(clientCons1.getNom_client() + " " + clientCons1.getPrenom_client() + " solde : "
					+ clientCons1.getCompteCourant().getSolde() + "€");
		}
		System.out.println("---");

		// Appel des méthodes
		// -1) en mettant les données en dur

		// gestionPatrimoine

		ClientFortune client = client4;
		double montantAplacer = 6000000;
		CompteCourant compteAdebiter = (CompteCourant) client.getCompteCourant();

		System.out.println(conseiller2.getPrenom_conseillerC() + " " + conseiller2.getNom_conseiller()
				+ " effectue un placement pour " + client.getPrenom_client() + " " + client.getNom_client());

		conseiller2.gestionPatrimoine(client, montantAplacer, compteAdebiter);

		System.out.println("---");

		// virement
		System.out.println(conseiller1.getPrenom_conseillerC() + " " + conseiller1.getNom_conseiller()
				+ " effectue un virement de 20 depuis " + comptecourantClient1.getNumeroCompte() + "vers"
				+ comptecourantClient2.getNumeroCompte());
		conseiller1.faireVirement(comptecourantClient1, comptecourantClient2, 20);
		System.out.println("---");

		System.out.println(conseiller2.getPrenom_conseillerC() + " " + conseiller2.getNom_conseiller()
				+ " effectue un virement de 10 depuis " + comptecourantClient1.getNumeroCompte() + "vers"
				+ comptecourantClient1.getNumeroCompte());
		conseiller2.faireVirement(comptecourantClient1, comptecourantClient1, 10);
		System.out.println("---");
		/*--------------
		 * -------------
		 */

		System.out.println("Souhaitez-vous effectuer un virement ? O -> oui , autre touche : arret du programme");
		Scanner sc = new Scanner(System.in);

		String reponse = sc.nextLine();
		CompteCourant compteAdeb = new CompteCourant();
		CompteCourant compteAcred = new CompteCourant();
		float montantVir;
		if (reponse.equals("O")) {
			do {
				// entrée du compte à débiter
				System.out.println("Entrez le n° du compte à débiter: \n" + "1 -> compte courant du client 1\n"
						+ "2 ->compte courant du client 2\n" + "3 -> compte courant du client 3\n"
						+ "4 -> compte courant du client 4");
				String reponse2 = sc.nextLine();
				switch (reponse2) {
				case "1":
					compteAdeb = comptecourantClient1;
					break;
				case "2":
					compteAdeb = comptecourantClient2;
					break;
				case "3":
					compteAdeb = comptecourantClient3;
					break;
				case "4":
					compteAdeb = comptecourantClient4;
					break;
				default:
					System.out.println("ce compte n'existe pas");
				}

				// entrée du compte à créditer
				System.out.println("Entrez le n° du compte à créditer: \n" 
				+ "1 -> compte courant du client 1\n"
				+ "2 ->compte courant du client 2\n" 
				+ "3 -> compte courant du client 3\n"
				+ "4 -> compte courant du client 4");
				String reponse3 = sc.nextLine();
				switch (reponse3) {
				case "1":
					compteAcred = comptecourantClient1;
					break;
				case "2":
					compteAcred = comptecourantClient2;
					break;
				case "3":
					compteAcred = comptecourantClient3;
					break;
				case "4":
					compteAcred = comptecourantClient4;
					break;
				default:
					System.out.println("ce compte n'existe pas");
				}

				// entrée du montant à virer
				System.out.println("Entrez le montant à virer : ");
				montantVir = sc.nextFloat();

				// virement :
				conseiller1.faireVirement(compteAdeb, compteAcred, montantVir);

				do {
					System.out.println("Voulez-vous reessayer ? (O/N)");
					reponse = sc.nextLine();
				} while (!reponse.equals("O") && !reponse.equals("N"));

			} while (reponse.equals("O"));
		}

		System.out.println("Au revoir !");

	}

}
