package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.Round;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements UserDAO{

	
	private Integer getId(Round entity) {
		return entity.getId();
	}

}
