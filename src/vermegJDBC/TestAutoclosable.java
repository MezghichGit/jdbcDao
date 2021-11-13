package vermegJDBC;

public class TestAutoclosable {

	public static void main(String[] args) throws Exception {
		//Magasin m = new Magasin();
		
		// Version 1 : Classique
		/*
		try {
			
			m.Produits();
		}
		catch(Exception e)
		{
			
		}
		finally {
			m.close();
		}
		 */
		
		try(Magasin m = new Magasin())
		{
			m.Produits();
		}
	}

}
