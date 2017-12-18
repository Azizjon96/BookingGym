package BookingGym.dal;
import BookingGym.model.Clients;
import java.util.List;
import org.apache.ibatis.session.SqlSession;


public class ClientsDal extends BaseDal
{
    
public ClientsDal() {
        super();
    }

    public int update(Clients clients) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("clients.update",clients);
      session.commit();
      session.close();
      return count;
    }

    public int insert(Clients clients) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("clients.insert",clients);
      session.commit();
      session.close();
      return count;
    }
    
    public int delete(Clients clients)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("clients.delete",clients);
      session.commit();
      session.close();
      return count;
    }
    
    public Clients selectById(String id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Clients clients= session.selectOne("clients.selectById",id);
      session.close();
      return clients;
    }
    public Clients selectByPhone(String phone) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Clients clients= session.selectOne("clients.selectByPhone",phone);
      session.close();
      return clients;
    }

    public List<Clients> selectAll() {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Clients> list = session.selectList("clients.selectAll");
      session.close();
      return list;
    }

    Clients selectByPhone(int phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
