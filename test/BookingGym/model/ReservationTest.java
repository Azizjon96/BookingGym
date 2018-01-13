/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingGym.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ReservationTest {
    
    public ReservationTest() {
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
    public void testCreateReservation() {
       System.out.println("test create Reservation");
       Date date = new Date(2017,9,25);
       Reservation reservation = new Reservation(1, 1, "hall2", date, date,1,1);
        
       assertEquals(reservation.getR_id_reservation(), 1);
       assertEquals(reservation.getR_id_client(), 1);
       assertEquals(reservation.getR_hall(), "hall2");
       assertEquals(reservation.getR_begin_visits(), date);
       assertEquals(reservation.getR_end_visits(), date);
       assertEquals(reservation.getR_id_tariff(), 1);
       assertEquals(reservation.getR_id_status(), 1);
    }
    
     @Test
    public void testEquals() {
        System.out.println("test equals Reservation");
       
         Reservation reservation1 = new Reservation(1, 1, "hall2", new Date(2017,9,25), new Date(2017,11,25),1,1);
         Reservation reservation2 = new Reservation(1, 1, "hall2", new Date(2017,9,25), new Date(2017,11,25),1,1);
         Reservation reservation3 = new Reservation(2, 2, "hall3", new Date(2017,9,25), new Date(2017,11,20),2,0);
    
         assertTrue(reservation1.equals(reservation2));
         assertFalse(reservation1.equals(reservation3));
    }
    
   }
    
    

