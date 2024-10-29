
# Java Calculator Application
A GUI-based Calculator built using Java's Swing and AWT libraries. This simple calculator supports basic arithmetic operations, as well as additional functions like square, square root, and negation.

## Features
Arithmetic Operations: 
Addition, Subtraction, Multiplication, Division.
Square Root:Compute the square root of a number.

Square: Compute the square of a number.

Negate: Change the sign of a number.

Decimal Input:Handle floating-point numbers.

Clear & Delete:Clear the screen or delete the last digit.

Error Handling:Prevent division by zero.
## Getting Started
### Prerequisites
#### Java Development Kit (JDK):
Make sure the JDK is installed. You candownload it here if it's not already installed.
Compilation and Execution
Clone or download the repository to your local machine.
Navigate to the project directory in the terminal or command prompt.
#### Compile the code using:
bash:   javac Calculator.java
#### Run the program using:
bash:
java Calculator
## How to Use
### Start the application: 
A window with a calculator interface will appear.******
Enter numbers: Use the number buttons (0-9) to input values.

Perform operations:
Click an operator (+, -, *, /) to select an operation.
Press = to view the result.

Square/Square Root: Use the ² or √ buttons for advanced calculations.

Negate a value: Use the (-) button to switch between positive and negative numbers.

Delete: Use DEL to remove the last digit.

Clear: Use CLR to clear the entire input.

## Code Overview
The calculator application is structured as follows:

### GUI Components:
Uses JFrame for the main window and JPanel to organize buttons.

Event Handling: Implements ActionListener to respond to button clicks.

Layout: Buttons are arranged in a GridLayout within a JPanel for neat alignment.

Basic Operators: Addition, Subtraction, Multiplication, and Division.

Extra Functions: Square, Square Root, and Negate.

### Known Issues
Multiple Operators: The current implementation allows only two operands per calculation.

Chaining operations (e.g., 5 + 3 * 2) requires manual input between steps.

Floating-Point Precision: Some floating-point results might have precision issues (e.g., 0.1 + 0.2).

#### Contributing
Feel free to fork this repository and submit pull requests for improvements or additional features!
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
