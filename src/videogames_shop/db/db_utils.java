/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement; 
/**
 *
 * @author Леонид
 */
public class db_utils {
    
    private static final String URL = "jdbc:mysql://localhost:3306/shop?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static db_utils dataGateway;
    private static MysqlDataSource mysqlDataSource;
    private db_utils() 
    {
        mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(URL);
        mysqlDataSource.setUser(USER);
        mysqlDataSource.setPassword(PASSWORD);

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static db_utils getInstance() {
        if (dataGateway == null)
            dataGateway = new db_utils();
        return dataGateway;
    }
     public MysqlDataSource getDataSource() {
        return mysqlDataSource;
    }


    
}
