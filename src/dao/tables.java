/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author sydne
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
            //st.executeUpdate("insert into appuser (userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','Super Admin','12345','superadmin@testemail.com','admin','Philippines','Active')");
            //st.executeUpdate("create table category (category_pk int AUTO_INCREMENT primary key,name varchar(200))");
            //st.executeUpdate("CREATE TABLE product (product_pk INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), quantity INT, price INT, description VARCHAR(500), category_fk INT)");
            //st.executeUpdate("create table customer (customer_pk INT AUTO_INCREMENT PRIMARY KEY,name varchar(200),mobileNumber varchar(50),email varchar(200))");
            st.executeUpdate("CREATE TABLE orderDetail (order_pk INT AUTO_INCREMENT PRIMARY KEY, orderId VARCHAR(200), customer_fk INT, orderDate VARCHAR(200), totalPaid INT)");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }
    }
}
