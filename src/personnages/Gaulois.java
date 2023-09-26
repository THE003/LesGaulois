package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " met le coup franc de l'année  à " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("merci le sang ty est un bon ! Ma force est multipliée pas " + effetPotion);
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		//System.out.println(asterix.getNom());
		//System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Ouai ça vient d'ou ?");
		Romain minus =new Romain ("minus",10);
		asterix.frapper(minus);
		asterix.boirePotion(3);
		
	}

	}
