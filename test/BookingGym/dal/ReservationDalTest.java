/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingGym.dal;
import BookingGym.model.Reservation;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReservationDalTest {
    
    public ReservationDalTest() {
    }

    @Test
    public void testSelectAll() {
        ReservationDal Reservation = new ReservationDal();
        List<Reservation> result = Reservation.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    @Test
    public void testSelectById() {
        int id = 1;
        ReservationDal Reservation = new ReservationDal();
        Reservation result = Reservation.selectById(id);
        assertTrue(result!=null && result.getR_id_reservation()==id);
    }
        
    @Test
    public void testSelectReservationClient() {
        ReservationDal Reservation = new ReservationDal();
        Reservation result = Reservation.selectById(1);
        assertTrue(result!=null && result.getR_id_reservation()==1);
    }

    @Test
    public void testInsert() {
        Date date = new Date(2017, 7, 15);
        Reservation Reservation = new Reservation(100, 5, "1", date, date, 1, 1);
        ReservationDal i = new ReservationDal();
        int result = i.update(Reservation);
        assertEquals(0, result);
    }

    @Test
    public void testUpdate() {        
        Date date = new Date(2017, 7, 15);
        Reservation appointment = new Reservation(100, 5, "1", date, date, 1, 1);
        ReservationDal instance = new ReservationDal();
        int result = instance.update(appointment);
        assertEquals(0, result);
    }

    @Test
    public void testDelete() {
        int id = 100;
        ReservationDal instance = new ReservationDal();
        int result = instance.delete(id);
        assertEquals(0, result);
    }
    
}
