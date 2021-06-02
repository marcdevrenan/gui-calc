package edu.gui_calc.core;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char mathOperator;

    private JPanel GuiCalculator;
    private JTextField textScreen;
    private JButton btnNine;
    private JButton btnEight;
    private JButton btnSeven;
    private JButton btnSix;
    private JButton btnFive;
    private JButton btnFour;
    private JButton btnThree;
    private JButton btnTwo;
    private JButton btnOne;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnClear;

    public GuiCalculator() {
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textScreen.getText() + btnNine.getText();
                textScreen.setText(btnNineText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textScreen.getText() + btnEight.getText();
                textScreen.setText(btnEightText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textScreen.getText() + btnSeven.getText();
                textScreen.setText(btnSevenText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textScreen.getText() + btnSix.getText();
                textScreen.setText(btnSixText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textScreen.getText() + btnFive.getText();
                textScreen.setText(btnFiveText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textScreen.getText() + btnFour.getText();
                textScreen.setText(btnFourText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textScreen.getText() + btnThree.getText();
                textScreen.setText(btnThreeText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textScreen.getText() + btnTwo.getText();
                textScreen.setText(btnTwoText);
            }
        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textScreen.getText() + btnOne.getText();
                textScreen.setText(btnOneText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textScreen.getText() + btnZero.getText();
                textScreen.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    textScreen.setText("0.");
                } else if (textScreen.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textScreen.getText() + btnPoint.getText();
                    textScreen.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnPlus.getText();
                getOperator(btnText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMinus.getText();
                getOperator(btnText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMultiply.getText();
                getOperator(btnText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnDivide.getText();
                getOperator(btnText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textScreen.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textScreen.getText());
                        break;
                    case 'x':
                        total2 = total1 * Double.parseDouble(textScreen.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textScreen.getText());
                        break;
                }
                textScreen.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textScreen.setText("");
            }
        });
    }

    private void getOperator(String btnText) {
        mathOperator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textScreen.getText());
        textScreen.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiCalculator");
        frame.setContentPane(new GuiCalculator().GuiCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
