package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {

		this.nom = nom;

		this.effetPotionMin = effetPotionMin;

		this.effetPotionMax = effetPotionMax;

		parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {

		return nom;
	}

	public void parler(String texte) {

		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {

		return "Le druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix") {
			parler("Pas pour toi Obelix");
			
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
		
		
	}

	public void preparerPotion() {
		Random random = new Random();
		parler("je vais faire une petite potion");
		int forcePotion = random.nextInt(effetPotionMax - effetPotionMin+1) + effetPotionMin;
		if (forcePotion > 7) {
			parler("Téma le flash !");
		} else {
			parler("Dégouté wallah");
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}

}
