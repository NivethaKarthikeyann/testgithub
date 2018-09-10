
package dd;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class dd {
 
    public static void main(String[] args) throws ClassNotFoundException {
 
        Connection conn = null;
 
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  

            String dbURL = "jdbc:sqlserver://192.168.1.93:1433;databaseName=CXi_BH_Test01;user=sa;password=pointel@10";
          
            conn = DriverManager.getConnection(dbURL);
            

            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}