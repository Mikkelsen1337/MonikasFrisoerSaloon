import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DataBaseConnection {

        private static String URL = "jdbc:mysql://localhost:3306/" + "HairSaloon";

        private static String user = "root";

        private static String passWord = "root";

        private static DataBaseConnection instance;


        public static DataBaseConnection getInstance() {
            if (instance == null) {
                synchronized (DataBaseConnection.class) {
                    if (instance == null) {
                        instance = new DataBaseConnection();
                    }
                }
            }
            return instance;
        }

        public static Connection getConnection(){

            try{
                return DriverManager.getConnection(URL, user, passWord);
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }
        }

    }
}
