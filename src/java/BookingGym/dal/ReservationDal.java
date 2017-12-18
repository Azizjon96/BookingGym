package BookingGym.dal;
import BookingGym.model.Clients;
import BookingGym.model.Reservation;
import java.util.List;
import org.apache.ibatis.session.SqlSession;


public class ReservationDal extends BaseDal {
    
    public ReservationDal() {
        super();
    }

    public List<Reservation> selectAll() {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Reservation> list = session.selectList("reservation.selectAll");
      session.close();
      return list;
    }

    public Reservation selectById(String id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Reservation reservation = session.selectOne("reservation.selectById",id);
      session.close();
      return reservation;
    }
    
    public List<Reservation> selectReservationClient(String id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Reservation> reservation = session.selectOne("reservation.selectReservationClient",id);
      session.close();
      return reservation;
    }

    public int insert(Reservation reservation) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("reservation.insert",reservation);
      session.commit();
      session.close();
      return count;
    }

    public int update(Reservation reservation) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("reservation.update",reservation);
      session.commit();
      session.close();
      return count;
    }
    
    public int delete(Reservation reservation)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("reservation.delete",reservation);
      session.commit();
      session.close();
      return count;
    }   
}
