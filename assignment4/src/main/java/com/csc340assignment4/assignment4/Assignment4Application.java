package com.csc340assignment4.assignment4;

import javax.swing.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Jeong Won Kim
 */
@SpringBootApplication
public class Assignment4Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment4Application.class, args);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                employeeForm employeeForm = new employeeForm();
                employeeForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                employeeForm.pack();
                employeeForm.setVisible(true);
            }
        });
    }

}
