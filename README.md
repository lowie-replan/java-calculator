Java Swing Expression Calculator
A desktop calculator application built with Java Swing that handles complex arithmetic expressions. Unlike standard step-by-step calculators, this project parses full strings to calculate results using order of operations.

🌟 Features
Expression Parsing: Handles full notation inputs (e.g., 5+5*2).
Advanced Math: Supports Addition, Subtraction, Multiplication, Division, and Exponents (^).
Interactive GUI: * Dark-themed "Digital" interface.

Functional ON/OFF power toggle that enables/disables buttons.

Delete (del) button for character-by-character correction.

Order of Operations: Logic is designed to process exponents first, followed by multiplication/division, and finally addition/subtraction.

📁 Project Structure
The project consists of three main Java files:

Calculator_Gui_Launcher.java: The entry point that initializes the application.

Gui.java: Contains the Swing UI components, layout, and event handling.

Calculator.java: Contains the core logic for string parsing and mathematical calculations.

🛠️ Installation & Running
Clone the repository:

Bash
git clone https://github.com/your-username/your-repo-name.git
Compile the source files:

Bash
javac *.java
Run the application:

Bash
java Calculator_Gui_Launcher
🖥️ How it Works
The calculator uses a StringBuilder to separate digits from operators. It stores them in ArrayLists and iterates through them based on operator priority:

Exponents (^) are calculated first.

Multiplication (*) and Division (/) are processed left-to-right.

Addition (+) and Subtraction (-) are processed last.

🎨 UI Preview
Background: Dark Gray

Display: Gray with White "Digital" font.

Buttons: Color-coded (Orange for Clear/Equal, Green for Power, Cyan for Operators).
