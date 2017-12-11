package BookingGym.dal;
import BookingGym.model.Clients;
import BookingGym.model.Statuses;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class StatusesDal extends BaseDal
{
    
    public StatusesDal() {
        super();
    }

    public List<Statuses> selectAll() {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Statuses> list = session.selectList("statuses.selectAll");
      session.close();
      return list;    
    }

    public Statuses selectById(String id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Statuses statuses= session.selectOne("statuses.selectById",id);
      session.close();
      return statuses;
    }

    public int insert(Statuses statuses) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("statuses.insert",statuses);
      session.commit();
      session.close();
      return count;
    }

    public int update(Statuses statuses) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("statuses.update",statuses);
      session.commit();
      session.close();
      return count;
    }
    
    public int delete(String id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("statuses.delete",id);
      session.commit();
      session.close();
      return count;
    }   
}
