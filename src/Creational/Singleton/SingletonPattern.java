package Creational.Singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDBInstance();
        DBConnection dbConnection1 = DBConnection.getDBInstance();

        System.out.println(dbConnection);
        System.out.println(dbConnection1);
    }
}
