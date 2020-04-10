package Kain;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.io.*;
import javax.swing.table.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener.*;
import java.util.*;
import java.awt.event.*;
import java.awt.print.*;

class aplikasi_jahit extends JFrame
{


    JLabel gambar = new JLabel();
    JLabel border = new JLabel();
    JLabel border1 = new JLabel();
    JLabel border2 = new JLabel();
    JButton save= new JButton();
    JLabel sa = new JLabel(new ImageIcon("image/simpan1.png"));
    JButton update = new JButton();
    JLabel up = new JLabel(new ImageIcon("image/edit1.png"));
    JButton reset = new JButton();
    JLabel re = new JLabel(new ImageIcon("image/resett1.png"));
    JLabel id = new JLabel("Id pakaian");
    JButton cari = new JButton();
    JLabel se = new JLabel(new ImageIcon("image/ser1.png"));
    JButton print = new JButton();
    JLabel pr = new JLabel(new ImageIcon("image/prit1.png"));
    JButton delete = new JButton();
    JLabel de = new JLabel(new ImageIcon("image/del1.png"));
    JButton back = new JButton();
    JLabel ba = new JLabel(new ImageIcon("image/beek1.png"));
    JButton laporkan = new JButton();
    JLabel lapo = new JLabel(new ImageIcon("image/l1.png"));
    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JLabel form = new JLabel(new ImageIcon("image/foo1.png"));
    JLabel pem = new JLabel(new ImageIcon("image/pe11.png"));
    JLabel ukur = new JLabel(new ImageIcon("image/uk11.png"));
    JLabel to = new JLabel(new ImageIcon("image/harga1.png"));
    
    

    String [] idd = {"--Pilih Kode--","001","002","003","004","005","101","102","103","104","105","201","202","203","204","205","206","207"};
    JComboBox tid = new JComboBox(idd);

    JLabel name = new JLabel("Nama Lengkap");
    JTextField tnama = new JTextField();
    JLabel alam = new JLabel("Alamat");
    JTextField talam = new JTextField();
    JLabel gender = new JLabel("Jenis Kelamin");

    String [] jenis1 = {"--Jenis Kelamin--","Pria","Wanita"};
    JComboBox tgender1 = new JComboBox(jenis1);
    JLabel nomor = new JLabel("Nomor HP");
    JTextField tnomor = new JTextField();
    JLabel jenis = new JLabel("Kategori ");

    String [] katagori = {"--Pilih Katagori--","Seragam Sekolah","Jass","Seragam PDH","Seragam PDL","Seragam Pramuka","Kemeja Pakistan","Jubah","Kemeja Sanghai"};
    JComboBox katago = new JComboBox(katagori);

    JLabel lb  = new JLabel("Lingkar badan");
    JTextField tb = new JTextField();
    JLabel lp  = new JLabel("Lingkar pinggang");
    JTextField tp = new JTextField();
    JLabel pp = new JLabel("Panjang punggung");
    JTextField tpp = new  JTextField();
    JLabel pm = new JLabel("Lingkar paha");
    JTextField tpm = new JTextField();
    JLabel lpu = new JLabel("Lebar punggung");
    JTextField tlp = new JTextField();
    JLabel lh = new JLabel("Lingkar punggung");
    JTextField tlh = new JTextField();
    JLabel pb = new JLabel("Panjang baju");
    JTextField tpb = new JTextField();
    JTextField tcari = new JTextField();
    JLabel pl = new JLabel("panjang lengan");
   
    JTextField tpl = new JTextField();
    JTextField harga = new JTextField();
  
    

    JLabel gam = new JLabel(new ImageIcon("image/hd.jpg"));
    
    int A;
    int B;
    
   
    
    




