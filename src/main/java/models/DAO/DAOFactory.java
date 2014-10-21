package models.DAO;

public abstract class DAOFactory {
	public abstract <T, ID> RoundDAO<T, ID> getRoundDAO();
	public abstract <T, ID> UserDAO<T, ID> getUserDAO();
}
