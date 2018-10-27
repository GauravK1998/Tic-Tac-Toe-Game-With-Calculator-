import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class tola1 extends JFrame 
{
	public static void main(String args[])
	{
		ImageIcon i1 = new ImageIcon("images//tic1.png");
		ImageIcon i2 = new ImageIcon("images//cal1.png");
		ImageIcon i7 = new ImageIcon("images//game.png");
		
	                 JFrame  j1 = new JFrame();
		j1.setContentPane(new JLabel(i7));
		j1.setSize(600,600);
		j1.getContentPane().setBackground(Color.white);
		j1.setTitle("RAJA Application");
		j1.setVisible(true);
		j1.setLayout(null);
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		j1.add(b1);
		j1.add(b2);
		b1.setIcon(i1);
		b2.setIcon(i2);
		b1.setBounds(0,0,200,200);
		b2.setBounds(200,0,200,200);
		Red1 red1=new Red1();
		b1.addActionListener(red1); 
		Red2 red2=new Red2();
		b2.addActionListener(red2); 
		
		
		
		
	}
	
}
		class Red1 implements ActionListener
		{	
		public void actionPerformed(ActionEvent e)
	 	{int k=0;
		if(k==0){
		tola obj = new tola();
		obj.tola();
		
		k=1;
		}
		}
		}
		class Red2 implements ActionListener
		{	
		public void actionPerformed(ActionEvent e)
	 	{
		rajag obj = new rajag();
		obj.rajag();
		}
		}
class tola extends Frame
{
	int gk=0;	
	JFrame j;
	JLabel L1,L2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	ImageIcon i1,i2,i3,i4,i5,i6,i7;
	
