import java.io.*;
import java.util.*;

public class ScanForExistingUser {
													// Scans database for already exising username.
	public static boolean scan(String user) {
		
		ArrayList<String> usernamelist = new ArrayList<String>();
		try{
			// read in the list of usernames
			String usernameFile = "usernames.txt";
			String line = null;
			FileReader fr = new FileReader (usernameFile);
			BufferedReader br = new BufferedReader (fr);
			while((line = br.readLine()) != null){
				usernamelist.add(line);
			}
			br.close();
			fr.close();
		}
		catch(FileNotFoundException e) { }
		catch(IOException a) { }
		
		boolean found = false;
		for(int i = 0; i < usernamelist.size() && found == false; i++)
		{
			if(user.equals(usernamelist.get(i))) {
				found = true;
			}
		}
		
		return found;
	}
}