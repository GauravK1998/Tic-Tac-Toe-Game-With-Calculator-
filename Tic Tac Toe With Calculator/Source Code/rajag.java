import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowListener;  

	class rajag extends JFrame {
  
	public void rajag()
	{
	JFrame f = new JFrame("MY CALCULATOR");
	Label l1 = new Label("First Number");
	Label l2 = new Label("Second number");
	Label l3 = new Label();
	ImageIcon i1 = new ImageIcon(("images//game2.png"));
	JLabel bg = new JLabel( new ImageIcon("images//bal.png"));
	f.setContentPane(new JLabel(i1));
	Font f1 = new Font("Adobe Caslon Pro",Font.BOLD,20);

	TextField t1 = new TextField();
	
	TextField t2 = new TextField();
	
	Button b1 = new Button("Add");
	Button b2 = new Button("Minus");
	Button b3 = new Button("Multiply");
	Button b4 = new Button("Divide");
	Button b5 = new Button("Reset");
	Button b6 = new Button("Back");
	//For plus
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			
			double a,b,c;
			try
			{
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a+b;
				String m = String.valueOf(c);
				l3.setText(m);	
			}
			catch(NumberFormatException e)
			{
				l3.setText("Enter the value");
				l3.setForeground(Color.red);
			}
		}
	});
	//for Minus
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			double a,b,c;
			try
			{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a-b;
			String m = String.valueOf(c);
			l3.setText(m);
			}
			catch(NumberFormatException e)
			{
			l3.setText("Enter the value");
			l3.setForeground(Color.red);
			}
		}	
	});
	//For Multiply
	b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			double a,b,c;
			try
			{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a*b;
			String m = String.valueOf(c);
			l3.setText(m);
			}
			catch(NumberFormatException e)
			{
				l3.setText("Enter the value");
				l3.setForeground(Color.red);
			}
	
		}
	});
	//For divide
	b4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			double a,b,c;
			try
			{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a/b;
			String m = String.valueOf(c);
			l3.setText(m);
			}	
			catch(NumberFormatException e)
			{
				l3.setText("Enter the value");
				l3.setForeground(Color.red);
				
			}
			
		}
			
	});
	b5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{	
			l3.setText("Your result are here!");
			l3.setForeground(Color.black);
			
		}
	});
	/*b6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
    			//new tola1();
		}
	}*/
	
	/*addWindowListener(new WindowAdapter()
	{  
            		public void windowClosing(WindowEvent e) {  
                		dispose();  
            	}  		
        	});*/
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                
	l1.setBounds(100,150,127,20);
	t1.setBounds(240,150,100,30);
	
	l2.setBounds(100,190,155,20);
	t2.setBounds(260,190,100,30);
	
	b1.setBounds(50,230,100,50);
	b2.setBounds(150,230,100,50);
	b3.setBounds(250,230,100,50);
	b4.setBounds(350,230,100,50);
	l3.setBounds(50,20,350,20);
	bg.setBounds(50,0,301,300);
	b5.setBounds(160,350,100,50);
	b6.setBounds(280,350,100,50);

	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(l3);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(bg);
	f.add(b5);
	f.add(b6);
	
	b1.setFont(f1);
	b2.setFont(f1);
	b3.setFont(f1);
	b4.setFont(f1);
	l1.setFont(f1);
	l2.setFont(f1);
	t1.setFont(f1);
	t2.setFont(f1);
	l3.setFont(f1);
	b5.setFont(f1);
	b6.setFont(f1);
	Red red = new Red();
	b6.addActionListener(red);
	l3.setBackground(Color.white);
	l3.setForeground(Color.black);
	//f.setBackground(Color.cyan);
	f.getContentPane().setBackground(Color.white);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	l3.setText("Your result are here!");
       
        }
	class Red implements ActionListener
	{
	public void actionPerformed(ActionEvent ae)
	{
	String[] args = {};
		tola1.main(args);
	} 
	}
	public static void main(String args[])
	{
		rajag obj = new rajag();
		obj.rajag();
	}
}