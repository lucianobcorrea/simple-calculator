package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JTextField;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class telaPrincipal {

	private JFrame mainFrame;
	private JTextField textField;
	private double num, resp;
	private int op;
	private JTextField textFieldResult;
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
					btnVezes, btnResult, btnSoma, btnMenos, btnDiv, btnPonto, btnDel, btnClean;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal window = new telaPrincipal();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaPrincipal() {
		initialize();
	}

	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setType(Type.UTILITY);
		mainFrame.setAlwaysOnTop(true);
		mainFrame.setResizable(false);
		mainFrame.setTitle("Calculadora");
		mainFrame.setBounds(100, 100, 450, 350);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		
		btnVezes = new JButton("*");
		btnVezes.setBackground(Color.WHITE);
		btnVezes.setFont(new Font("Arial", Font.BOLD, 18));
		btnVezes.setBounds(227, 191, 55, 40);
		mainFrame.getContentPane().add(btnVezes);
		
		btnVezes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "*");
				op = 4;
				textField.setText("");
				textFieldResult.setText(num + "*");
			} });
		
		btnMenos = new JButton("-");
		btnMenos.setBackground(Color.WHITE);
		btnMenos.setFont(new Font("Arial", Font.BOLD, 18));
		btnMenos.setBounds(227, 138, 55, 40);
		mainFrame.getContentPane().add(btnMenos);
		
		btnMenos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "-");
				op = 2;
				textField.setText("");
				textFieldResult.setText(num + "-");
			} });
		
		btnSoma = new JButton("+");
		btnSoma.setBackground(Color.WHITE);
		btnSoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSoma.setBounds(227, 87, 55, 40);
		mainFrame.getContentPane().add(btnSoma);
		
		btnSoma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "+");
				op = 1;
				textField.setText("");
				textFieldResult.setText(num + "+");
			} });
		
		btnDiv = new JButton("/");
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(227, 242, 55, 40);
		mainFrame.getContentPane().add(btnDiv);
		
		btnDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "/");
				op = 3;
				textField.setText("");
				textFieldResult.setText(num + "/");
			} });
		
		btnResult = new JButton("=");
		btnResult.setBackground(SystemColor.activeCaption);
		btnResult.setForeground(Color.WHITE);
		btnResult.setFont(new Font("Arial", Font.PLAIN, 18));
		btnResult.setBounds(162, 242, 55, 40);
		mainFrame.getContentPane().add(btnResult);
		
		btnResult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank())
					textField.setText("0");
				opAritmeticas();
				textFieldResult.setText("");
			} });
		
		btn7 = new JButton("7");
		btn7.setBackground(SystemColor.controlHighlight);
		btn7.setFont(new Font("Arial", Font.PLAIN, 18));
		btn7.setBounds(32, 87, 55, 40);
		mainFrame.getContentPane().add(btn7);
		
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("7");
				}else {
					textField.setText(textField.getText() + "7");
				}
			} });
		
		btn8 = new JButton("8");
		btn8.setBackground(SystemColor.controlHighlight);
		btn8.setFont(new Font("Arial", Font.PLAIN, 18));
		btn8.setBounds(97, 87, 55, 40);
		mainFrame.getContentPane().add(btn8);
		
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("8");
				}else {
					textField.setText(textField.getText() + "8");
				}
			} });
		
		btn9 = new JButton("9");
		btn9.setBackground(SystemColor.controlHighlight);
		btn9.setFont(new Font("Arial", Font.PLAIN, 18));
		btn9.setBounds(162, 87, 55, 40);
		mainFrame.getContentPane().add(btn9);
		
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("9");
				}else {
					textField.setText(textField.getText() + "9");
				}
			} });
		
		btn4 = new JButton("4");
		btn4.setBackground(SystemColor.controlHighlight);
		btn4.setFont(new Font("Arial", Font.PLAIN, 18));
		btn4.setBounds(32, 138, 55, 40);
		mainFrame.getContentPane().add(btn4);
		
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("4");
				}else {
					textField.setText(textField.getText() + "4");
				}
			} });
		
		btn5 = new JButton("5");
		btn5.setBackground(SystemColor.controlHighlight);
		btn5.setFont(new Font("Arial", Font.PLAIN, 18));
		btn5.setBounds(97, 138, 55, 40);
		mainFrame.getContentPane().add(btn5);
		
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("5");
				}else {
					textField.setText(textField.getText() + "5");
				}
			} });
		
		btn6 = new JButton("6");
		btn6.setBackground(SystemColor.controlHighlight);
		btn6.setFont(new Font("Arial", Font.PLAIN, 18));
		btn6.setBounds(162, 138, 55, 40);
		mainFrame.getContentPane().add(btn6);
		
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("6");
				}else {
					textField.setText(textField.getText() + "6");
				}
			} });
		
		btn1 = new JButton("1");
		btn1.setBackground(SystemColor.controlHighlight);
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		btn1.setBounds(32, 191, 55, 40);
		mainFrame.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("1");
				}else {
					textField.setText(textField.getText() + "1");
				}
			} });
		
		btn2 = new JButton("2");
		btn2.setBackground(SystemColor.controlHighlight);
		btn2.setFont(new Font("Arial", Font.PLAIN, 18));
		btn2.setBounds(97, 191, 55, 40);
		mainFrame.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("2");
				}else {
					textField.setText(textField.getText() + "2");
				}
			} });
		
		btn3 = new JButton("3");
		btn3.setBackground(SystemColor.controlHighlight);
		btn3.setFont(new Font("Arial", Font.PLAIN, 18));
		btn3.setBounds(162, 191, 55, 40);
		mainFrame.getContentPane().add(btn3);
		
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("3");
				}else {
					textField.setText(textField.getText() + "3");
				}
			} });
		
		btn0 = new JButton("0");
		btn0.setBackground(SystemColor.controlHighlight);
		btn0.setFont(new Font("Arial", Font.PLAIN, 18));
		btn0.setBounds(97, 242, 55, 40);
		mainFrame.getContentPane().add(btn0);
		
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contentEquals("0")) {
					textField.setText("0");
				}else {
					textField.setText(textField.getText() + "0");
				}			
			} });
		
		btnPonto = new JButton(".");
		btnPonto.setBackground(SystemColor.controlHighlight);
		btnPonto.setForeground(Color.BLACK);
		btnPonto.setFont(new Font("Arial", Font.BOLD, 18));
		btnPonto.setBounds(32, 242, 55, 40);
		mainFrame.getContentPane().add(btnPonto);
		
		btnPonto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + ".");
			} });
		
		btnDel = new JButton("<=");
		btnDel.setForeground(Color.BLACK);
		btnDel.setFont(new Font("Arial", Font.PLAIN, 15));
		btnDel.setBackground(Color.WHITE);
		btnDel.setBounds(292, 87, 109, 40);
		mainFrame.getContentPane().add(btnDel);
		
		btnDel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() > 0)
					textField.setText((String) textField.getText().subSequence(0, textField.getText().length() - 1));
			} });
		
		btnClean = new JButton("C");
		btnClean.setForeground(SystemColor.activeCaption);
		btnClean.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClean.setBackground(Color.WHITE);
		btnClean.setBounds(292, 138, 109, 93);
		mainFrame.getContentPane().add(btnClean);
		
		btnClean.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textFieldResult.setText("");
				if(textField.getText().contentEquals("")) {
					textField.setText("0");
				}
			} });
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Arial", Font.PLAIN, 25));
		textField.setBounds(32, 32, 369, 49);
		mainFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setFont(new Font("Arial", Font.PLAIN, 11));
		textFieldResult.setForeground(Color.BLACK);
		textFieldResult.setBackground(SystemColor.activeCaption);
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(292, 11, 109, 20);
		mainFrame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
	}
	
	public void opAritmeticas() {
		switch(op) {
		case 1: 
			resp = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resp));
			break;
		case 2:
			resp = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resp));
			break;
		case 3: 
			resp = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resp));
			break;
		case 4:
			resp = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resp));
			break;
		}
	}
}
