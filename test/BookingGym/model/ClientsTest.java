package BookingGym.model;

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
public class ClientsTest {
    
    public ClientsTest() {
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
        public void testCreteClient() {
        System.out.println("Test create Clients");

        Clients client = new Clients(1,"Familiya","Imya","Ochestvo","89230377777");
        assertEquals(client.getC_id_client(), 1);
        assertEquals(client.getC_surname(), "Familiya");
        assertEquals(client.getC_name(), "Imya");
         assertEquals(client.getC_lastname(), "Ochestvo");
        assertEquals(client.getC_phone(), "89230377777");
        
        client.setC_id_client(2);
        assertEquals(client.getC_id_client(), 2);
        
        client.setC_surname("Familiya2");
        assertEquals(client.getC_surname(), "Familiya2");
        
        client.setC_name("Imya2");
        assertEquals(client.getC_name(), "Imya2");
        
        client.setC_lastname("Ochestvo2");
        assertEquals(client.getC_lastname(), "Ochestvo2");
        
        client.setC_phone("79220122222");
        assertEquals(client.getC_phone(), "79220122222");
        
    }
        @Test
        public void testEquals() {
        System.out.println("equals");
         Clients client1 = new Clients(1,"Familiya1","Imya1","Ochestvo","89230377777");
         Clients client2 = new Clients(1,"Familiya1","Imya1","Ochestvo","89230377777");
         Clients client3 = new Clients(2,"Familiya1","Imya1","Ochestvo","89230377777");

         assertTrue(client1.equals(client2));
         assertFalse(client1.equals(client3));
         
         
         Clients client4 = new Clients(1,"Familiya4","Imya4","Ochestvo4","89230344444");
         Clients client5 = new Clients(1,"Familiya5","Imya5","Ochestvo5","89230355555");
         
         assertFalse(client1.equals(client4));
         assertFalse(client1.equals(client5));
    }
        
}
