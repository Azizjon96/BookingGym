package BookingGym.dal;
import BookingGym.model.Admin;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class AdminDal extends BaseDal{
    
    public AdminDal() {
        super();       
    }

    public List<Admin> selectAll() {
        
        List<Admin> list = null;
        try  {
            SqlSession session = sqlSessionFactory.openSession();
            list = session.selectList("admin.selectAll");
        }
       catch( Exception e){
           System.err.println( "(2): " + e.getMessage() );
       }
      
      return list;
    } 
    
      public int insert(Admin admin) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("admin.insert",admin);
      session.commit();
      session.close();
      return count;
    }
    
      public int update(Admin admin) {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("admin.update",admin);
      session.commit();
      session.close();
      return count;
    }
      public Admin selectById(int id) {
      SqlSession session = sqlSessionFactory.openSession(); 
      Admin admin= session.selectOne("admin.selectById",id);
      session.close();
      return admin;
    }
    public int delete(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("admin.delete",id);
      session.commit();
      session.close();
      return count;
    }   
}
