package Project1;

public class User {
	
	private String name;
	private String surname;
	private int winCount;
	private int loseCount;
	
	public User(String name,String surname) {
		this.name=name;
		this.surname=surname;
		winCount=0;
		loseCount=0;
	}
	
	public void increaseWinCount() {
		winCount++;
	}
	public void increaseLoseCount() {
		loseCount++;
	}
}
