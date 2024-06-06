
package com.mycompany.proyecto2_dbii;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connectToSQLServerWindowsAuth(String instance, String database) throws SQLException {
        String url = "jdbc:sqlserver://" + instance + ";databaseName=" + database + ";integratedSecurity=true;";
        return DriverManager.getConnection(url);
    }

    public static Connection connectToPostgreSQL(String instance, String database, String port, String user, String password) throws SQLException {
        String url = "jdbc:postgresql://" + instance + ":" + port + "/" + database;
        return DriverManager.getConnection(url, user, password);
    }
}

