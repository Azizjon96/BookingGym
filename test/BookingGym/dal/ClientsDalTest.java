
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
        Clients clients = new Clients(12, "5", "1", "1", "III");
        ClientsDal instance = new ClientsDal();
        int result = instance.update(clients);
        assertEquals(1, result);
    }


    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 19;
        ClientsDal c = new ClientsDal();
        Clients result = c.selectById(id);
        assertTrue(result!=null && result.getC_id_client()==id);
    }

    @Test
    public void testSelectByPhone() {
           System.out.println("SelectByPhone");
        String phone = "III";
        ClientsDal c = new ClientsDal();
        Clients result = c.selectByPhone(phone);
        String num = result.getC_phone();
        assertTrue(num.equals(phone));
     
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        ClientsDal dal = new ClientsDal ();
        List<Clients> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    private int valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
