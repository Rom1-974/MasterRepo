package mouniata.runlib.data;

public class Auteur {

	public String nom;
	
	public String pr�nom;

	public Auteur(String nom, String pr�nom) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}
	
}
