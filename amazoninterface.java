package Abstract;


interface kalyani
{
	 void login();
	 void logout();
}



public class amazoninterface implements kalyani
{
public static void main(String[] args)
{
	amazoninterface c1= new amazoninterface();
	c1.login();
	c1.logout();
	
}


public void login() 
{
	System.out.println("log-in to");
	
}


public void logout() 
{
	System.out.println("log-out to");
}
}
