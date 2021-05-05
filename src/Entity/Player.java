package Entity;

import Abstract.Entity;

public class Player implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityIdentity;
	private String birthDate;
	
	public Player() {
		super();
	}
	
	
	public Player(int id, String firstName, String lastName, String nationalityIdentity, String birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
		this.birthDate = birthDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityIdentity() {
		return nationalityIdentity;
	}


	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
}
