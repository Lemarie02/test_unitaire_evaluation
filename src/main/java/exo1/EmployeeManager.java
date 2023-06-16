package exo1;

/**
 * class qui permet la gestion de différent calcul en rapport au employé
 * @author eloil
 *
 */
public class EmployeeManager {
private Employee employee;
/**
 * constructeur de la classe employe
 * @param employee_standar
 */
	public EmployeeManager(Employee employee_standar) {
		this.employee = employee_standar;
	}
	/**
	 * donne le salaire des employé en fonciton de le niveaux
	 * @param employee
	 * @return le salaire qui doit être obtenus
	 */
	public int calculateSalary(Employee employee) {
		int salarie = 0;
		int pourcentage= 0;
		int coef = 0;
		switch (employee.getNiveau()){
		case "Junior":
			salarie = 20000;
			coef = calculateExperienceMultiplier(employee.getExperience());
			for(int i=0;i<coef;i++) {
				pourcentage = (int) (salarie*0.05);
				salarie = salarie + pourcentage;
			}
		break;
		case "Intermédiaire":
			salarie = 40000;
			 coef = calculateExperienceMultiplier(employee.getExperience());
			for(int i=0;i<coef;i++) {
				pourcentage = (int) (salarie*0.05);
				salarie = salarie + pourcentage;
			}
		break;
		case "Sénior":
			salarie = 60000;
			coef = calculateExperienceMultiplier(employee.getExperience());
			for(int i=0;i<coef;i++) {
				pourcentage = (int) (salarie*0.05);
				salarie = salarie + pourcentage;
			}
		break;
		default:
			throw new IllegalArgumentException("niveaux invalide");	
		}
		return salarie;
	}
	/**
	 * méthode utiliser pour déterminier le coefficent d'anciennté en fonction du nombre d'anné
	 * @param anneesExperience
	 * @return le coefficient d'ancienneté
	 */
	public int calculateExperienceMultiplier(int anneesExperience) {
		int nb_coef_ancien=0;
		for(int i = 0; i < anneesExperience; i++) {
			nb_coef_ancien = nb_coef_ancien + 1;
		}
		return nb_coef_ancien;
	}
	
}
