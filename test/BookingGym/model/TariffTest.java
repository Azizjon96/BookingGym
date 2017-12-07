package BookingGym.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Azizjon
 */
public class TariffTest {
    
    public TariffTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
     @Test
    public void testCreateTariff() {
       System.out.println("test create");
       Tariff tariff = new Tariff(1, "1000", "23112017", "112217","full");
        
       assertEquals(tariff.getT_id_tariff(), 1);
       assertEquals(tariff.getR_cost(), "1000");
       assertEquals(tariff.getT_number_visits(), "23112017");
       assertEquals(tariff.getT_number_days(), "112217");
       assertEquals(tariff.getT_name(), "full");
              
    }
   
    
    @Test
    public void testEquals() {
        System.out.println("test equals Tariff");
       
         Tariff tariff1 = new Tariff(1, "1000", "22102017", "1232123","full");
         Tariff tariff2 = new Tariff(2, "1000", "22102017", "1232123","full");
         Tariff tariff3 = new Tariff(3, "1500", "25102017", "1232123","full");
    
         assertTrue(tariff1.equals(tariff2));
         assertFalse(tariff1.equals(tariff3));
    }
       
    
}
