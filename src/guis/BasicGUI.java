package guis;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BasicGUI {

	
	
	public static void main(String[] args) {
		
		buildGUI();
		
	}
	
	
	public static void buildGUI() {
		
		//create overall frame
		JFrame frame = new JFrame("Basic GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //delete frame when program ends
		frame.setSize(1000, 1000);  //width and height
		
		
		
		
		JLabel label1 = new JLabel("First Lable Ever!!");//create label with text
		label1.setBounds(20, 40, 180, 30); //give it bounds (x, y, width, height)
		frame.add(label1);  //add label to frame
		
		
		final JTextArea fieldInput = new JTextArea("Type Here...");
		fieldInput.setBounds(20, 90, 560, 90); 
		fieldInput.setLineWrap(true);
		frame.add(fieldInput);
		
		
		final JLabel outputLabel5 = new JLabel(fieldInput.getText());
		outputLabel5.setBounds(20, 200, 560, 90);
		frame.add(outputLabel5);
		
		
		//create button
		JButton button1 = new JButton("Press Me!!");
		button1.setBounds(270, 40, 100, 30);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//say what to do when button is pressed
				
				//make the output label say whatever is in the input text box
				outputLabel5.setText(fieldInput.getText());
				
				
			}
			
		});
		frame.add(button1);
	
		
		//create images
		ImageIcon dumbGuyPic = new ImageIcon("src/guis/DumbGuy.jpeg");
		//scale if you want
		ImageIcon scaledImage = new ImageIcon(dumbGuyPic.getImage().getScaledInstance(
				500, 
				500, 
				java.awt.Image.SCALE_SMOOTH));
		
		//set up original
		JLabel pictureLabel1 = new JLabel(scaledImage);
		pictureLabel1.setBounds(500, 350, 
				scaledImage.getIconWidth(),
				scaledImage.getIconHeight());
		
		//set up scaled
		JLabel pictureLabel2 = new JLabel(dumbGuyPic);
		pictureLabel2.setBounds(20, 350, 
				dumbGuyPic.getIconWidth(),
				dumbGuyPic.getIconHeight());
		
		frame.add(pictureLabel1);
		frame.add(pictureLabel2);
		
		
		//place image on button
		JButton dumbGuyButton = new JButton(dumbGuyPic);
		dumbGuyButton.setBounds(600, 40, 
				dumbGuyPic.getIconWidth(),
				dumbGuyPic.getIconHeight());
		frame.add(dumbGuyButton);
		
		
		
		frame.setLayout(null);  //don't use a default layout
		frame.setVisible(true);  //make it visible
		
	}
	
	
	
}
