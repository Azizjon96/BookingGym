package BookingGym.dal;
import BookingGym.model.Tariff;
import java.util.Date;
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
        int id = 1;
        TariffDal Tariff = new TariffDal();
        Tariff result = Tariff.selectById(id);
        assertTrue(result!=null && result.getT_id_tariff()==id);
        
    }

    @Test
    public void testInsert() {
        Tariff Tariff = new Tariff(100, "5", "1", "1", "III");
        TariffDal i = new TariffDal();
        int result = i.update(Tariff);
        assertEquals(0, result);


    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Date date = new Date(2017, 7, 15);
        Tariff Tariff = new Tariff(100, "5", "1", "1", "III");
        TariffDal instance = new TariffDal();
        int result = instance.update(Tariff);
        assertEquals(0, result);
    }

    @Test
    public void testDelete() {
         System.out.println("delete");
        int id = 100;
        TariffDal instance = new TariffDal();
        int result = instance.delete(id);
        assertEquals(0, result);
    }

    private int valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
