package game.launcher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import game.FruitSalesman;

public class Launcher 
{
	private static void Launch(){

		String[] optionsList = new String[] {"800x600 (16:9)", "Test-Res"};
		JComboBox<String> optionsBox = new JComboBox<String>(optionsList);
		
		JFrame frame = new JFrame("Launcher");
		JButton setter = new JButton("PLAY");
		setter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
			FruitSalesman fruit = new FruitSalesman();
			frame.dispose();
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionsBox.setPreferredSize(new Dimension(40,60));
		frame.add(new JLabel(new ImageIcon("C:/Users/Kyle/Desktop/fruit-salesman/src/game/launcher/logo.png")));
		frame.add(optionsBox, BorderLayout.SOUTH);
		frame.add(setter, BorderLayout.NORTH);
		
        frame.pack();
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		}
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Launch();
            }
        });
}
}