    aplikasi_jahit()
    {
        setTitle("Toko Indah Jaya");
        setLocation(120,30);
        setSize(1200,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    void Komponenvisual()
    {



        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);


        getContentPane().add(gambar);
        gambar.setBounds(0,0,1200,1200);

       
        
        getContentPane().add(baju);
        baju.setBounds(600,-300,800,800);
        
        getContentPane().add(form);
        form.setBounds(-40,-320,800,800);
        
        getContentPane().add(pem);
        pem.setBounds(-330,-230,800,800);
        
        getContentPane().add(ukur);
        ukur.setBounds(30,-230,800,800);
        

        getContentPane().add(border);
        border.setBounds(20,180,350,350);
        border.setFont(new Font("Impact", Font.PLAIN,20));
        border.setForeground(Color.black);
        border.setBackground(Color.black);
        border.setBorder(new LineBorder(Color.white,2,true));


        getContentPane().add(border1);
        border1.setBounds(380,180,800,350);
        border1.setFont(new Font("Impact", Font.PLAIN,20));
        border1.setForeground(Color.black);
        border1.setBackground(Color.black);
        border1.setBorder(new LineBorder(Color.white,2,true));
       
        getContentPane().add(sa);
        sa.setBounds(690, 215, 800, 800);
        getContentPane().add(save );
        save.setBounds(1060,575,65,80);
        save.setForeground(Color.black);
        save.setFont(new Font("Impact",Font.PLAIN,20));
        
        
       
        getContentPane().add(up);
        up.setBounds(570, 215, 800, 800);
        getContentPane().add(update);
        update.setBounds(935,575,65,80);
        update.setForeground(Color.black);
        update.setFont(new Font("Impact",Font.PLAIN,20));
        
        getContentPane().add(re);
        re.setBounds(450, 215, 800, 800);
        getContentPane().add(reset);
        reset.setBounds(815,575,65,80);
        reset.setForeground(Color.black);
        reset.setFont(new Font("Impact",Font.PLAIN,20));
        
        
        getContentPane().add(se);
        se.setBounds(-75, -180, 800, 800);
        getContentPane().add(cari);
        cari.setBounds(300,193,40,30);
        cari.setForeground(Color.black);
        cari.setFont(new Font("Impact",Font.PLAIN,20));
        
        
        getContentPane().add(pr);
        pr.setBounds(330, 215, 800, 800);
        getContentPane().add(print);
        print.setBounds(695,575,65,80);
        print.setForeground(Color.black);
        print.setFont(new Font("Impact",Font.PLAIN,20));
        
        getContentPane().add(de);
        de.setBounds(210, 215, 800, 800);
        getContentPane().add(delete);
        delete.setBounds(575,575,65,80);
        delete.setForeground(Color.black);
        delete.setFont(new Font("Impact",Font.PLAIN,20));
        
        getContentPane().add(ba);
        ba.setBounds(-262, 315, 800, 800);
        getContentPane().add(back);
        back.setBounds(100,675,75,80);
        back.setForeground(Color.black);
        back.setFont(new Font("Impact",Font.PLAIN,20));
        
        getContentPane().add(lapo);
        lapo.setBounds(-130, 315, 800, 800);
        getContentPane().add(laporkan);
        laporkan.setBounds(228,675,75,80);
        laporkan.setForeground(Color.black);
        laporkan.setFont(new Font("Impact",Font.PLAIN,20));

        getContentPane().add(id);
        id.setBounds(30,200,100,30);
        id.setForeground(Color.white);
        id.setFont(new Font("Impact",Font.PLAIN,16));
        getContentPane().add(tid);
        tid.setBounds(140,200,150,35);
        
        getContentPane().add(name);
        name.setBounds(30,250,100,30);
        name.setForeground(Color.white);
        name.setFont(new Font("Impact",Font.PLAIN,16));
        getContentPane().add(tnama);
        tnama.setBounds(140,250,220,35);

        getContentPane().add(alam);
        alam.setBounds(30,300,80,30);
        alam.setForeground(Color.white);
        alam.setFont(new Font("Impact",Font.PLAIN,16));
        getContentPane().add(talam);
        talam.setBounds(140,300,220,35);

        getContentPane().add(gender);
        gender.setBounds(30,350,100,30);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Impact",Font.PLAIN,16));
      

        getContentPane().add(tgender1);
        tgender1.setForeground(Color.black);
        tgender1.setBounds(140,350,220,35);
        tgender1.setFont(new Font("Serif",Font.PLAIN,16));
    



        getContentPane().add(nomor);
        nomor.setBounds(30,400,100,30);
        nomor.setForeground(Color.white);
        nomor.setFont(new Font("Impact",Font.PLAIN,16));
        getContentPane().add(tnomor);
        tnomor.setBounds(140,400,220,35);


        getContentPane().add(jenis);
        jenis.setBounds(30,450,100,30);
        jenis.setForeground(Color.white);
        jenis.setFont(new Font("Impact",Font.PLAIN,16));
        getContentPane().add(katago);
        katago.setBounds(140,450,220,35);




        getContentPane().add(lb);
        lb.setBounds(400,200,200,30);
        lb.setForeground(Color.white);
        lb.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tb);
        tb.setBounds(550,200,220,35);


        getContentPane().add(lp);
        lp.setBounds(400,250,200,30);
        lp.setForeground(Color.white);
        lp.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tp);
        tp.setBounds(550,250,220,35);


