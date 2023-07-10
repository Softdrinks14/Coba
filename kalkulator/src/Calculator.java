import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JTextField display;
    private JButton ACButton;
    private JButton xButton;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button9;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    private JButton x2Button;
    private JButton button2;
    private JButton a1XButton;
    private JButton x3Button;

    double a,b,result;
    String op;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + a00Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().contains(".")){
                    double mp = Double.parseDouble(display.getText());
                    mp = mp*-1;
                    display.setText(String.valueOf(mp));
                } else {
                    long MP = Long.parseLong(display.getText());
                    MP = MP*-1;
                    display.setText(String.valueOf(MP));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display.getText().contains(".")){
                    display.setText(display.getText() + button20.getText());
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "+";
                display.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "-";
                display.setText("");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "/";
                display.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                op = "*";
                display.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText()) / 100;
                display.setText("");
                display.setText(display.getText() + a);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (display.getText().length() > 0){
                    StringBuilder sb = new StringBuilder(display.getText());
                    sb.deleteCharAt(display.getText().length() - 1);
                    backspace = String.valueOf(sb);
                    display.setText(backspace);
                }
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 1/Double.parseDouble(display.getText());
                display.setText("");
                display.setText(display.getText() + a);
            }
        });

        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                a = a*a;
                display.setText("");
                display.setText(display.getText() + a);
            }
        });

        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                a = a*a*a;
                display.setText("");
                display.setText(display.getText() + a);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(display.getText());
                if (op == "+"){
                    result = a+b;
                    display.setText(String.valueOf(result));
                } else if (op == "-"){
                    result = a-b;
                    display.setText(String.valueOf(result));
                } else if (op == "*") {
                    result = a*b;
                    display.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = a/b;
                    display.setText(String.valueOf(result));
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
