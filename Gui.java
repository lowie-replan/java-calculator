import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui extends JFrame implements ActionListener {

    JTextField field;
    JButton clearButton;
    JButton deleteButton;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton exponentButton;
    JButton zeroButton;
    JButton divideButton;
    JButton multiplicationButton;
    JButton subtractionButton;
    JButton additionButton;
    JButton dotButton;
    JButton equalButton;
    JButton offButton;
    JButton lightButton;
    JButton onButton;

    public Gui() {

        field = new JTextField();
        field.setBounds(20, 50, 345, 120);
        field.setBackground(Color.GRAY);
        field.setForeground(Color.WHITE);
        field.setHorizontalAlignment(SwingConstants.RIGHT);
        field.setAlignmentY(0);
        field.setFont(new Font("DIGITAL", Font.PLAIN, 50));

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Serif", Font.BOLD, 20));
        clearButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        clearButton.setForeground(Color.ORANGE);
        clearButton.setBackground(Color.LIGHT_GRAY);
        clearButton.setOpaque(false);
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);
        clearButton.setBounds(15, 250, 80, 40);

        offButton = new JButton("off");
        offButton.setFont(new Font("Serif", Font.BOLD, 20));
        offButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        offButton.setForeground(Color.GREEN);
        offButton.setBackground(Color.LIGHT_GRAY);
        offButton.setOpaque(false);
        offButton.setFocusable(false);
        offButton.addActionListener(this);
        offButton.setBounds(65, 190, 40, 40);

        onButton = new JButton("on");
        onButton.setFont(new Font("Serif", Font.BOLD, 20));
        onButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        onButton.setForeground(Color.GREEN);
        onButton.setBackground(Color.LIGHT_GRAY);
        onButton.setOpaque(false);
        onButton.setFocusable(false);
        onButton.addActionListener(this);
        onButton.setBounds(15, 190, 40, 40);

        lightButton = new JButton();
        lightButton.setBackground(Color.GREEN);
        lightButton.setFocusable(false);
        lightButton.addActionListener(this);
        lightButton.setBounds(115, 205, 15, 15);

        deleteButton = new JButton("del");
        deleteButton.setFont(new Font("Serif", Font.BOLD, 20));
        deleteButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        deleteButton.setForeground(Color.ORANGE);
        deleteButton.setBackground(Color.ORANGE);
        deleteButton.setOpaque(false);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(this);
        deleteButton.setBounds(105, 250, 80, 40);

        sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Serif", Font.BOLD, 20));
        sevenButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        sevenButton.setForeground(Color.WHITE);
        sevenButton.setBackground(Color.white);
        sevenButton.setOpaque(false);
        sevenButton.setFocusable(false);
        sevenButton.addActionListener(this);
        sevenButton.setBounds(15, 310, 80, 40);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Serif", Font.BOLD, 20));
        eightButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        eightButton.setForeground(Color.WHITE);
        eightButton.setBackground(Color.white);
        eightButton.setOpaque(false);
        eightButton.setFocusable(false);
        eightButton.addActionListener(this);
        eightButton.setBounds(105, 310, 80, 40);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Serif", Font.BOLD, 20));
        nineButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        nineButton.setForeground(Color.WHITE);
        nineButton.setBackground(Color.white);
        nineButton.setOpaque(false);
        nineButton.setFocusable(false);
        nineButton.addActionListener(this);
        nineButton.setBounds(195, 310, 80, 40);

        divideButton = new JButton("/");
        divideButton.setFont(new Font("Serif", Font.BOLD, 20));
        divideButton.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        divideButton.setForeground(Color.CYAN);
        divideButton.setBackground(Color.cyan);
        divideButton.setOpaque(false);
        divideButton.setFocusable(false);
        divideButton.addActionListener(this);
        divideButton.setBounds(285, 250, 85, 40);

        multiplicationButton = new JButton("x");
        multiplicationButton.setFont(new Font("CONSOLAS", Font.PLAIN, 20));
        multiplicationButton.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        multiplicationButton.setForeground(Color.CYAN);
        multiplicationButton.setBackground(Color.cyan);
        multiplicationButton.setOpaque(false);
        multiplicationButton.setFocusable(false);
        multiplicationButton.addActionListener(this);
        multiplicationButton.setBounds(285, 310, 85, 40);

        exponentButton = new JButton("^");
        exponentButton.setFont(new Font("Serif", Font.BOLD, 20));
        exponentButton.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        exponentButton.setForeground(Color.CYAN);
        exponentButton.setBackground(Color.cyan);
        exponentButton.setOpaque(false);
        exponentButton.setFocusable(false);
        exponentButton.addActionListener(this);
        exponentButton.setBounds(195, 250, 80, 40);

        subtractionButton = new JButton("-");
        subtractionButton.setFont(new Font("Serif", Font.BOLD, 20));
        subtractionButton.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        subtractionButton.setForeground(Color.CYAN);
        subtractionButton.setBackground(Color.cyan);
        subtractionButton.setOpaque(false);
        subtractionButton.setFocusable(false);
        subtractionButton.addActionListener(this);
        subtractionButton.setBounds(285, 370, 85, 40);

        additionButton = new JButton("+");
        additionButton.setFont(new Font("Serif", Font.BOLD, 20));
        additionButton.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        additionButton.setForeground(Color.CYAN);
        additionButton.setBackground(Color.cyan);
        additionButton.setOpaque(false);
        additionButton.setFocusable(false);
        additionButton.addActionListener(this);
        additionButton.setBounds(285, 430, 85, 40);

        fourButton = new JButton("4");
        fourButton.setFont(new Font("Serif", Font.BOLD, 20));
        fourButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        fourButton.setForeground(Color.WHITE);
        fourButton.setBackground(Color.white);
        fourButton.setOpaque(false);
        fourButton.setFocusable(false);
        fourButton.addActionListener(this);
        fourButton.setBounds(15, 370, 80, 40);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Serif", Font.BOLD, 20));
        fiveButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        fiveButton.setForeground(Color.WHITE);
        fiveButton.setBackground(Color.white);
        fiveButton.setOpaque(false);
        fiveButton.setFocusable(false);
        fiveButton.addActionListener(this);
        fiveButton.setBounds(105, 370, 80, 40);

        sixButton = new JButton("6");
        sixButton.setFont(new Font("Serif", Font.BOLD, 20));
        sixButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        sixButton.setForeground(Color.WHITE);
        sixButton.setBackground(Color.white);
        sixButton.setOpaque(false);
        sixButton.setFocusable(false);
        sixButton.addActionListener(this);
        sixButton.setBounds(195, 370, 80, 40);

        oneButton = new JButton("1");
        oneButton.setFont(new Font("Serif", Font.BOLD, 20));
        oneButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        oneButton.setForeground(Color.WHITE);
        oneButton.setBackground(Color.white);
        oneButton.setOpaque(false);
        oneButton.setFocusable(false);
        oneButton.addActionListener(this);
        oneButton.setBounds(15, 430, 80, 40);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Serif", Font.BOLD, 20));
        twoButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        twoButton.setForeground(Color.WHITE);
        twoButton.setBackground(Color.white);
        twoButton.setOpaque(false);
        twoButton.setFocusable(false);
        twoButton.addActionListener(this);
        twoButton.setBounds(105, 430, 80, 40);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Serif", Font.BOLD, 20));
        threeButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        threeButton.setForeground(Color.WHITE);
        threeButton.setBackground(Color.white);
        threeButton.setOpaque(false);
        threeButton.setFocusable(false);
        threeButton.addActionListener(this);
        threeButton.setBounds(195, 430, 80, 40);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Serif", Font.BOLD, 20));
        zeroButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        zeroButton.setForeground(Color.WHITE);
        zeroButton.setBackground(Color.white);
        zeroButton.setOpaque(false);
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(this);
        zeroButton.setBounds(15, 490, 80, 40);

        dotButton = new JButton(".");
        dotButton.setFont(new Font("Serif", Font.BOLD, 20));
        dotButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        dotButton.setForeground(Color.WHITE);
        dotButton.setBackground(Color.white);
        dotButton.setOpaque(false);
        dotButton.setFocusable(false);
        dotButton.addActionListener(this);
        dotButton.setBounds(105, 490, 80, 40);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Serif", Font.BOLD, 20));
        equalButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        equalButton.setForeground(Color.ORANGE);
        equalButton.setBackground(Color.ORANGE);
        equalButton.setOpaque(false);
        equalButton.setFocusable(false);
        equalButton.addActionListener(this);
        equalButton.setBounds(195, 490, 175, 40);

        setSize(400, 600);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        int w = this.getWidth();
        int h = this.getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screen.width / 2) - (w / 2), ((screen.height / 2) - (h / 2)), w, h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        add(field);
        add(clearButton);
        add(onButton);
        add(offButton);
        add(sevenButton);
        add(eightButton);
        add(nineButton);
        add(sixButton);
        add(threeButton);
        add(divideButton);
        add(multiplicationButton);
        add(exponentButton);
        add(subtractionButton);
        add(additionButton);
        add(deleteButton);
        add(fiveButton);
        add(fourButton);
        add(sixButton);
        add(oneButton);
        add(twoButton);
        add(threeButton);
        add(dotButton);
        add(zeroButton);
        add(lightButton);
        add(equalButton);
    }

    public static void removeAddItem(int sign_index, double answer, ArrayList<Double> myNumbers,
            ArrayList<Character> operations) {
        operations.remove(sign_index);
        myNumbers.remove(sign_index);
        myNumbers.remove(sign_index);
        myNumbers.add(sign_index, answer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            field.setText("");
        }
        if (e.getSource() == onButton) {
            lightButton.setBackground(Color.GREEN);
            clearButton.setEnabled(true);
            deleteButton.setEnabled(true);
            exponentButton.setEnabled(true);
            divideButton.setEnabled(true);
            sevenButton.setEnabled(true);
            eightButton.setEnabled(true);
            nineButton.setEnabled(true);
            multiplicationButton.setEnabled(true);
            fourButton.setEnabled(true);
            fiveButton.setEnabled(true);
            sixButton.setEnabled(true);
            subtractionButton.setEnabled(true);
            oneButton.setEnabled(true);
            twoButton.setEnabled(true);
            threeButton.setEnabled(true);
            additionButton.setEnabled(true);
            zeroButton.setEnabled(true);
            dotButton.setEnabled(true);
            equalButton.setEnabled(true);
        }
        if (e.getSource() == offButton) {
            lightButton.setBackground(Color.GRAY);
            clearButton.setEnabled(false);
            deleteButton.setEnabled(false);
            exponentButton.setEnabled(false);
            divideButton.setEnabled(false);
            sevenButton.setEnabled(false);
            eightButton.setEnabled(false);
            nineButton.setEnabled(false);
            multiplicationButton.setEnabled(false);
            fourButton.setEnabled(false);
            fiveButton.setEnabled(false);
            sixButton.setEnabled(false);
            subtractionButton.setEnabled(false);
            oneButton.setEnabled(false);
            twoButton.setEnabled(false);
            threeButton.setEnabled(false);
            additionButton.setEnabled(false);
            zeroButton.setEnabled(false);
            dotButton.setEnabled(false);
            equalButton.setEnabled(false);
        }
        if (e.getSource() == deleteButton) {
            String notations = field.getText();
            field.setText("");
            for (int i = 0; i < notations.length() - 1; i++) {
                field.setText(field.getText() + notations.charAt(i));
            }
        }
        if (e.getSource() == exponentButton) {
            field.setText(field.getText().concat("^"));
        }
        if (e.getSource() == divideButton) {
            field.setText(field.getText().concat("/"));
        }
        if (e.getSource() == multiplicationButton) {
            field.setText(field.getText().concat("*"));
        }
        if (e.getSource() == subtractionButton) {
            field.setText(field.getText().concat("-"));
        }
        if (e.getSource() == additionButton) {
            field.setText(field.getText().concat("+"));
        }
        if (e.getSource() == sevenButton) {
            field.setText(field.getText().concat("7"));
        }
        if (e.getSource() == eightButton) {
            field.setText(field.getText().concat("8"));
        }
        if (e.getSource() == nineButton) {
            field.setText(field.getText().concat("9"));
        }
        if (e.getSource() == fourButton) {
            field.setText(field.getText().concat("4"));
        }
        if (e.getSource() == fiveButton) {
            field.setText(field.getText().concat("5"));
        }
        if (e.getSource() == sixButton) {
            field.setText(field.getText().concat("6"));
        }
        if (e.getSource() == oneButton) {
            field.setText(field.getText().concat("1"));
        }
        if (e.getSource() == twoButton) {
            field.setText(field.getText().concat("2"));
        }
        if (e.getSource() == threeButton) {
            field.setText(field.getText().concat("3"));
        }
        if (e.getSource() == zeroButton) {
            field.setText(field.getText().concat("0"));
        }
        if (e.getSource() == dotButton) {
            field.setText(field.getText().concat("."));
        }
        if (e.getSource() == equalButton) {
            String user_input = field.getText();
            ArrayList<Double> myNumbers = new ArrayList<>();
            ArrayList<Character> operations = new ArrayList<>();
            ArrayList<Double> base = new ArrayList<>();
            ArrayList<Double> exponent = new ArrayList<>();
            ArrayList<String> myDigits = new ArrayList<>();
            StringBuilder digits = new StringBuilder();

            for (int i = 0; i < user_input.length(); i++) {
                char c = user_input.charAt(i);
                if (Character.isDigit(c) || c == '.') {
                    digits.append(c);
                } else {
                    myDigits.add(digits.toString());
                    operations.add(c);
                    digits = new StringBuilder();
                }
            }
            myDigits.add(digits.toString());

            for (String elem : myDigits) {
                double n = Double.parseDouble(elem);
                myNumbers.add(n);
            }

            for (int i = 0; i < operations.size(); i++) {
                char sign = operations.get(i);
                int x4 = operations.indexOf(sign);
                double answer;
                if (sign == '^') {
                    exponent.add(myNumbers.get(x4 + 1));
                    base.add(myNumbers.get(x4));
                    answer = myNumbers.get(x4) * myNumbers.get(x4);
                    base.add(answer);
                    while (exponent.get(0) != 2) {
                        double ops = base.get(0) * base.get(1);
                        base.add(ops);
                        base.remove(1);
                        double r = exponent.get(0) - 1;
                        exponent.remove(0);
                        exponent.add(r);
                    }
                    operations.remove(x4);
                    myNumbers.remove(x4);
                    myNumbers.remove(x4);
                    myNumbers.add(x4, base.get(1));
                }
            }

            for (int i = 0; i < operations.size(); i++) {
                char sign = operations.get(i);
                int sign_index = operations.indexOf(sign);
                double answer;
                double n1 = myNumbers.get(sign_index);
                double n2 = myNumbers.get(sign_index + 1);
                if (sign == '*' || sign == '/') {
                    if (sign == '*') {
                        answer = n1 * n2;
                    } else {
                        answer = n1 / n2;
                    }

                    removeAddItem(sign_index, answer, myNumbers, operations);
                    i--;
                }
            }

            for (int i = 0; i < operations.size(); i++) {
                char sign = operations.get(i);
                int sign_index = operations.indexOf(sign);
                double answer;
                double n1 = myNumbers.get(sign_index);
                double n2 = myNumbers.get(sign_index + 1);
                if (sign == '+' || sign == '-') {
                    if (sign == '+') {
                        answer = n1 + n2;
                    } else {
                        answer = n1 - n2;
                    }
                    removeAddItem(sign_index, answer, myNumbers, operations);
                    i--;
                }
            }
            double d = myNumbers.get(0);
            String result = String.valueOf(d);
            field.setText(result);
        }
    }
}
