package main;

public class User
{
	private String UserNameL = "krishna";
	private String PassWordL = "1234";
	private String UserNameS = "";
	private String PassWordS="";
	String getterUL()
	{
		return UserNameL;
	}
	void SetterPL(String a)
	{
		this.PassWordL=a;
	}
	String getterPL()
	{
		return PassWordL;
	}
	void SetterUS(String a)
	{
		this.UserNameS=a;
	}
	String getterUS()
	{
		return UserNameS;
	}
	void SetterPS(String a)
	{
		this.PassWordS=a;
	}
	String getterPS()
	{
		return PassWordS;
	}
	
}
