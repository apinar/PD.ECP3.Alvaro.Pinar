package models.DAO;

public abstract class DAOFactory {
	public abstract RoundDAO getRoundDAO();
	public abstract UserDAO getUserDAO();
}
