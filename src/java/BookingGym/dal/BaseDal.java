package BookingGym.dal;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDal {
        protected SqlSessionFactory sqlSessionFactory;
    public BaseDal() {
        Reader reader = null;
        
        try {   
            
            reader = Resources.getResourceAsReader("BookingGym/mybatis/config.xml");
            
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            
            System.out.println("create sqlSessionFactory  +");
            
            
        } 
        catch (IOException ex) 
        {   
            Logger.getLogger(BaseDal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(BaseDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
}
