package Concrete;

import Abstract.PlayerCheckService;

public class PlayerCheckManager implements PlayerCheckService {
	
	private String firstName = "Berk";
	private String lastName = "Ozmenekse";
	private String nationalityIdendity = "123456789";
	private String birthDate = "16.05.1990";
	
	
	@Override
	public boolean isRealPerson(String firstName, String lastName, String nationalityIdendity, String birthDate) {
		if(this.firstName==firstName && (this.lastName==lastName) && (this.nationalityIdendity==nationalityIdendity) && (this.birthDate==birthDate)) {
			return true;
		}
		
		
		return false;
	}

}
