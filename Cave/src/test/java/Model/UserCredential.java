package Model;

import Commons.UserType;

public class UserCredential {
	
	public String UserName;
	public String Password;
	
	public UserCredential(UserType userType) {
	switch(userType)
	{
	case User1:
		UserName = "mail.golam@gmail.com";
		Password = "Golam9856";
		break;
		
	case User2:
		
		UserName = "gmohiuddin@bellsouth.net";
		Password = "gm2255";
		break;
		}	
	}
}
