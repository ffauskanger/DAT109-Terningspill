import java.util.Random;

public class Terning {
	
	
	private int id, verdi;
	Random rand = new Random();
	
	public Terning(int id)
	{
		this.id = id;
		this.verdi = 0;
	}

	
	public int getVerdi()
	{
		return this.verdi;
	}
	
	public void setVerdi(int verdi)
	{
		this.verdi = verdi;
	}
	
	public void trill()
	{
		this.verdi = rand.nextInt(6) + 1;
	}
}
