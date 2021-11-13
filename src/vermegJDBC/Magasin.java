package vermegJDBC;

public class Magasin implements AutoCloseable{
	
	public Magasin() {
		System.out.println("Création d'un magasin");
	}

	public void Produits() throws Exception{
		System.out.println("Liste des produits");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Fermeture du magasin");
	}

}
