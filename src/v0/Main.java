package v0;

/***********************************************************
 * Filename: Main.java
 * @author fba 6 de Mai de 2013
 ***********************************************************/
public abstract class Main
{

	/***********************************************************
	 * @param args
	 ***********************************************************/
	public static void main(String[] args)
	{
		Customer who = new Customer("Barack Obama");
		Movie m1 = new Movie("Life of Amalia", new RegularPrice(true));
		Movie m2 = new Movie("Peter Pan", new ChildrensPrice(false));
		Movie m3 = new Movie("Donna del Lago", new NewReleasePrice(true));

		who.addRental(new Rental(m1, 1));
		who.addRental(new Rental(m2, 2));
		who.addRental(new Rental(m3, 3));
		
		System.out.println(who.statement());
	}

}
