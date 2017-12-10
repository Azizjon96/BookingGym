
package BookingGym.controllers;


import BookingGym.dal.ReservationDal;
import BookingGym.model.Reservation;
import java.util.List;

public class ReservationController {
    protected ReservationDal reservationDal;
    public ReservationController() {
        reservationDal= new ReservationDal();
    }
    
    public List<Reservation> getAllReservations()
    {
        return reservationDal.selectAll();
    }
    
    public Reservation getReservationById(int id)
    {
        return reservationDal.selectById(id);
    }
    
    public int insertReservation(Reservation reservation)
    {
        return reservationDal.insert(reservation);
    }
    
     public int updateReservation(Reservation reservation)
    {
        return reservationDal.update(reservation);
    }
}
