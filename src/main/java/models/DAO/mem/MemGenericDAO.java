package models.DAO.mem;

import java.util.HashMap;
import java.util.Map;

import models.DAO.GenericDAO;

public class MemGenericDAO<T, ID> implements GenericDAO<T, ID>{
	Map<ID, T> entities = new HashMap<ID, T>();
	
	@Override
	public void create(T entity) {
		this.entities.put(this.getId(entity), entity);
	}

	private ID getId(T entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public T read(ID id) {
		return this.entities.get(id);
	}

	@Override
	public void update(T entity) {
		this.entities.put(this.getId(entity), entity);
		
	}

	@Override
	public void delete(T entity) {
		this.entities.remove(this.getId(entity));
		
	}

}