	void tola()
	{
		
		j = new JFrame();
		j.setSize(800,800);
		j.getContentPane().setBackground(Color.white);
		j.setTitle("Tic Tac Toe");
		j.setVisible(true);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f1 = new Font("Adobe Caslon Pro",Font.BOLD,30);
		L1 = new JLabel();
		L2 = new JLabel();
 
		i1  = new  ImageIcon("images//c1.jpg");
		i2 = new ImageIcon("images//z1.png");
		i3 = new ImageIcon("images//g2.png");
		i4 = new ImageIcon("images//t1.png");
		i5 = new ImageIcon("images//reset.jpg");
		i6 = new ImageIcon("images//back.png");
		i7 = new ImageIcon("images//game1.jpg");
		j.setContentPane(new JLabel(i7));
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		L1.setBounds(150,0,255,255);
		L2.setBounds(420,0,300,100);
		b1.setBounds(150,255,150,150);
		b2.setBounds(300,255,150,150);
		b3.setBounds(450,255,150,150);
		b4.setBounds(150,405,150,150);
		b5.setBounds(300,405,150,150);
		b6.setBounds(450,405,150,150);
		b7.setBounds(150,555,150,150);
		b8.setBounds(300,555,150,150);
		b9.setBounds(450,555,150,150);
		b10.setBounds(420,86,166,169);
		b11.setBounds(0,650,128,128);	
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		j.add(b5);
		j.add(b6);
		j.add(b7);
		j.add(b8);
		j.add(b9);
		j.add(L1);
		j.add(L2);
		j.add(b10);
		j.add(b11);
		b11.setIcon(i6);
		b1.setIcon(i3);
		b2.setIcon(i3);
		b3.setIcon(i3);
		b4.setIcon(i3);
		b5.setIcon(i3);
		b6.setIcon(i3);
		b7.setIcon(i3);
		b8.setIcon(i3);
		b9.setIcon(i3);
		b10.setIcon(i5);
		L1.setIcon(i4);
		L2.setText("Tic TaC Toe");
		L2.setFont(f1);
		
		Red1 red1 = new Red1();
		Red2 red2 = new Red2();
		Red3 red3 = new Red3();
		Red4 red4=new Red4();
		Red5 red5=new Red5();
		Red6 red6=new Red6();
		Red7 red7=new Red7();
		Red8 red8=new Red8();
		Red9 red9=new Red9();
		Red10 red10=new Red10();
		Red11 red11=new Red11();
		b1.addActionListener(red1); 
		b2.addActionListener(red2);
		b3.addActionListener(red3);
		b4.addActionListener(red4);
		b5.addActionListener(red5);
		b6.addActionListener(red6);
		b7.addActionListener(red7);
		b8.addActionListener(red8);
		b9.addActionListener(red9);
		b10.addActionListener(red10);	
		b11.addActionListener(red11);	
}
		class Red1 implements ActionListener
		{	
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b1)
		{
			
			if(gk == 0 )
			{
			
			b1.setIcon(i1);
			gk=1;
			
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(j,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			
			}//end red 1 c
			else if(gk == 1)
			{
			b1.setIcon(i2);
			gk = 0;

			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}//end else if
			else
			{
			int km=2;
			}
		
		}//end if
		}//class main
		}// class red
	
		class Red2 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b2)
		{
			if(gk == 0 )
			{
			b2.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}

			}
			else if(gk == 1)
			{
			b2.setIcon(i2);
			gk=0;
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
		
			}
			else
			{
			int km=2;
			}
			
		
		
		}//end if
		}//class main
		}// class red
		class Red3 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b3)
		{
	
			if(gk == 0 )
			{
			b3.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}

			}
			else if(gk == 1)
			{
			b3.setIcon(i2);
			gk = 0;
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
		
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red4 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b4)
		{
	
			if(gk == 0 )
			{
			b4.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}

			}
			else if(gk == 1)
			{
			b4.setIcon(i2);
			gk = 0;
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red5 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b5)
		{
	
			if(gk == 0 )
			{
			b5.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else if(gk == 1)
			{
			b5.setIcon(i2);
			gk = 0;
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red6 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b6)
		{
	
			if(gk == 0 )
			{
			b6.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else if(gk == 1)
			{
			b6.setIcon(i2);
			gk = 0;
				if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red7 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b7)
		{
	
			if(gk == 0 )
			{
			b7.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else if(gk == 1)
			{
			b7.setIcon(i2);
			gk = 0;
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red8 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b8)
		{
	
			if(gk == 0 )
			{
			b8.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else if(gk == 1)
			{
			b8.setIcon(i2);
			gk = 0;
			
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red
		class Red9 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
	 	{
		if(e.getSource() == b9)
		{
	
			if(gk == 0 )
			{
			b9.setIcon(i1);
			gk=1;
			if(b1.getIcon() == i1 && b2.getIcon() == i1 && b3.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i1 && b5.getIcon() == i1 && b6.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i1 && b8.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i1 && b4.getIcon() == i1 && b7.getIcon() == i1 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i1 && b5.getIcon() == i1 && b8.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b6.getIcon() == i1 && b9.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i1 && b5.getIcon() == i1 && b9.getIcon() == i1 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i1 && b5.getIcon() == i1 && b7.getIcon() == i1)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else if(gk == 1)
			{
			b9.setIcon(i2);
			gk = 0;
			
			if(b1.getIcon() == i2 && b2.getIcon() == i2 && b3.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b4.getIcon() == i2 && b5.getIcon() == i2 && b6.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b7.getIcon() == i2 && b8.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			if(b1.getIcon() == i2 && b4.getIcon() == i2 && b7.getIcon() == i2 )
			{			
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b2.getIcon() == i2 && b5.getIcon() == i2 && b8.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b6.getIcon() == i2 && b9.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if( b1.getIcon() == i2 && b5.getIcon() == i2 && b9.getIcon() == i2 )
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else if(b3.getIcon() == i2 && b5.getIcon() == i2 && b7.getIcon() == i2)
			{
			JOptionPane.showMessageDialog(tola.this,"!!!YOU won!!! click reset");
			}
			else
			{
			b7.getIcon();
			}
			}
			else
			{
			int km=2;
			}
		

		
		}//end if
		}//class main
		}// class red	
		class Red10 implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
		{
		b1.setIcon(i3);
		b2.setIcon(i3);
		b3.setIcon(i3);
		b4.setIcon(i3);
		b5.setIcon(i3);
		b6.setIcon(i3);
		b7.setIcon(i3);
		b8.setIcon(i3);
		b9.setIcon(i3);
		
		}
		}
		class Red11 implements ActionListener
		{	
		public void actionPerformed(ActionEvent e)
	 	{int k=1;
		if(k==1){
		String[] args = {};
		tola1.main(args);
		k=0;
		}}
		}
}

		