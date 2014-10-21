package models.entities;

public class Round {
	private int id;
	private int points;
	private String tablero;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getTablero() {
		return tablero;
	}
	public void setTablero(String tablero) {
		this.tablero = tablero;
	}

}
