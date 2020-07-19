package emailApplication;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmailApp implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel firstNameLabel, lastNameLabel, departmentLabel, emailLabel, passwordLabel;
	private TextField firstNameTextF, lastNameTextF, departmentTextF, displayEmail, displayPassword;
	private JButton createButton;

	public EmailApp() {

		// Creates the frame and panel for the GUI
		frame = new JFrame();

		frame.setLocation(700, 300);
		frame.setSize(400, 400);
		frame.setTitle("Email Application");

		// Creates first name user field on the GUI

		firstNameLabel = new JLabel("Enter user first name");
		firstNameTextF = new TextField(30);
		firstNameTextF.setColumns(45);

		// Creates last name user field on the GUI

		lastNameLabel = new JLabel("Enter user last name");
		lastNameTextF = new TextField(30);
		lastNameTextF.setColumns(45);

		// Creates department user field on the GUI

		departmentLabel = new JLabel("Enter user department name");
		departmentTextF = new TextField(30);
		departmentTextF.setColumns(45);

		// Creates the "create" button to create a user's email address

		createButton = new JButton("Create");
		createButton.addActionListener(this);

		// Creates a text field and label to display the user's newly created email
		// address
		emailLabel = new JLabel("User email");
		displayEmail = new TextField(30);
		displayEmail.setColumns(45);

		// Creates text field and label to display password
		passwordLabel = new JLabel("User password");
		displayPassword = new TextField(30);
		displayPassword.setColumns(45);

		// Adds all components to the panel to display to GUI
		panel = new JPanel();
		panel.add(firstNameLabel);
		panel.add(firstNameTextF);
		panel.add(lastNameLabel);
		panel.add(lastNameTextF);
		panel.add(departmentLabel);
		panel.add(departmentTextF);
		panel.add(createButton);
		panel.add(emailLabel);
		panel.add(displayEmail);
		panel.add(passwordLabel);
		panel.add(displayPassword);

		// Adds panel to GUI frame

		frame.add(panel);
		// frame.pack();
		// Sets default close operation to exit and sets the frame to visible

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new EmailApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Creates object from the Email class to create the users new email

		Email newEmail = new Email(firstNameTextF.getText(), lastNameTextF.getText(), departmentTextF.getText());

		// Create email method

		newEmail.createEmail();
		newEmail.setRandomPassword();
		/*
		 * Gets the user's newly created email and password then sends it to the
		 * displayEmail and displayPassword text field on the GUI
		 */
		displayEmail.setText(newEmail.getEmail());
		displayPassword.setText(newEmail.getPassword());

	}

}
