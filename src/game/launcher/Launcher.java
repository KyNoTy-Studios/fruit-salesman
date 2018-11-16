package game.launcher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import game.FruitSalesman;

public class Launcher 
{
	private static void Launch(){

		String[] optionsList = new String[] {"800x600 (16:9)", "Test-Res"};
		JComboBox<String> optionsBox = new JComboBox<>(optionsList);
		
		JFrame frame = new JFrame("Launcher");
		JButton setter = new JButton("PLAY");

		setter.addActionListener((ActionEvent event) -> {
			new FruitSalesman().start();
			frame.dispose();
		});

		optionsBox.setPreferredSize(new Dimension(40,60));

		frame.add(new JLabel(new ImageIcon("logo.png")));
		frame.add(optionsBox, BorderLayout.SOUTH);
		frame.add(setter, BorderLayout.NORTH);
		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(() -> Launch());
	}
}