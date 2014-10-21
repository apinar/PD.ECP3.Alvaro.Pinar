package models.DAO;

public abstract class GenericDAO<T,ID> {
	public abstract void create ();
	public abstract T read();
	public abstract void update();
	public abstract void delete(); 
}
