package Kain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.awt.*;



class beranda extends JFrame
{


  
    ImageIcon icon = new ImageIcon("");
    ImageIcon acon = new ImageIcon("");
    ImageIcon econ = new ImageIcon("");
    JButton one = new JButton( icon );
    JButton two = new JButton( acon );
    JButton tre = new JButton( econ );
    JButton back = new JButton();
    JLabel ba = new JLabel(new ImageIcon("image/beek1.png"));
    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JLabel bag = new JLabel(new ImageIcon("image/hd.jpg"));
    JLabel baju1 = new JLabel(new ImageIcon("image/lapor1.png"));
    JLabel cel = new JLabel(new ImageIcon("image/abot1.png"));
    JLabel center = new JLabel(new ImageIcon("image/berand1.png"));
    
    
   

    JPanel pan = new JPanel();

    beranda()
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

        getContentPane().add(baju1);
        baju1.setBounds(-120,50,800,800);
        

        getContentPane().add(cel);
        cel.setBounds(520,50,800,800);
        
        getContentPane().add(center);
        center.setBounds(210,50,800,800);

       

        getContentPane().add(one);
        one.setBounds(180,386,200,120);


        getContentPane().add(two);
        two.setBounds(820,386,200,120);
        
        getContentPane().add(tre);
        tre.setBounds(512,386,200,120);

        getContentPane().add(ba);
        ba.setBounds(-262, 315, 800, 800);
        getContentPane().add(back);
        back.setBounds(100,675,75,80);
        back.setForeground(Color.black);
        back.setFont(new Font("Impact",Font.PLAIN,20));


        getContentPane().add(bag);
        bag.setBounds(0,-100,1200,1200);



    }

    void aksi()
    {
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 homelapor ho = new homelapor();
                 ho.Komponenvisual();
                 ho.aksi();
                

            	
                dispose();

            }
        });
        
        
       tre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                home ho = new home();
                 ho.Komponenvisual();
                 ho.aksi();

			
            	
                dispose();

            }
        });


        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

                about2 br = new about2();
                br.Komponenvisual();
                br.aksi();
					
              
                dispose();

            }
        });
        
        back.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login Lo = new login();
		        Lo.komponenvisual();
		        Lo.aksireaksi();
		        dispose();
			}
		});
    }

    public static void main(String[] args) {

        beranda br = new beranda();
        br.Komponenvisual();
        br.aksi();

    }
}
