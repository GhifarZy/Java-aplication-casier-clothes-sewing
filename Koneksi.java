package Kain;

import javax.swing.*;
import java.sql.*;

public class Koneksi
{
    void KoneksiDatabase()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datalogin","root","");
            JOptionPane.showMessageDialog(null,"koneksi berhasil !!","report koneksi",JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch (Exception e)
        {
            System.err.println("Exception:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Koneksi ko = new Koneksi();
        ko.KoneksiDatabase();

    }
}
    
