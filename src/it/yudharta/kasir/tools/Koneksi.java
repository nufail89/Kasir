/*
 * Copyright (C) 2016 cahya
 *
 * Program ini adalah Aplikasi Gratis, Anda dapat Mengembangkan atau
 * merubah sebagian atau seluruh kode, dengan seizin pengembang.
 *
 * Program ini dikembangkan dengan harapan agar bermanfaat,
 * tapi tanpa GARANSI apapun.
 */
package it.yudharta.kasir.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * <code>Koneksi</code> digunakan untuk mendapatkan instance koneksi ke database.
 * 
 * @author cahya
 */
public class Koneksi {

    private Koneksi() {
    }

    public static Koneksi getInstance() {
        return KoneksiHolder.INSTANCE;
    }

    private static class KoneksiHolder {

        private static final Koneksi INSTANCE = new Koneksi();
    }

    public Connection getKoneksi() {
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir",
                    "root", "server");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return conn;
    }
}
