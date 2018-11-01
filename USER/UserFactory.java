public class UserFactory {

	public User createUser(String usr){
		if(usr.equals("customer")){
			return new Customer();
		}
		else if(usr.equals("staff")){
			return new Staff();
		}
		else
			return null;
	}
}