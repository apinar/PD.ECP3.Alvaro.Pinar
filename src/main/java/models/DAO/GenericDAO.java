package models.DAO;

public abstract interface GenericDAO<T,ID> {
	public abstract void create (T entity);
	public abstract T read(ID id);
	public abstract void update(T entity);
	public abstract void delete(T entity);		
}
