
/**
 * 
 * Spiller - class
 * 
 * @author Fredrik
 *
 */

public class Spiller {
	
	private String navn;
	private int verdi;
	
	public Spiller(String navn)
	{
		this.navn = navn;
	}
	
	/**
	 * Triller koppen og lagrer verdien til spilleren.
	 * 
	 * @param kopp
	 */
	
	public void spill(Kopp kopp)
	{
		kopp.trill();
		verdi = kopp.getSum();
	}
	
	public void setVerdi(int verdi)
	{
		this.verdi = verdi;
	}
	
	public int getVerdi()
	{
		return this.verdi;
	}
	
	
	public String getNavn()
	{
		return navn;
	}


}
