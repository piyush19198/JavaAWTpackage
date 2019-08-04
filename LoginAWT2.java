package com.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Login_AWT_2 extends Panel{
	
	private static final long serialVersionUID = 1L;
	
	Label lblLoginName, lblPassword;
	TextField txtLoginName, txtPassword;
	Button btnOk, btnCancel;
	
	Panel panelMain, panelLogin, panelButton;
	
	public Login_AWT_2(){
		super();
		
		lblLoginName = new Label("Login Name");
		lblPassword = new Label("Password");
		
		txtLoginName = new TextField(10);
		txtPassword = new TextField(10);
		
		btnOk = new Button("OK");
		btnCancel = new Button("Cancel");
		
		panelMain = new Panel();
		panelLogin = new Panel();
		panelButton = new Panel();
		
		panelLogin.add(lblLoginName);
		panelLogin.add(txtLoginName);
		panelLogin.add(lblPassword);
		panelLogin.add(txtPassword);
		
		panelButton.add(btnOk);
		panelButton.add(btnCancel);
		
		panelMain.setLayout(new BorderLayout());
		panelMain.add(panelLogin, BorderLayout.CENTER);
		panelMain.add(panelButton, BorderLayout.SOUTH);	
	}
	
	public void main(){
		Frame frame = new Frame("AWT Login");
		frame.setVisible(true);
		frame.add(new Login_AWT_2());
		frame.pack();
		frame.setResizable(false);
	}
}
