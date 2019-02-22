import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Kopp-class
 * 
 * @author Fredrik Fauskanger
 *
 */


public class Kopp {

	private int id, sum;
	private List<Terning> terninger;
	
	/**
	 * 
	 * Kjører en loop for å få to terninger i en arraylist;
	 * 
	 * @param id
	 */
	
	public Kopp(int id) 
	{
		this.id = id;
		
		terninger = new ArrayList<>();
		
		terninger.add(new Terning(0));
		terninger.add(new Terning(1));
		
	}
	
	
	public void trill()
	{
		for(Terning terninger : terninger)
		{
			terninger.trill();
		}
		sum  = terninger.get(0).getVerdi() + terninger.get(1).getVerdi();
		
	}
	
	
	public int getSum()
	{
		return this.sum;
	}
	
}
