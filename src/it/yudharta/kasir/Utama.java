/*
 * Copyright (C) 2016 cahya
 *
 * Program ini adalah Aplikasi Gratis, Anda dapat Mengembangkan atau
 * merubah sebagian atau seluruh kode, dengan seizin pengembang.
 *
 * Program ini dikembangkan dengan harapan agar bermanfaat,
 * tapi tanpa GARANSI apapun.
 */
package it.yudharta.kasir;

import it.yudharta.kasir.ui.MenuUtama;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Class Utama untuk menjalankan program Kasir.
 *
 * Seluruh program akan dijalankan mulai dari class Utama.
 *
 *
 * @author cahya
 */
public class Utama {

    /**
     * Frame Menu Utama dibuat static agar bisa diakses dari class lain.
     */
    public static MenuUtama menuUtama = MenuUtama.getInstance();

    /**
     * Menjalankan Frame Menu Utama.
     *
     * tampilan program akan di handle oleh Menu Utama.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException ex) {
            Logger.getLogger(Utama.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(()
                -> menuUtama.setVisible(true));
    }

}
