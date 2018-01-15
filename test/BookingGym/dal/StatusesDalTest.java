
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
        System.out.println("TariffDal selectAll");
        StatusesDal dal = new  StatusesDal();
        List<Statuses> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    @Test
    public void testSelectById() {        
        System.out.println("selectById");
        int id = 1;
        StatusesDal T = new StatusesDal();
        Statuses result = T.selectById(id);
        assertTrue(result!=null && result.getS_id_status()==id);
    }


    @Test
    public void testUpdate() {
        System.out.println("update");
        Statuses f = new Statuses(12, true, false, false);
        StatusesDal instance = new StatusesDal();
        int result = instance.update(f);
        assertEquals(1, result);
    }
}
