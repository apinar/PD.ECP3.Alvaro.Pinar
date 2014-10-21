package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements RoundDAO{

	
	private Integer getId(Round entity) {
		return entity.getId();
	}

}
