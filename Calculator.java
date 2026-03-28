import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Notation : ");
            String user_input = s.next();
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
            System.out.println("Answer = " + myNumbers.get(0));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void removeAddItem(int sign_index, double answer, ArrayList<Double> myNumbers,
            ArrayList<Character> operations) {
        operations.remove(sign_index);
        myNumbers.remove(sign_index);
        myNumbers.remove(sign_index);
        myNumbers.add(sign_index, answer);
    }
}
