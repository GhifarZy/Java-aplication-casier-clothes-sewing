package Kain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.awt.*;


class home extends JFrame
{


    ImageIcon icon = new ImageIcon("");
    ImageIcon acon = new ImageIcon("");
    JButton one = new JButton( icon );
    JButton two = new JButton( acon );
    JLabel baju = new JLabel(new ImageIcon("image/toko11.png"));
    JLabel bag = new JLabel(new ImageIcon("image/hd.jpg"));
    JLabel baju1 = new JLabel(new ImageIcon("image/baju1.png"));
    JLabel cel = new JLabel(new ImageIcon("image/celana1.png"));
    JButton back = new JButton();
    JLabel ba = new JLabel(new ImageIcon("image/beek1.png"));
    

    JPanel pan = new JPanel();

    home()
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
        baju1.setBounds(60,40,800,800);

        getContentPane().add(cel);
        cel.setBounds(340,40,800,800);

       

        getContentPane().add(one);
        one.setBounds(370,380,180,120);


        getContentPane().add(two);
        two.setBounds(650,380,180,120);
        
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

               aplikasi_jahit JH = new aplikasi_jahit();
                JH.Komponenvisual();
                JH.aksi();
                dispose();
                

            }
        });


        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            aplikasi_jahit2 JH = new aplikasi_jahit2();
                JH.Komponenvisual();
                JH.aksi();
                dispose();
            

            }
        });
        
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
    }

    public static void main(String[] args) {

        home ho = new home();
        ho.Komponenvisual();
        ho.aksi();

    }
}