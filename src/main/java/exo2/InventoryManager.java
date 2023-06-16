package exo2;
import java.util.HashMap;

public class InventoryManager {
/**
 * constructeur qui permet de crée un hashmap entre deux entité 
 * @param arg
 */
	public InventoryManager(String[] arg) {
	
	}
	public void addInventory(String produit,String qte) {
		HashMap<String, String> inventory = new HashMap<String, String>();
		inventory.put(produit,qte);
	}
	
	public void removeInventory(String produit,String qte) {
		HashMap<String, String> inventory = new HashMap<String, String>();
		inventory.remove(produit);
	}
	
}
