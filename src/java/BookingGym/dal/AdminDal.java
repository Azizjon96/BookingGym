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
            System.out.println(list);
            System.out.println("3");
        }
       catch( Exception e){
           System.err.println( "(2): " + e.getMessage() );
       }
      
      return list;
    } 
}
