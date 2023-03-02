package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class calculator implements Action {

    JFrame jf;
    JLabel displaylabel;
    JButton sevenbutton;
    JButton eighButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton subButton;
    JButton addButton;
    JButton clearButton;

    boolean isOperatorclicked = false;
    String oldValue;

    public calculator() {
        jf = new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displaylabel = new JLabel();
        displaylabel.setBounds(30, 50, 540, 40);
        displaylabel.setBackground(Color.gray);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.white);
        jf.add(displaylabel);

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 130, 80, 80);
        sevenbutton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);

        eighButton = new JButton("8");
        eighButton.setBounds(130, 130, 80, 80);
        eighButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        eighButton.addActionListener(this);
        jf.add(eighButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        subButton = new JButton("-");
        subButton.setBounds(330, 330, 80, 80);
        subButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        subButton.addActionListener(this);
        jf.add(subButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add(addButton); 

        clearButton = new JButton("clr");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sevenbutton) {
            if (isOperatorclicked) {
                displaylabel.setText("7");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "7");
            }
        }

        else if (e.getSource() == eighButton) {
            if (isOperatorclicked) {
                displaylabel.setText("8");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isOperatorclicked) {
                displaylabel.setText("9");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "9");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorclicked) {
                displaylabel.setText("4");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorclicked) {
                displaylabel.setText("5");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorclicked) {
                displaylabel.setText("6");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorclicked) {
                displaylabel.setText("1");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorclicked) {
                displaylabel.setText("2");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorclicked) {
                displaylabel.setText("3");
                isOperatorclicked = false;
            } else {
                displaylabel.setText(displaylabel.getText() + "3");
            }
        } else if (e.getSource() == dotButton) {
            displaylabel.setText(displaylabel.getText() + ".");
        } else if (e.getSource() == zeroButton) {
            displaylabel.setText(displaylabel.getText() + "0");
        } else if (e.getSource() == equalButton) {
            String newValue = displaylabel.getText();

            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            float result = oldValueF + newValueF;

            displaylabel.setText(result + "");

        } else if (e.getSource() == divButton) {
            displaylabel.setText(displaylabel.getText() + "/");
        } else if (e.getSource() == mulButton) {
            displaylabel.setText(displaylabel.getText() + "x");
        } else if (e.getSource() == subButton) {
            displaylabel.setText(displaylabel.getText() + "-");
        } else if (e.getSource() == addButton) {
            // displaylabel.setText(displaylabel.getText() + "+");
            isOperatorclicked = true;
            oldValue = displaylabel.getText();
            displaylabel.setText("");
        } else if (e.getSource() == clearButton) {
            displaylabel.setText("");
        }

    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValue'");
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putValue'");
    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEnabled'");
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPropertyChangeListener'");
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePropertyChangeListener'");
    }
}
