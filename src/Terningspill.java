
import java.util.*;


/**
 * Terningspill - class
 * 
 * @author Fredrik
 *
 */

public class Terningspill {
	
	
	private int id;
	private List<Spiller> spillere = new ArrayList<>();
	private Kopp kopp;
	
	
	public Terningspill(int id)
	{
		this.id = id;
		kopp = new Kopp(id);
	}
	
	/**
	 * Legger til spillere
	 * 
	 * @param navn
	 */
	
	public void leggTilSpiller(String navn)
	{
		spillere.add(new Spiller(navn));
	}
	
	/**
	 * Spiller med de spillerene som er opprettet
	 * 
	 */
	
	public void spill()
	{
		for(Spiller spiller : spillere)
		{
			spiller.spill(kopp);
		}
	}

	/**
	 * 
	 * Henter vinner ved hjelp av å gå igjennom listen av spillere og sammenligne verdier.
	 * 
	 */
	public void getVinner()
	{
		Spiller vinner = null;
		int vinnerVerdi = 0;
		for(Spiller spiller : spillere)
		{
			if(spiller.getVerdi() > vinnerVerdi)
			{
				vinner = spiller;
				vinnerVerdi = vinner.getVerdi();
			}
				
		}
		
		System.out.println(vinner.getNavn() + " vant med summen: " + vinner.getVerdi());
	}
	

}
