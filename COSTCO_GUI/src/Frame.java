import javax.swing.*;


public class Frame extends JFrame {
	

	public Frame(){
		super ("COSTCO Tire Sales Guide");
		
		JPanel pan = new JPanel();
		pan.setLayout(null);
	
		
		JButton start = new JButton("Click to Explore Tires");
		start.setBounds(400,350,200,50);
		pan.add(start);
		
		ImageIcon i = new ImageIcon("Images/michelin.png");
		JLabel label  = new JLabel(i);
		
		
		label.setBounds(280,335,500,500);
		
		
		pan.add(label);
		
		add(pan);
		
//		setBounds(500,120,500,40);
		setSize(500,500);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	

}
