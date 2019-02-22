
/**
 * TerningspillApp - class
 * 
 * @author Fredrik
 *
 */

public class TerningspillApp {

	/**
	 * Lager spillet, brukere, spiller spillet og skriver ut vinner.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Terningspill lagSpill = new Terningspill(0);
		lagSpill.leggTilSpiller("Jonas");
		lagSpill.leggTilSpiller("Kristian");
		lagSpill.leggTilSpiller("Per");
		lagSpill.spill();
		lagSpill.getVinner();
	}

}
