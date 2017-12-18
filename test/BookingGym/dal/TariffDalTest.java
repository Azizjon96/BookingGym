package BookingGym.dal;

import BookingGym.model.Tariff;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alina
 */
public class TariffDalTest {
    
    public TariffDalTest() {
    }

    @Test
    public void testSelectAll() {
        System.out.println("TariffDal selectAll");
       TariffDal dal = new TariffDal ();
        List<Tariff> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 0;
       TariffDal instance = new TariffDal();
        Tariff expResult = null;
       Tariff result = instance.selectById(valueOf(id));
        assertEquals(expResult, result);
        
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Tariff tariff = null;
        TariffDal instance = new TariffDal();
        int expResult = 0;
        int result = instance.insert(tariff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
System.out.println("update");
        Tariff tariff = null;
        TariffDal instance = new TariffDal();
        int expResult = 0;
        int result = instance.update(tariff);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
         System.out.println("delete");
         Tariff  tariff = null;
         TariffDal instance = new  TariffDal();
        int expResult = 0;
        int result = instance.delete(valueOf(tariff));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private String valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String valueOf(Tariff tariff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
