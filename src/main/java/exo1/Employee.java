package exo1;
/**
 * la class employee permet de crée et récupré les différents information sur les employer
 * @author eloil
 *
 */
public class Employee {

private String nom;
private String prenom;
private int experience;
private String niveau;
	/**
	 * constructeur de la class employee
	 * @param nom_employee nom
	 * @param prenom_employee
	 * @param experience_employee
	 * @param niveau_employee
	 */
	public Employee(String nom_employee,String prenom_employee,int experience_employee,String niveau_employee) {
		this.nom = nom_employee;
		this.prenom = prenom_employee;
		this.experience = experience_employee;
		this.niveau = niveau_employee;
	}
	/**
 	* permet de récupére le nom de l'employee
 	* @return nom
 	*/
	public String getNom() {
		return nom;
	}
	/**
	 * permet de modifier le nom d'un employee
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * permet de récupére le prenom de l'employee
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * permet de modifier le prenom d'un employee
	 * @param pernom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * permet de récupére l'experience de l'employee
	 * @return experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * permet de modifier l'experience d'un employee
	 * @param experience
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * permet de récupére le niveau de l'employee
	 * @return niveau
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * permet de modifier le niveau d'un employee
	 * @param niveau
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
}
