
public class Spiller {
	
	private String navn;
	private int verdi;
	
	public Spiller(String navn)
	{
		this.navn = navn;
	}
	
	
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
