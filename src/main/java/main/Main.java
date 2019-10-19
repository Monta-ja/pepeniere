/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import utils.Singleton;

/**
 *
 * @author Dreamer
 */
public class Main {
    public static void main(String[] args) throws SQLException, IOException {
    Connection myConn0 = Singleton.getInstancesingleton()
            .getConnection();
}
}
