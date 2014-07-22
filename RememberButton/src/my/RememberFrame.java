package my;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class RememberFrame extends JFrame {
	private JButton[] b = new JButton[9]; 

	public RememberFrame() {
		this.setTitle("Remeber buttons");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
		b[0] = new JButton("Click Here");
		b[1] = new JButton("Click Here");
		b[2] = new JButton("Click Here");
		b[3] = new JButton("Click Here");
		b[4] = new JButton("Click Here");
		b[5] = new JButton("Click Here");
		b[6] = new JButton("Click Here");
		b[7] = new JButton("Click Here");
		b[8] = new JButton("Click Here");
		this.getContentPane().setLayout(new GridLayout(3,3));
		this.getContentPane().add(b[0]);
		this.getContentPane().add(b[1]);
		this.getContentPane().add(b[2]);
		this.getContentPane().add(b[3]);
		this.getContentPane().add(b[4]);
		this.getContentPane().add(b[5]);
		this.getContentPane().add(b[6]);
		this.getContentPane().add(b[7]);
		this.getContentPane().add(b[8]);
		
		
		
		
		
		pack();
		setVisible(true);
		
	}

}
