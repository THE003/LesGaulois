package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Romain minus =new Romain ("minus",6);
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("par Bélénos c'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Ouai ça vient d'ou ?");
		minus.parler("Boissy y a quoi ?");
		
		do {
			asterix.frapper(minus);
		} while (minus.getForce()>0);
			
		
	}

}
