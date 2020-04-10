package Kain;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;


class login extends JFrame
{
    
    JLabel user = new JLabel("Username");
    JLabel pass =new JLabel("Password");
    JLabel tombol = new JLabel(new ImageIcon("tombol1.png"));
   
    JTextField tuser = new JTextField("");
    JPasswordField tpass = new JPasswordField("");
    JButton login = new JButton();
    JButton reset = new JButton();



    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JLabel gambar = new JLabel(new ImageIcon("image/hd.jpg"));
   
    JLabel lo = new JLabel(new ImageIcon("image/lo1.png"));
    JLabel re = new JLabel(new ImageIcon("image/reset1.png"));
    
    String nama ="";
    String password ="";
   


    login()
    {
        setLocation(400,90);
        setSize(600,700);
        setTitle("Toko Indah Jaya");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    void komponenvisual()
    {
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);




        getContentPane().add(baju);
        baju.setBounds(-110,-210,800,800);
        
        getContentPane().add(tombol);
        tombol.setBounds(-110,-320,800,800);



        getContentPane().add(user);
        user.setBounds(150,250,200,100);
        user.setFont(new Font("Impact",Font.PLAIN,18));
        user.setForeground(Color.white);

        getContentPane().add(pass);
        pass.setBounds(150,290,200,100);
        pass.setFont(new Font("Impact",Font.PLAIN,18));
        pass.setForeground(Color.white);

        getContentPane().add(tuser);
        tuser.setBounds(250,285,200,40);
        tuser.setToolTipText("Masukkan Username");


        getContentPane().add(tpass);
        tpass.setBounds(250,325,200,40);
        tpass.setEchoChar('*');
        tpass.setToolTipText("Masukkan Password");


        getContentPane().add(lo);
        lo.setBounds(5,-5,800,800);
        getContentPane().add(login);
        login.setBounds(360,380,85,30);
        login.setFont(new Font("Impact",Font.PLAIN,15));
        login.setForeground(Color.black);
        
        getContentPane().add(re);
        re.setBounds(-105,-5,800,800);
        getContentPane().add(reset);
        reset.setBounds(250, 380, 85, 30);




        getContentPane().add(gambar);
        gambar.setBounds(0,0,600,700);



        setVisible(true);

        getRootPane().setDefaultButton(login);
    }

    void aksireaksi()
    {
    	login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==login) {
					try {
						nama = tuser.getText();
						password = new String(tpass.getPassword());
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin","root","");
						Statement stm = koneksi.createStatement();
						
						String sql = "select * from tablelogin where username='"+nama+"' and password='"+password+"'  ";
						ResultSet rs = stm.executeQuery(sql);
						
						if(rs.next())
						{
							if((rs.getString(1).equals(nama))&&(rs.getString(2).equals(password)))
							JOptionPane.showMessageDialog(null, "login sempurna","konfirmasi",JOptionPane.INFORMATION_MESSAGE);
							 beranda br = new beranda();
						        br.Komponenvisual();
						        br.aksi();
						        dispose();
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "login failed","konfirmasi",JOptionPane.INFORMATION_MESSAGE);
						}
						
						stm.close();
						koneksi.close();
					}
					
					catch (Exception ex) {
						// TODO: handle exception
						
						System.out.println("Error:"+ex);
					}
				}
				
			}
		});
    	
    	
    	reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tuser.setText("");
				tpass.setText("");
			}
		});
    	
    	
    }
    
    
   

    public static void main(String[] args) {
        login Lo = new login();
        Lo.komponenvisual();
        Lo.aksireaksi();
    }
}
