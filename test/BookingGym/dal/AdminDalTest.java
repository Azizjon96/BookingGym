
package BookingGym.dal;

import java.util.List;
import BookingGym.model.Admin;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdminDalTest {
    
    public AdminDalTest() {
    }  
    @Test
    public void testInsert() {
        Admin ad = new Admin(3, "1", "1");
        AdminDal i = new AdminDal();
        int result = i.insert(ad);
        assertEquals(1, result);
    }
    
    @Test
    public void testDelete() {
        System.out.println("del");
        int id = 3;
        AdminDal instance = new AdminDal();
        int result = instance.delete(id);
        assertEquals(1, result);
    }
    @Test
    public void testUpdate() {
        System.out.println("update");
        Admin ad = new Admin(3, "1", "1");
        AdminDal instance = new AdminDal();
        int result = instance.update(ad);
        assertEquals(1, result);
    }


    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 3;
        AdminDal c = new AdminDal();
        Admin result = c.selectById(id);
        assertTrue(result!=null && result.getA_id()==id);
    }


    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        AdminDal dal = new AdminDal ();
        List<Admin> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    private int valueOf(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
