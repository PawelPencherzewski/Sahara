import java.io.*;
import java.util.*;

public class Staff implements User {
												// Staff
	@Override	
	public void register(String username) {
		System.out.println("Inside staff::register() method");
		try{
		String usernameFile = "usernames.txt";
		FileWriter fw = new FileWriter(usernameFile, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(username);
		pw.close();
		fw.close();
		}
		catch(IOException e) {}
	}
	
	@Override
	public void login(String u) {
		System.out.println("Inside staff::login() method");
	}
}