        getContentPane().add(pp);
        pp.setBounds(800,200,200,30);
        pp.setForeground(Color.white);
        pp.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tpp);
        tpp.setBounds(950,200,220,35);


        getContentPane().add(pm);
        pm.setBounds(800,250,200,30);
        pm .setForeground(Color.white);
        pm.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tpm);
        tpm.setBounds(950,250,220,35);


        getContentPane().add(lpu);
        lpu.setBounds(400,300,200,30);
        lpu.setForeground(Color.white);
        lpu.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tlp);
        tlp.setBounds(550,300,220,35);

        getContentPane().add(lh);
        lh.setBounds(400,350,200,30);
        lh.setForeground(Color.white);
        lh.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tlh);
        tlh.setBounds(550,350,220,35);


        getContentPane().add(pb);
        pb.setBounds(800,300,200,30);
        pb.setForeground(Color.white);
        pb.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tpb);
        tpb.setBounds(950,300,220,35);

        getContentPane().add(pl);
        pl.setBounds(800,350,200,30);
        pl.setForeground(Color.white);
        pl.setFont(new Font("Impact",Font.PLAIN,16));

        getContentPane().add(tpl);
        tpl.setBounds(950,350,220,35);
        
        
        getContentPane().add(to);
        to.setBounds(500,350,800,800);
      
        
        getContentPane().add(harga);
        harga.setBounds(950,730,220,30);
        harga.setFont(new Font("Impact", Font.PLAIN,20));
        harga.setHorizontalAlignment(JButton.CENTER);
        harga.setOpaque(false);
       // getContentPane().add(table);
        //table.setBounds(380,180,800,350);
        //table.setBackground(Color.black);







        getContentPane().add(gam);
        gam.setBounds(0,-100,1200,1200);

        getRootPane().setDefaultButton(save);
    }
    
    void clear()
    {
    	tnama.setText("");
    	talam.setText("");
    	tnomor.setText("");
    	tgender1.setSelectedItem("");
    	katago.setSelectedItem("");
    	tb.setText("");
    	tp.setText("");
    	tpp.setText("");
    	tpm.setText("");
    	tlp.setText("");
    	tlh.setText("");
    	tpb.setText("");
    	tpl.setText("");
    	

    }


    void aksi()
    {

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            	 
                 if(e.getSource()==save) {
 					try {
 					
 						
 						if (katago.getSelectedItem().equals("Seragam Sekolah"))
 		                 {
 		                     String B = String.valueOf(200000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 if (katago.getSelectedItem().equals("Jass"))
 		                 {
 		                     String B = String.valueOf(500000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 if (katago.getSelectedItem().equals("Seragam PDH"))
 		                 {
 		                     String B = String.valueOf(400000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 if (katago.getSelectedItem().equals("Seragam PDL"))
 		                 {
 		                     String B = String.valueOf(400000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 if (katago.getSelectedItem().equals("Seragam Pramuka"))
 		                 {
 		                     String B = String.valueOf(300000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 if (katago.getSelectedItem().equals("Kemeja Pakistan"))
 		                 {
 		                     String B = String.valueOf(350000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 
 		                 if (katago.getSelectedItem().equals("Jubah"))
 		                 {
 		                     String B = String.valueOf(700000);
 		                     harga.setText(B);
 		                 }
 		                 
 		                 
 		                 
 		                 if (katago.getSelectedItem().equals(" Kemeja Sanghai"))
 		                 {
 		                     String B = String.valueOf(120000);
 		                     harga.setText(B);
 		                 }
 		                 
 						
 						Class.forName("com.mysql.jdbc.Driver");
 						
 						Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin","root","");
 						Statement stm = koneksi.createStatement();
 						
 						String sql = " insert into tabelbaju values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )  ";
 						PreparedStatement pr = koneksi.prepareStatement(sql);
 						

 						pr.setString(1, tid.getSelectedItem().toString());
 						pr.setString(2, tnama.getText());
 						pr.setString(3, talam.getText());
 						pr.setString(4, tgender1.getSelectedItem().toString());
 						pr.setString(5, tnomor.getText());
 						pr.setString(6, katago.getSelectedItem().toString());
 						pr.setString(7, tb.getText());
 						pr.setString(8, tp.getText());
 						pr.setString(9, tpp.getText());
 						pr.setString(10, tpm.getText());
 						pr.setString(11, tlp.getText());
 						pr.setString(12, tlh.getText());
 						pr.setString(13, tpb.getText());
 						pr.setString(14, tpl.getText());
 						pr.setString(15, harga.getText());
 						
 						pr.executeUpdate(); 
 						JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
 						
 						
 					
 					}
 					
 					catch (Exception ex) {
 						// TODO: handle exception
 						
 						System.out.println("Error:"+ex);
 					}
 				}
                 



            }
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            	if  (e.getSource() ==update)
				{
					
				try
				{
													
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin", "root",""); 
					String sql = "UPDATE tabelbaju SET nama = ?,alamat = ?,jenis_kelamin = ?,nohp = ?,katagori = ?,lbadan = ?,lping = ?,lpung = ?,lepung = ?,ppung = ?,lpaha = ?,pbaju = ?,pleng = ?  WHERE idpakaian= ?";
					 PreparedStatement pr = koneksi.prepareStatement(sql);
					
					
					
					pr.setString(1,tnama.getText());
					pr.setString(2,talam.getText());
					pr.setString(3,(String) tgender1.getSelectedItem());
					pr.setString(4,tnomor.getText());
					pr.setString(5, (String)katago.getSelectedItem());
					pr.setString(6,tb.getText());
					pr.setString(7,tp.getText());
					pr.setString(8,tpp.getText());
					pr.setString(9,tpm.getText());
					pr.setString(10,tlp.getText());
					pr.setString(11,tlh.getText());
					pr.setString(12,tpb.getText());
					pr.setString(13,tpl.getText());
					pr.setString(14,(String)tid.getSelectedItem());
					
				
					pr.executeUpdate();
						pr.close();
						koneksi.close();
					
								
					JOptionPane.showMessageDialog(null,  "Data Berhasil Diubah !","Pesan", JOptionPane.INFORMATION_MESSAGE);
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, e);
				}}}
			});
        
        
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            	tnama.setText("");
            	talam.setText("");
            	tnomor.setText("");
            	tb.setText("");
            	tp.setText("");
            	tpp.setText("");
            	tpm.setText("");
            	tlp.setText("");
            	tlh.setText("");
            	tpb.setText("");
            	tpl.setText("");
            	


            }
        });
        
        
        print.addActionListener(new ActionListener()
        
        {
        	 @Override
        public void actionPerformed(ActionEvent e)
        {

        int y = 0;
        Frame fr = new Frame();
        PrintJob print = fr.getToolkit().getPrintJob(fr, "Prinnting" , null, null);
        if(print != null)
        {
        Graphics g = print.getGraphics();
        if(g != null)
        {
        //untuk kop header
        g.setFont(new Font("Dialog",1,11));
        g.drawString("STRUK DATA PELANGGAN ", 10,40);
        g.drawLine(10,50,550,50); //untuk garis

        g.drawString("ID_PELANGGAN",10,70);
        g.drawString(" : ",160,70);
        g.drawString((String) tid.getSelectedItem(), 170,70);

        g.drawString("NAMA",10,90);
        g.drawString(" : ",160,90);
        g.drawString(tnama.getText(), 170,90);

        g.drawString("ALAMAT",10,110);
        g.drawString(" : ", 160,110);
        g.drawString(talam.getText(),170,110);

       
        g.drawString("JENIS KELAMIN",10,150);
        g.drawString(" : ",160,150);
        g.drawString((String)tgender1.getSelectedItem(),170,150);

        g.drawString("NO HP",10,170);
        g.drawString(" : ",160,170);
        g.drawString(tnomor.getText(),170,170);

        g.drawString("KATAGORI",10,190);
        g.drawString(" : ",160,190);
        g.drawString((String)katago.getSelectedItem(),170,190);

        
        g.drawString("LEBAR BADAN",10,210);
        g.drawString(" : ",160,210);
        g.drawString(tb.getText(),170,210);
        
        
        g.drawString("LINGKAR PINGGANG",10,230);
        g.drawString(" : ",160,230);
        g.drawString(tp.getText(),170,230);
        
        
        g.drawString("LEBAR PUNGGUNG",10,250);
        g.drawString(" : ",160,250);
        g.drawString(tpp.getText(),170,250);
        
        
        g.drawString("LINGKAR PUNGGUNG",10,270);
        g.drawString(" : ",160,290);
        g.drawString(tpm.getText(),170,270);
        
        g.drawString("PANJANG PUNGGUNG",10,290);
        g.drawString(" : ",160,290);
        g.drawString(tlp.getText(),170,290);
        
        
        g.drawString("LINGKAR PAHA",10,310);
        g.drawString(" : ",160,310);
        g.drawString(tlh.getText(),170,310);
        
        
        g.drawString("PANJANG BAJU",10,330);
        g.drawString(" : ",160,330);
        g.drawString(tpb.getText(),170,330);
        
        
        g.drawString("PANJANG LENGAN",10,350);
        g.drawString(" : ",160,350);
        g.drawString(tpl.getText(),170,350);
        
        
        g.drawString("HARGA",10,370);
        g.drawString(" : ",160,370);
        g.drawString(harga.getText(),170,370);
        
        }
        }
        
        print.end();
        print.end();
        }
        
        });
        
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String id = tid.getSelectedItem().toString();	
        		int tanya = JOptionPane.showConfirmDialog(null,"Anda Ingin Menghapus Data Ini "+id+" ?","Hapus Data",JOptionPane.YES_NO_OPTION); 
        		{         
        		try 
        		{ 
        		Class.forName("com.mysql.jdbc.Driver"); 
        		Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin", "root",""); 
        					 
        		String sql="DELETE FROM tabelbaju WHERE idpakaian=?"; 
        		PreparedStatement pr = koneksi.prepareStatement(sql); 
        			 
        			pr.setString(1,id); 
        			pr.executeUpdate(); 
        			pr.close(); 
        			clear();
        			
        			koneksi.close(); 
        			JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus !!"); 
        					 
        	
        	
        		} 
        		catch (Exception ex) 
        			{
        			JOptionPane.showMessageDialog(null,"Error :"+ex,"Error",JOptionPane.ERROR_MESSAGE); 
        			}}}  
        		} );
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            	home ho = new home();
                ho.Komponenvisual();
                ho.aksi();
                dispose();



            }
        });
        
        
        laporkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            	  laporan lp = new laporan();
                  lp.Komponenvisual();
                  lp.aksi();
                  lp.tampilTabel();
                  dispose();



            }
        });
        
        
        cari.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				String id = tid.getSelectedItem().toString();	
				try
				{	
					Class.forName("com.mysql.jdbc.Driver").newInstance();	
					Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin","root","");
					Statement state = koneksi.createStatement();							
					String sql = "select * from tabelbaju where idpakaian = '"+id+"'";
					ResultSet dt = state.executeQuery(sql);
							
					if (dt.next())
					{
						tnama.setText(dt.getString(2));
						talam.setText(dt.getString(3));
						tgender1.setSelectedItem(dt.getString(4));
						tnomor.setText(dt.getString(5));
						katago.setSelectedItem(dt.getString(6));
						tb.setText(dt.getString(7));
						tp.setText(dt.getString(8));
						tpp.setText(dt.getString(9));
						tpm.setText(dt.getString(10));
						tlp.setText(dt.getString(11));
						tlh.setText(dt.getString(12));
						tpb.setText(dt.getString(13));
						tpl.setText(dt.getString(14));
						harga.setText(dt.getString(15));
						
					
						
						
						}
					}
					catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
					System.out.println(ex);
				}					
			}
		});		
		
        
        
       
       
    }
    
  

    public static void main(String args[] ) {

        aplikasi_jahit JH = new aplikasi_jahit();
        JH.Komponenvisual();
        JH.aksi();

    }
}
