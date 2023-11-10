package Creational.Singleton;

public class DBConnection {

    private static DBConnection dbConnection = null;

    private DBConnection() {}

    /**
     * In multithreading class,
     * It can be prone to create multiple new instance
     *
     * So, solution is to use lock on critical section.
     */
    public static DBConnection getDBInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

}
