/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.ConnectionProvider;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getCon();
        if (con != null) {
            System.out.println("✅ Connection successful!");
        } else {
            System.out.println("❌ Connection failed.");
        }
    }
}
