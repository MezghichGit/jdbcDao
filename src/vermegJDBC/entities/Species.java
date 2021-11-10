package vermegJDBC.entities;

public class Species {
	private int id;
	private String nom;

	public Species(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Species(String nom) {

		this.nom = nom;
	}
	
	public Species() {
	}

	@Override
	public String toString() {
		return "Species [id=" + id + ", nom=" + nom + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
