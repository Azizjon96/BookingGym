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
public class StatusesTest {
    
    public StatusesTest() {
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
    public void testCreateStatuses() {
       System.out.println("test create Statuses");
       Statuses statuses = new Statuses(1, true, false, true);
               
        
       assertEquals(statuses.getS_id_status(), 1);
       assertEquals(statuses.isS_processing(), true);
       assertEquals(statuses.isS_approved(), false);
       assertEquals(statuses.isS_failure(), true);
       
    }
    
    @Test
    public void testEquals() {
        System.out.println("test equals Statuses");
       
         Statuses statuses1 = new Statuses(1, true, false, true);
         Statuses statuses2 = new Statuses(1, true, false, true);
         Statuses statuses3 = new Statuses(3, false, false, true);
    
         assertTrue(statuses1.equals(statuses2));
         assertFalse(statuses1.equals(statuses3));
    }
    
    }
