package com.learn.app.forms;

import com.learn.app.utils.ServiceTableManager;

import javax.swing.*;

public class ServiceForm extends BaseForm{
    private JTable serviceTable;
    private JPanel panel;

    public ServiceForm(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ServiceTableManager.refreshTable(serviceTable);
    }
}
