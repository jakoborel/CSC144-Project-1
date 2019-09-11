import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainControl extends JFrame implements OperatorListener{
	private DigitsPanel digitsPanel;
	private OperationsPanel operationsPanel;
	private TextPanel textPanel;
	private HistoryPanel historyPanel;
	
	public MainControl() {
		super("Calculator");
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setVisible(true);
		
		add(digitsPanel, BorderLayout.CENTER);
		add(operationsPanel, BorderLayout.EAST);
		add(textPanel, BorderLayout.NORTH);
		add(historyPanel, BorderLayout.WEST);
	}
	
	public static void main(String[] args) {
		new MainControl();
	}
}
