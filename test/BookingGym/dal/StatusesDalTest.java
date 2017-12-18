
package BookingGym.dal;

import BookingGym.model.Statuses;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alina
 */
public class StatusesDalTest {

 
    
    public StatusesDalTest() {
    }

    @Test
    public void testSelectAll() {
         System.out.println("StatusesDal selectAll");
       StatusesDal dal = new StatusesDal ();
        List<Statuses> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    @Test
    public void testSelectById() {
        
 System.out.println("selectById");
        int id = 0;
       StatusesDal instance = new StatusesDal();
        Statuses expResult = null;
       Statuses result = instance.selectById(valueOf(id));
        assertEquals(expResult, result);
    }

    @Test
    public void testInsert() {
          System.out.println("insert");
        Statuses statuses = null;
       StatusesDal instance = new StatusesDal();
        int expResult = 0;
        int result = instance.insert(statuses);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
System.out.println("update");
        Statuses statuses = null;
        StatusesDal instance = new StatusesDal();
        int expResult = 0;
        int result = instance.update(statuses);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
System.out.println("delete");
          Statuses   statuses = null;
          StatusesDal instance = new   StatusesDal();
        int expResult = 0;
        int result = instance.delete( statuses);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private String valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
