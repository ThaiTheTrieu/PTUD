package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thait
 */
public class DBConnection {

    private static DBConnection instance;
    private Connection con;

    public DBConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLLSP;trustServerCertificate=true;";

        try {
            String userName = "sa";
            String pass = "sapassword";
            con = DriverManager.getConnection(url, userName, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }

    public synchronized static DBConnection getInstance() {
        if(instance==null)
            instance = new DBConnection();
        return instance;
    }
    
    public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    
}
