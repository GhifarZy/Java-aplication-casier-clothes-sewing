

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import  java.awt.*;



class about2 extends JFrame
{


	JLabel png = new JLabel(new ImageIcon("image/profilezy.png"));
	JButton next = new JButton();
    JButton back = new JButton();
    JLabel ba = new JLabel(new ImageIcon("image/beek1.png"));
    JLabel ne = new JLabel(new ImageIcon("image/next1.png"));
    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JLabel bag = new JLabel(new ImageIcon("image/hd.jpg"));
    
    
    
   

    JPanel pan = new JPanel();

    about2()
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

        getContentPane().add(ne);
        ne.setBounds(-162, 315, 800, 800);
        getContentPane().add(next);
        next.setBounds(200,675,75,80);

        getContentPane().add(ba);
        ba.setBounds(-262, 315, 800, 800);
        getContentPane().add(back);
        back.setBounds(100,675,75,80);
        back.setForeground(Color.black);
        back.setFont(new Font("Impact",Font.PLAIN,20));
        
        getContentPane().add(png);
        png.setBounds(-20,150,1200,550);
   


        getContentPane().add(bag);
        bag.setBounds(0,-100,1200,1200);



    }

    void aksi()
    {
      
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub


		        beranda br = new beranda();
		        br.Komponenvisual();
		        br.aksi();
		        dispose();

			}
		});
  
    
    next.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				   tentang br = new tentang();
			        br.Komponenvisual();
			        br.aksi();
			        dispose();

			}
		});
  }

    public static void main(String[] args) {

        about2 br = new about2();
        br.Komponenvisual();
        br.aksi();

    }
}
