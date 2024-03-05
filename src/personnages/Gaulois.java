package personnages;

public class Gaulois {
	public String nom;
	public int force;
	public int effetpotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " :";
	}
	
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	         + romain.getNom()); 
		romain.recevoirCoup (force / 3); 
	}
	
   public void boirePotion(int forcePotion) {
	   effetpotion = forcePotion;
	   parler("Merci Druide, je sens que ma force est "+forcePotion+" fois décuplée");
		
	
		
	}

	@Override
    public String toString() {
       return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" 
            + effetpotion + "]";
       
       
    }
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Druide panoramix = new Druide("Panoramix",5,10);
		int forcePotion = panoramix.preparerPotion();
//	System.out.println(asterix.toString()); ca n'affiche pas le nom du nouveau gaulois !!
		System.out.println(asterix);
		asterix.parler("Bonjour !");
		asterix.frapper(minus);
		asterix.boirePotion(forcePotion);
	}

	

	
		
  

}
