
package BookingGym.dal;

import java.util.List;
import BookingGym.model.Clients;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alina
 */
public class ClientsDalTest {
    
    public ClientsDalTest() {
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Clients clients = null;
        ClientsDal instance = new ClientsDal();
        int expResult = 0;
        int result = instance.update(clients);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
           System.out.println("insert");
        Clients clients = null;
        ClientsDal instance = new ClientsDal();
        int expResult = 0;
        int result = instance.insert(clients);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
   
     System.out.println("delete");
         Clients  clients = null;
         ClientsDal instance = new  ClientsDal();
        int expResult = 0;
        int result = instance.delete(valueOf(clients));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 0;
       ClientsDal instance = new ClientsDal();
        Clients expResult = null;
        Clients result = instance.selectById(valueOf(id));
        assertEquals(expResult, result);
        // TODO review the generated test code 
    }

    @Test
    public void testSelectByPhone() {
           System.out.println("SelectByPhone");
        int phone = 0;
       ClientsDal instance = new ClientsDal();
        Clients expResult = null;
        Clients result = instance.selectByPhone(valueOf(phone));
        assertEquals(expResult, result);
     
    }

    @Test
    public void testSelectAll() {
        System.out.println("ClientsDal selectAll");
        ClientsDal dal = new ClientsDal ();
        List<Clients> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    private String valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String valueOf(Clients clients) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
