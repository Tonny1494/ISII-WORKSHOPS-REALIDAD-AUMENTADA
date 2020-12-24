package ec.edu.espol.workshops.second;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BranchCoverageTest {
	   CarInsurance carinsurance= new CarInsurance('M', 18, false);
	  

	   //test to check getPremium
	   @Test
	   public void getPremium() {
	      
		carinsurance.setAge(25);
		carinsurance.setMarital(false);
		carinsurance.setSexo('F');
	      double insurance = carinsurance.getPremium();
	      assertEquals(400, insurance, 0.0);
	   }

	   
	}