package application;

public class Admin {

	private String username;
	private String password;
	
	Admin()
	{
		username="";
		password="";
	}
	Admin(String a,String b)
	{
		username=a;
		password=b;
	}	
	public void InitializeAdmin(String a,String b)
	{
		username=a;
		password=b;	
	}
	public void setusername(String a)
	{
		username=a;
	}
	public void setpassword(String a)
	{
		password=a;
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}	
	public void AddMovieSchedule(int a,String b,String c,String d,String e,String f)
	{
		Movie m1;
		m1=new Movie();
		m1.AddMovie(a,b,c,d,e,f);
		System.out.println("Added Movie");
	}
	public void EditMovieDetails(String old,String newdata)
	{
		Movie m1;
		m1=new Movie();
		m1.EditMovie(old, newdata);
		System.out.println("Edited Movie");
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		Admin a1;
		a1=new Admin();
		//a1.EditMovieDetails("0.0","7.5");
		//a1.AddMovieSchedule(06,"galwakdi","0.0","07-01-2022","02 hr 10min","drama");	
	}
	
}