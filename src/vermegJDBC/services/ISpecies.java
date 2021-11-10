package vermegJDBC.services;

import vermegJDBC.entities.Species;

public interface ISpecies {

	public int addSpecies(Species obj);
	public int updateSpecies(Species obj);
	public int deleteSpecies(Species obj);
	public void listSpecies();
}
