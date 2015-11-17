
public class Fraction implements Cloneable {
	/******/
	private int numerateur;
	private int denominateur;

   private int getDenominateur() {
		return denominateur;
	}
	private void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}
	private int getNumerateur() {
		return numerateur;
	}
	private void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	
	public Fraction(int numerateur,int denominateur)
	{
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	
	public Fraction mutliplication(Fraction fraction) throws FractionException
	{
		int nume =0;
		int denomina=0;
		try
		{
			nume = this.numerateur * fraction.getNumerateur();
			denomina = this.getDenominateur() * fraction.getDenominateur(); 
		}
		catch(Exception ex)
		{
			throw new FractionException(ex.getMessage());
		}
		
		return new Fraction(nume,denomina);
	}
	public Fraction addition(Fraction fraction) throws FractionException
	{
		int nume =0;
		int denomina=0;
		try
		{
			nume = ((this.numerateur * fraction.getDenominateur())+fraction.getNumerateur()* this.getDenominateur());
			denomina = this.getDenominateur() * fraction.getDenominateur(); 
		}
		catch(Exception ex)
		{
			throw new FractionException(ex.getMessage());
		}
		
		return new Fraction(nume,denomina);
	}
	
	public String toString()
	{
		
		return this.getNumerateur() +"/" + this.getDenominateur();
		
	}
	public boolean equals(Object o)
	{
	   if(o instanceof Fraction)
		    if(this.numerateur == ((Fraction)o).numerateur)
		    	if(this.denominateur == ((Fraction)o).denominateur)
		    		    return true;
	   
	   return false;
	}
	public Object clone()
	{
		return new Fraction(this.numerateur,this.denominateur);
	   
	}
}
