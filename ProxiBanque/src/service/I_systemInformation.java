package service;

import domaine.Client;
import domaine.Compte;

public interface I_systemInformation {
	
	/**methode de création de client
	 * @param clientAcreer Client a créer
	 * @return client créé
	 */
	public Client creerClient(Client clientAcreer);
	/**méthode pour modifier le client
	 * @param clientAmodifier Client à modifier
	 * @return client modifé
	 */
	public Client modifierClient(Client clientAmodifier);
	/**méthode pour accéder aux informations du client
	 * @param client Client dont on veut les informations
	 * @return Client
	 */
	public Client lireInfoClient(Client client);
	/**méthode pour supprimer un client
	 * @param clientAsupprimer Client que l'on veut supprimer
	 */
	public void supprimerClient(Client clientAsupprimer);
	/**méthode auditer les comptes des clients
	 * @param compteAauditer compte à auditer
	 * @return vrai : compte particulier débiteur de plus de 5000 ou compte entreprise débiteur de plus de 50 000  
	 */
	public boolean auditerCompteClient(Compte compteAauditer);
	

}
