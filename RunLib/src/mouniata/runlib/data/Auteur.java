package mouniata.runlib.data;

public class Auteur {

	public String nom;
	
	public String prénom;

	public Auteur(String nom, String prénom) {
		super();
		this.nom = nom;
		this.prénom = prénom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	
}
