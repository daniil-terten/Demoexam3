package com.learn.app.utils;

import java.sql.*;

public class DBHandler {
    public static Connection connection;
    public static boolean openConnection(){
        try {
            connection = DriverManager.getConnection(
                    Config.DB_URL,
                    Config.DB_USER,
                    Config.DB_PASS
            );
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
    
    public static boolean closeConnection(){
        try {
            connection.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
    
    public static ResultSet execQuery(String query){
        PreparedStatement preparedStatement;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            if(query.contains("SELECT")){
                resultSet = preparedStatement.executeQuery();
            } else {
                preparedStatement.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
}
