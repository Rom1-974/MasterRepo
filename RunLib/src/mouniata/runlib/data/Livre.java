package mouniata.runlib.data;

import java.util.Date;

public class Livre {

	public String titre;

	public int edition_id;

	public Date date_parution;

	public int theme_id;

	public int auteur_id;
	
	public int format_id;

	public Livre(String titre, int edition, Date date_parution, int theme,
			int format) {
		super();
		this.titre = titre;
		this.edition_id = edition;
		this.date_parution = date_parution;
		this.theme_id = theme;
		this.format_id = format;
	}

	public Date getDate_parution() {
		return date_parution;
	}

	public int getEdition() {
		return edition_id;
	}

	public int getFormat() {
		return format_id;
	}

	public int getTheme() {
		return theme_id;
	}

	public String getTitre() {
		return titre;
	}

	public void setDate_parution(Date date_parution) {
		this.date_parution = date_parution;
	}

	public void setEdition(int edition) {
		this.edition_id = edition;
	}

	public void setFormat(int format) {
		this.format_id = format;
	}

	public void setTheme(int theme) {
		this.theme_id = theme;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
}
