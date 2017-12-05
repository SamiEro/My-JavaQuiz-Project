package javaquiz;

	import javax.swing.JFrame;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	import javax.swing.JMenu;
	import javax.swing.JComboBox;
	import javax.swing.JTextField;

import javax.swing.JLabel;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class QuizGUI extends JFrame {
		
		private Question1 answer1;
		private Question2 answer2;
		private Question3 answer3;
		private Question4 answer4;
		private Question5 answer5;
		private Question6 answer6;
		private Question7 answer7;
		private Question8 answer8;
		private Question9 answer9;
		private Question10 answer10;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		public QuizGUI() {
			
			setBounds(0,0,700,600); // JFrames size
			setLocationRelativeTo(null); // Centering Jframe
			getContentPane().setLayout(null);
			
			// sets a label for question 1
			JLabel lbl = new JLabel("1. Which city is the capital of Finland?");
			lbl.setBounds(10, 11, 290, 20);
			getContentPane().add(lbl);
			
			// sets up a dropdown box with answer options for question 1
			JComboBox<String> comboBox_3 = new JComboBox<String>();
			comboBox_3.setBounds(10, 42, 165, 26);
			getContentPane().add(comboBox_3);
			comboBox_3.addItem("Helsinki");
			comboBox_3.addItem("Tampere");
			comboBox_3.addItem("Oulu");
			
			// sets a submit button button for question 1 that locks after answering and shows pop up window
			JButton button_4 = new JButton("submit");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer1 = new Question1(comboBox_3.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer1.greet());			
					if(answer1.greet()=="Correct!") {textField_1.setText("Correct answer!");}else if(answer1.greet()!="Correct!"){textField_1.setText("Correct answer: Helsinki");}
					comboBox_3.setEnabled(false);
				}
			});
			button_4.setBounds(185, 42, 115, 29);
			getContentPane().add(button_4);
			
			// sets a textfield that shows message after the questing has been answered
						textField_1 = new JTextField();
						textField_1.setEditable(false);
						textField_1.setColumns(10);
						textField_1.setBounds(10, 80, 290, 20);
						getContentPane().add(textField_1);
			
			// sets a label for question 2
			JLabel label = new JLabel("2. The famous fictional character Garfield is a...");
			label.setBounds(10, 111, 290, 20);
			getContentPane().add(label);
			
			// sets up a dropdown box with answer options for question 2
			JComboBox<String> comboBox = new JComboBox<String>();
			comboBox.setBounds(10, 141, 165, 26);
			getContentPane().add(comboBox);
			comboBox.addItem("dog");
			comboBox.addItem("cat");
			comboBox.addItem("parrot");
			
			// sets a submit button button for question 2 that locks after answering and shows pop up window
			JButton button = new JButton("submit");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer2 = new Question2(comboBox.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer2.greet());			
					if(answer2.greet()=="Correct!") {textField_2.setText("Correct answer!");}else if(answer2.greet()!="Correct!"){textField_2.setText("Correct answer: cat");}
					comboBox.setEnabled(false);
				}
			});
			button.setBounds(185, 140, 115, 29);
			getContentPane().add(button);
			
			// sets a textfield that shows message after the questing has been answered
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(10, 182, 290, 20);
			getContentPane().add(textField_2);
			
			// sets a label for question 3
			JLabel label_1 = new JLabel("3. The Beatles was formed in");
			label_1.setBounds(10, 213, 239, 20);
			getContentPane().add(label_1);
			
			// sets up a dropdown box with answer options for question 3
			JComboBox<String> comboBox_1 = new JComboBox<String>();
			comboBox_1.setBounds(10, 244, 165, 26);
			getContentPane().add(comboBox_1);
			comboBox_1.addItem("1956");
			comboBox_1.addItem("1958");
			comboBox_1.addItem("1960");
			
			// sets a submit button button for question 3 that locks after answering and shows pop up window
			JButton button_2 = new JButton("submit");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer3 = new Question3(comboBox_1.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer3.greet());			
					if(answer3.greet()=="Correct!") {textField_3.setText("Correct answer!");}else if(answer3.greet()!="Correct!"){textField_3.setText("Correct answer: 1960");}
					comboBox_1.setEnabled(false);
				}
			});
			button_2.setBounds(185, 243, 115, 29);
			getContentPane().add(button_2);
			
			// sets a textfield that shows message after the questing has been answered
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(10, 281, 290, 20);
			getContentPane().add(textField_3);
			
			// sets a label for question 3
			JLabel label_2 = new JLabel("4. Which country won the FIFA World Cup in 2014?");
			label_2.setBounds(10, 312, 290, 20);
			getContentPane().add(label_2);
			
			// sets up a dropdown box with answer options for question 4
			JComboBox<String> comboBox_2 = new JComboBox<String>();
			comboBox_2.setBounds(10, 336, 165, 26);
			getContentPane().add(comboBox_2);
			comboBox_2.addItem("Brazil");
			comboBox_2.addItem("Germany");
			comboBox_2.addItem("Argentina");
			
			// sets a submit button button for question 4 that locks after answering and shows pop up window
			JButton button_3 = new JButton("submit");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer4 = new Question4(comboBox_2.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer4.greet());			
					if(answer4.greet()=="Correct!") {textField_4.setText("Correct answer!");}else if(answer4.greet()!="Correct!"){textField_4.setText("Correct answer: Germany");}
					comboBox_2.setEnabled(false);
				}
			});
			
			button_3.setBounds(185, 335, 115, 29);
			getContentPane().add(button_3);
			
			// sets a textfield that shows message after the questing has been answered
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(10, 373, 290, 20);
			getContentPane().add(textField_4);
			
			// sets a label for question 5
			JLabel label_3 = new JLabel("5. Who wrote the novel Gone with the Wind?");
			label_3.setBounds(10, 404, 290, 20);
			getContentPane().add(label_3);
			
			// sets up a dropdown box with answer options for question 5
			JComboBox<String> comboBox_4 = new JComboBox<String>();
			comboBox_4.setBounds(10, 435, 165, 26);
			getContentPane().add(comboBox_4);
			comboBox_4.addItem("Margaret Mitchell");
			comboBox_4.addItem("Stephen King");
			comboBox_4.addItem("Mark Twain");
			
			// sets a submit button button for question 5 that locks after answering and shows pop up window
			JButton button_5 = new JButton("submit");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer5 = new Question5(comboBox_4.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer5.greet());			
					if(answer5.greet()=="Correct!") {textField_5.setText("Correct answer!");}else if(answer5.greet()!="Correct!"){textField_5.setText("Correct answer: Margaret Mitchell");}
					comboBox_4.setEnabled(false);
				}
			});
			button_5.setBounds(185, 435, 115, 29);
			getContentPane().add(button_5);
			
			// sets a textfield that shows message after the questing has been answered
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBounds(10, 472, 290, 20);
			getContentPane().add(textField_5);
			
			// sets a label for question 6			
			JLabel label_4 = new JLabel("6. The capital of the U.S. state of Tennessee is... ");
			label_4.setBounds(343, 11, 290, 20);
			getContentPane().add(label_4);
			
			// sets up a dropdown box with answer options for question 6
			JComboBox<String> comboBox_5 = new JComboBox<String>();
			comboBox_5.setBounds(343, 42, 165, 26);
			getContentPane().add(comboBox_5);
			comboBox_5.addItem("Austin");
			comboBox_5.addItem("Nashville");
			comboBox_5.addItem("Denver");
			
			// sets a submit button button for question 6 that locks after answering and shows pop up window
			JButton button_6 = new JButton("submit");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer6 = new Question6(comboBox_5.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer6.greet());			
					if(answer6.greet()=="Correct!") {textField_6.setText("Correct answer!");}else if(answer6.greet()!="Correct!"){textField_6.setText("Correct answer: Nashville");}
					comboBox_5.setEnabled(false);
				}
			});
			button_6.setBounds(518, 41, 115, 29);
			getContentPane().add(button_6);
			
			// sets a textfield that shows message after the questing has been answered
			textField_6 = new JTextField();
			textField_6.setEditable(false);
			textField_6.setColumns(10);
			textField_6.setBounds(343, 80, 290, 20);
			getContentPane().add(textField_6);
			
			// sets a label for question 7
			JLabel label_5 = new JLabel("7. What kind of weapon is a falchion? ");
			label_5.setBounds(343, 111, 290, 20);
			getContentPane().add(label_5);
			
			// sets up a dropdown box with answer options for question 7
			JComboBox<String> comboBox_6 = new JComboBox<String>();
			comboBox_6.setBounds(343, 141, 165, 26);
			getContentPane().add(comboBox_6);
			comboBox_6.addItem("A spear");
			comboBox_6.addItem("A dagger");
			comboBox_6.addItem("A sword");
			
			// sets a submit button button for question 7 that locks after answering and shows pop up window
			JButton button_7 = new JButton("submit");
			button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				answer7 = new Question7(comboBox_6.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane, answer7.greet());			
				if(answer7.greet()=="Correct!") {textField_7.setText("Correct answer!");}else if(answer7.greet()!="Correct!"){textField_7.setText("Correct answer: A sword");}
				comboBox_6.setEnabled(false);
			}
		});
			button_7.setBounds(518, 140, 115, 29);
			getContentPane().add(button_7);
			
			// sets a textfield that shows message after the questing has been answered
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(343, 182, 290, 20);
			getContentPane().add(textField_7);
			
			// sets a label for question 8
			JLabel label_6 = new JLabel("8. The movie Titanic was directed by? ");
			label_6.setBounds(343, 216, 290, 20);
			getContentPane().add(label_6);
			
			// sets up a dropdown box with answer options for question 8
			JComboBox<String> comboBox_7 = new JComboBox<String>();
			comboBox_7.setBounds(343, 244, 165, 26);
			getContentPane().add(comboBox_7);
			comboBox_7.addItem("James Cameron");
			comboBox_7.addItem("Steven Spielberg");
			comboBox_7.addItem("Woody Allen");
			
			// sets a submit button button for question 8 that locks after answering and shows pop up window
			JButton button_8 = new JButton("submit");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer8 = new Question8(comboBox_7.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer8.greet());			
					if(answer8.greet()=="Correct!") {textField_8.setText("Correct answer!");}else if(answer8.greet()!="Correct!"){textField_8.setText("Correct answer: James Cameron");}
					comboBox_7.setEnabled(false);
				}
			});
			button_8.setBounds(518, 244, 115, 29);
			getContentPane().add(button_8);
			
			// sets a textfield that shows message after the questing has been answered
			textField_8 = new JTextField();
			textField_8.setEditable(false);
			textField_8.setColumns(10);
			textField_8.setBounds(343, 281, 290, 20);
			getContentPane().add(textField_8);
			
			// sets a label for question 9
			JLabel label_7 = new JLabel("9. 9 x 7 = ?");
			label_7.setBounds(343, 315, 290, 20);
			getContentPane().add(label_7);
			
			// sets up a dropdown box with answer options for question 9
			JComboBox<String> comboBox_8 = new JComboBox<String>();
			comboBox_8.setBounds(343, 339, 165, 26);
			getContentPane().add(comboBox_8);
			comboBox_8.addItem("54");
			comboBox_8.addItem("63");
			comboBox_8.addItem("72");
			
			// sets a submit button button for question 9 that locks after answering and shows pop up window
			JButton button_9 = new JButton("submit");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer9 = new Question9(comboBox_8.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer9.greet());			
					if(answer9.greet()=="Correct!") {textField_9.setText("Correct answer!");}else if(answer9.greet()!="Correct!"){textField_9.setText("Correct answer: 63");}
					comboBox_8.setEnabled(false);
				}
			});
			button_9.setBounds(518, 338, 115, 29);
			getContentPane().add(button_9);
			
			// sets a textfield that shows message after the questing has been answered
			textField_9 = new JTextField();
			textField_9.setEditable(false);
			textField_9.setColumns(10);
			textField_9.setBounds(343, 373, 290, 20);
			getContentPane().add(textField_9);
			
			// sets a label for question 10
			JLabel label_8 = new JLabel("10. Did you like this quiz?");
			label_8.setBounds(343, 404, 290, 20);
			getContentPane().add(label_8);
			
			// sets up a dropdown box with answer options for question 10
			JComboBox<String> comboBox_9 = new JComboBox<String>();
			comboBox_9.setBounds(343, 435, 165, 26);
			getContentPane().add(comboBox_9);
			comboBox_9.addItem("No");
			comboBox_9.addItem("Yes");
			comboBox_9.addItem("Maybe");
			
			// sets a submit button button for question 10 that locks after answering and shows pop up window
			JButton button_10 = new JButton("submit");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					answer10 = new Question10(comboBox_9.getSelectedItem().toString());
					JOptionPane.showMessageDialog(rootPane, answer10.greet());			
					if(answer10.greet()=="Correct!") {textField_10.setText("Correct answer!");}else if(answer10.greet()!="Correct!"){textField_10.setText("Correct answer: Yes");}
					comboBox_9.setEnabled(false);
				}
			});
			button_10.setBounds(518, 434, 115, 29);
			getContentPane().add(button_10);
			
			// sets a textfield that shows message after the questing has been answered
			textField_10 = new JTextField();
			textField_10.setEditable(false);
			textField_10.setColumns(10);
			textField_10.setBounds(343, 472, 290, 20);
			getContentPane().add(textField_10);
			
		}

		public static void main(String[] args) {
			JFrame frame = new QuizGUI();
			frame.setVisible(true);
		}
	}