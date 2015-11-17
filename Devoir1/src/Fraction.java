
public class Fraction extends Number implements Cloneable {

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
	
	public Fraction irreductible()
	{
		int pgcd = pgcd(this.getNumerateur(), this.getDenominateur());
		
		setDenominateur(this.getDenominateur()/pgcd);
		setNumerateur(this.getNumerateur()/pgcd);
		return this;
	}
	 
	private static int  pgcd(int num,int denom )
	{
		if (num > denom) return pgcd (num-denom, num) ;
		else if (num < denom) 
			    return (pgcd (num, denom-num)) ;
		else return num ;
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
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}
