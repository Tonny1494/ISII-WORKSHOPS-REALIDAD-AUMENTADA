package ec.edu.espol.workshops.second;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
   CarInsurance carinsurance= new CarInsurance('M', 18, false);
  

   //test to check getPremium
   @Test
   public void getPremium() {
      
	carinsurance.setAge(25);
	carinsurance.setMarital(false);
	carinsurance.setSexo('M');
      double insurance = carinsurance.getPremium();
      assertEquals(2100, insurance, 0.0);
   }

}