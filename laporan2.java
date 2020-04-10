package Kain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import  java.awt.*;



class laporan2 extends JFrame
{



    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JButton back = new JButton();
    JLabel ba = new JLabel(new ImageIcon("image/beek1.png"));
    JLabel pl = new JLabel(new ImageIcon("image/prit1.png"));
    JButton print = new JButton();
    JLabel border1 = new JLabel();
    
    JLabel id = new JLabel("Id pakaian");
    
    
    
    
    JLabel gam = new JLabel(new ImageIcon("image/hd.jpg"));


    String  header [] = {"Id","Nama","Alamat","Jenis","No hp","Kategori","Pnjng","L.ping","P.kaki","L.ban","L.lutut","P.paha","L.pingu","harga","Ukran"};
    String [][] data = {{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""},{""}};
    DefaultTableModel model = new DefaultTableModel(data,header);
    JTable table = new JTable(model);
    JScrollPane scrol = new JScrollPane(table);
    Dimension di = new Dimension(20,4);
    


    
    
   

    JPanel pan = new JPanel();

    laporan2()
    {
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);
        setLocation(120,30);
        setSize(1200,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("indah jaya");






    }

    void Komponenvisual()
    {


        getContentPane().add(baju);
        baju.setBounds(200,-300,800,800);
        getContentPane().add(ba);
        

        getContentPane().add(pl);
        pl.setBounds(-163, 315, 800, 800);
        pl.setFont(new Font("Impact",Font.PLAIN,20));
        getContentPane().add(print);
        print.setBounds(200,675,75,80);
        
        getContentPane().add(ba);
        ba.setBounds(-262, 315, 800, 800);
        getContentPane().add(back);
        back.setBounds(100,675,75,80);
        back.setForeground(Color.black);
        back.setFont(new Font("Impact",Font.PLAIN,20));
        
     
        

       
        getContentPane().add(scrol);
        scrol.setBounds(50,230,1100,250);
        
       
     

        getContentPane().add(border1);
        border1.setBounds(30,180,1140,550);
        border1.setBorder(new LineBorder(Color.white,2,true));
        
        
   
        
        getContentPane().add(gam);
        gam.setBounds(0,-100,1200,1200);

    }

    void aksi()
    {
      
    	back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			

				  homelapor ho = new homelapor();
			        ho.Komponenvisual();
			        ho.aksi();
			        dispose();
			}
		});
    	
    	

    	print.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			

				cetak_hasil();
			}
		});
    	

    
    	
    	
    	
    }
    
    void tampilTabel()
	{
		hapusTabel();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			
			Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datalogin","root","");
			Statement stm = koneksi.createStatement();
			
			String sql = "select * from tabelcelana ";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next())
			{
				Object obj[] = new Object [15];
				obj[0] = rs.getString(1);
				obj[1] = rs.getString(2);
				obj[2] = rs.getString(3);
				obj[3] = rs.getString(4);
				obj[4] = rs.getString(5);
				obj[5] = rs.getString(6);
				obj[6] = rs.getString(7);
				obj[7] = rs.getString(8);
				obj[8] = rs.getString(9);
				obj[9] = rs.getString(10);
				obj[10] = rs.getString(11);
				obj[11] = rs.getString(12);
				obj[12] = rs.getString(13);
				obj[13] = rs.getString(14);
				obj[14] = rs.getString(15);
				
				model.addRow(obj);
			}


		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
	}
	void hapusTabel()
	{
		int row = model.getRowCount();
		for (int i=0; i<row; i++)
		{
			model.removeRow(0);
		}
	}

	

	
	void cetak_hasil()
	{
		int y = 0;
		Frame fr = new Frame();
		PrintJob print = fr.getToolkit().getPrintJob(fr, "Printing", null,null);
		if (print != null) 
			{
			Graphics g = print.getGraphics();
			if (g != null)
			{
				Image image=new ImageIcon("home2.jpg").getImage();
				g.drawImage(image,0,0,this);
				g.setFont(new Font("Times New Roman",1,17));
				g.drawString("LAPORAN PENJUALAN ", 210, 40);
				
			//Nama Kolom Tabel
			
					String nama = table.getColumnName(0);
					String nohp = table.getColumnName(1);
					String almat = table.getColumnName(2);
					String jh = table.getColumnName(3);
					String nh = table.getColumnName(4);
					String jb = table.getColumnName(5);
					String tg = table.getColumnName(14);
				
					
					g.setFont(new Font("Dialog",1,8));
					g.drawString(nama, 40, 100);
					g.drawString(nohp, 80, 100);
					g.drawString(almat, 160, 100);
					g.drawString(jh,220,100);
					g.drawString(nh, 300, 100);
					g.drawString(jb, 380, 100);
					g.drawString(tg, 510, 100);
					
					
					g.drawLine(115,45,470,45); //garis di bawah judul
					
					g.drawLine(30,103,580,103);  //garis dibawah tabel 
						
					int n = model.getRowCount();
					for (int i = 0; i < n; i++)
					{
						int k = i + 1;
						int j = 10 * k;
						y = 103 + j;
							
						g.setFont(new Font("Dialog",0,8));
						String txnama = model.getValueAt(i, 0).toString();
						String txnohp = model.getValueAt(i, 1).toString();
						String txalm = model.getValueAt(i, 2).toString();
						String txjh = model.getValueAt(i, 3).toString();
						String txnh = model.getValueAt(i, 4).toString();
						String txjb = model.getValueAt(i, 5).toString();
						String txtg = model.getValueAt(i, 14).toString();
					
						g.drawString(txnama, 40, y);
						g.drawString(txnohp, 80, y);
						g.drawString(txalm, 160, y);
						g.drawString(txjh, 220, y);
						g.drawString(txnh, 300, y);
						g.drawString(txjb, 385, y);
						g.drawString(txtg, 510, y);
						
					}
			}
				print.end();
				print.end();
		}
	}

	
	
	
    public static void main(String[] args) {

       laporan2 lp = new laporan2();
        lp.Komponenvisual();
        lp.aksi();
        lp.tampilTabel();

    }
}