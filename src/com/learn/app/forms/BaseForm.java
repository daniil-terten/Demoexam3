package com.learn.app.forms;

import javax.swing.*;
import java.awt.*;

public class BaseForm extends JFrame {
    public BaseForm(){
        setTitle("Школа языков 'Леарн'");
        setMinimumSize(new Dimension(1200,800));
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("school_logo.png")).getImage());
    }
}
