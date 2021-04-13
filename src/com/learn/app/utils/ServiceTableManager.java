package com.learn.app.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceTableManager {
    public static void refreshTable(JTable table){
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(new String[]{
                "ID", "Название услуги", "Стоимость", "Длительность", "Скидка", "Путь к картинке"
        });
        DBHandler.openConnection();
        ResultSet resultSet = DBHandler.execQuery("SELECT * FROM service");
        try {
            while (resultSet.next()){
                defaultTableModel.addRow(new String[]{
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(6),
                        resultSet.getString(7)
                });
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DBHandler.closeConnection();
        table.setModel(defaultTableModel);
    }
}
