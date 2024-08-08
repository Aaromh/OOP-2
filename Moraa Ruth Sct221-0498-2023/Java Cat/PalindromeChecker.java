import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        // Create the GUI frame
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        
        // Create the text field for user input
        JTextField numberField = new JTextField(10);
        
        // Create the label to display output
        JLabel resultLabel = new JLabel("");
        
        // Create the button and add ActionListener to handle click events
        JButton checkButton = new JButton("Output");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = numberField.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText("Palindrome");
                } else {
                    resultLabel.setText("Not palindrome");
                }
            }
        });
        
        // Create a panel with GridBagLayout to arrange components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // First row: Label and TextField
        gbc.gridx = 0; // column 0
        gbc.gridy = 0; // row 0
        panel.add(new JLabel("Enter the number:"), gbc);

        gbc.gridx = 1; // column 1
        panel.add(numberField, gbc);

        // Second row: Button and Result Label
        gbc.gridx = 0; // column 0
        gbc.gridy = 1; // row 1
        panel.add(checkButton, gbc);

        gbc.gridx = 1; // column 1
        panel.add(resultLabel, gbc);
        
        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public static boolean isPalindrome(String number) {
        int len = number.length();
        for (int i = 0; i < len / 2; i++) {
            if (number.charAt(i) != number.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}