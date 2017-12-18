package BookingGym.dal;
import BookingGym.model.Clients;
import BookingGym.model.Tariff;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class TariffDal extends BaseDal{
    
    public TariffDal() {
        super();
    }

    public List<Tariff> selectAll() {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Tariff> list = session.selectList("tariff.selectAll");
      session.close();
      return list;
    }

    public Tariff selectById(String id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Tariff tariff = session.selectOne("tariff.selectById",id);
      session.close();
      return tariff;
    }
    public int insert(Tariff tariff) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("tariff.insert",tariff);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Tariff tariff) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("tariff.update",tariff);
      session.commit();
      session.close();
      return count;
    }

    
    public int delete(String id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("tariff.delete",id);
      session.commit();
      session.close();
      return count;
    }
    
}
