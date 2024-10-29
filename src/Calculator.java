import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberbuttons = new JButton[10];
    JButton[] functionbuttons = new JButton[12];
    JButton addButton, subButton, mulButton, divButton;
    JButton deciButton, equiButton, delButton, clrButton, squButton, sqrtButton, negButton;

    JPanel panel;
    Font myfont = new Font("Serif", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 630);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 370, 50);
        textfield.setFont(myfont);
        textfield.setEditable(false);

        // Initialize buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equiButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        squButton = new JButton("²");
        deciButton = new JButton(".");
        sqrtButton = new JButton("√");
        negButton = new JButton("(-)");

        // Add function buttons to the array
        functionbuttons[0] = addButton;
        functionbuttons[1] = subButton;
        functionbuttons[2] = mulButton;
        functionbuttons[3] = divButton;
        functionbuttons[4] = equiButton;
        functionbuttons[5] = delButton;
        functionbuttons[6] = clrButton;
        functionbuttons[7] = squButton;
        functionbuttons[8] = deciButton;
        functionbuttons[9] = sqrtButton;
        functionbuttons[10] = negButton;

        // Setup function button properties
        for (int i = 0; i < 11; i++) {
            functionbuttons[i].addActionListener(this);
            functionbuttons[i].setFont(myfont);
            functionbuttons[i].setFocusable(false);
        }

        // Setup number button properties
        for (int i = 0; i < 10; i++) {
            numberbuttons[i] = new JButton(String.valueOf(i));
            numberbuttons[i].addActionListener(this);
            numberbuttons[i].setFont(myfont);
            numberbuttons[i].setFocusable(false);
        }

        // Setup button positions for extra functions
        delButton.setBounds(60, 520, 170, 50);
        clrButton.setBounds(240, 520, 170, 50);
        squButton.setBounds(60, 460, 110, 50);
        sqrtButton.setBounds(180, 460, 110, 50);
        negButton.setBounds(300, 460, 110, 50);

        // Create a panel for number and operator buttons
        panel = new JPanel();
        panel.setBounds(60, 100, 350, 350);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add number and operator buttons to the panel
        panel.add(numberbuttons[1]);
        panel.add(numberbuttons[2]);
        panel.add(numberbuttons[3]);
        panel.add(addButton);
        panel.add(numberbuttons[4]);
        panel.add(numberbuttons[5]);
        panel.add(numberbuttons[6]);
        panel.add(subButton);
        panel.add(numberbuttons[7]);
        panel.add(numberbuttons[8]);
        panel.add(numberbuttons[9]);
        panel.add(mulButton);
        panel.add(deciButton);
        panel.add(numberbuttons[0]);
        panel.add(equiButton);
        panel.add(divButton);

        // Add components to the frame
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(squButton);
        frame.add(sqrtButton);
        frame.add(textfield);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle number button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberbuttons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        // Handle decimal button click with validation
        if (e.getSource() == deciButton) {
            if (!textfield.getText().contains(".")) {
                textfield.setText(textfield.getText().concat("."));
            }
        }

        // Handle operator buttons
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }

        // Handle equals button click
        if (e.getSource() == equiButton) {
            num2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textfield.setText("Error");
                        return;
                    }
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        // Handle clear button click
        if (e.getSource() == clrButton) {
            textfield.setText("");
        }

        // Handle delete button click
        if (e.getSource() == delButton) {
            String text = textfield.getText();
            if (!text.isEmpty()) {
                textfield.setText(text.substring(0, text.length() - 1));
            }
        }

        // Handle negate button click
        if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }

        // Handle square root button click
        if (e.getSource() == sqrtButton) {
            double number = Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.sqrt(number)));
        }

        // Handle square button click
        if (e.getSource() == squButton) {
            double num = Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(num * num));
        }
    }
}
