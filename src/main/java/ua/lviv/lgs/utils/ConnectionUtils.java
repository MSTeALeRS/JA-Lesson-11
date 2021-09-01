package ua.lviv.lgs.utils;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static String USER_NAME = "root";
    private static String USER_PASSWORD = "root";
    private  static String URL = "jdbc:mysql://localhost/New_Shop";

    public static Connection openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
    }
}
