package service;

import domaine.Client;
import domaine.Compte;

public interface I_systemInformation {
	
	/**methode de cr�ation de client
	 * @param clientAcreer Client a cr�er
	 * @return client cr��
	 */
	public Client creerClient(Client clientAcreer);
	/**m�thode pour modifier le client
	 * @param clientAmodifier Client � modifier
	 * @return client modif�
	 */
	public Client modifierClient(Client clientAmodifier);
	/**m�thode pour acc�der aux informations du client
	 * @param client Client dont on veut les informations
	 * @return Client
	 */
	public Client lireInfoClient(Client client);
	/**m�thode pour supprimer un client
	 * @param clientAsupprimer Client que l'on veut supprimer
	 */
	public void supprimerClient(Client clientAsupprimer);
	/**m�thode auditer les comptes des clients
	 * @param compteAauditer compte � auditer
	 * @return vrai : compte particulier d�biteur de plus de 5000 ou compte entreprise d�biteur de plus de 50 000  
	 */
	public boolean auditerCompteClient(Compte compteAauditer);
	

}
