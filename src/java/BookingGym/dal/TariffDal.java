package BookingGym.dal;
import BookingGym.model.Tariff;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class TariffDal extends BaseDal{
    
    public TariffDal() {
        super();       
    }

    public List<Tariff> selectAll() {
        
        List<Tariff> list = null;
        try  {
            SqlSession session = sqlSessionFactory.openSession();
            list = session.selectList("tariff.selectAll");
            //System.out.println("3");
        }
       catch( Exception e){
           System.err.println( "(2): " + e.getMessage() );
       }
      
      return list;
    }

    public Tariff selectById(int id) {
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

    
    public Tariff deleteById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Tariff abonent =  session.selectOne("tariff.deleteById",id);
        session.commit();
        session.close(); 
        return abonent;
    }
    public int delete(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("tariff.delete",id);
      session.commit();
      session.close();
      return count;
    }   
    
}
