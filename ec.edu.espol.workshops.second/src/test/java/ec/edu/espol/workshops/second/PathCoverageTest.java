package ec.edu.espol.workshops.second;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PathCoverageTest {

	CarInsurance carinsurance= new CarInsurance('M', 18, false);
	  

	   //test to check getPremium
	   @Test
	   public void getPremium() {
	      
		carinsurance.setAge(50);
		carinsurance.setMarital(true);
		carinsurance.setSexo('M');
	      double insurance = carinsurance.getPremium();
	      assertEquals(500, insurance, 0.0);
	   }
}
