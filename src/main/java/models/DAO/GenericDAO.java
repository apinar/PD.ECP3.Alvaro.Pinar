package models.DAO;

public abstract class GenericDAO<T,ID> {
	public abstract void create (T entity);
	public abstract T read(ID id);
	public abstract void update();
	public abstract void delete();		
}
