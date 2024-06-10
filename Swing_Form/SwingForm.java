package com.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.ResultSet;

import java.sql.PreparedStatement;

public class SwingForm implements ActionListener{
	 
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4,t5;
	SwingForm(){
		f = new JFrame("Swing Form");
		f.setSize(380, 460);
		f.setVisible(true);
//		f.setLayout(new FlowLayout()); 
//		f.setLayout(new GridLayout(9,2));
		f.setLayout(null);
		f.setResizable(false);
		
		l1 = new JLabel("ID : ");
		l2 = new JLabel("First Name : ");
		l3 = new JLabel("Last Name : ");
		l4 = new JLabel("Email : ");
		l5 = new JLabel("Mobile : ");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		
		b1 = new JButton("INSERT");
		b2 = new JButton("UPDATE");
		b3 = new JButton("DELETE");
		b4 = new JButton("SEARCH");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setBounds(50, 50, 150, 20);
		l2.setBounds(50, 100, 150, 20);
		l3.setBounds(50, 150, 150, 20);
		l4.setBounds(50, 200, 150, 20);
		l5.setBounds(50, 250, 150, 20);
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		b1.setBounds(50, 300, 100, 20);
		b2.setBounds(200, 300, 100, 20);
		b3.setBounds(50, 350, 100, 20);
		b4.setBounds(200, 350, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new SwingForm();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_Demo","root","");
				String sql = "Insert into student(Fname, Lname, Email, Mobile) values (?,?,?,?)";
				PreparedStatement pst=conn.prepareStatement(sql);
				if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty()) {
					JOptionPane.showMessageDialog(f, "There is nothing to insert data");
				}else {
				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setLong(4, Long.parseLong(t5.getText()));
				pst.executeUpdate();
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Data Inserted Succefully");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource()==b2) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_Demo","root","");
				String sql = "Update student set Fname=?, Lname=?, email=?, mobile=? where id = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setLong(4, Long.parseLong(t5.getText()));
				pst.setInt(5, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Data updated Succefully");
				
				
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		}
		else if(e.getSource()==b3) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_Demo","root", "");
				String sql = "Delete from student where id = ?";
				PreparedStatement pst =  conn.prepareStatement(sql);
				pst.setString(1, t1.getText());
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				pst.executeUpdate();
				JOptionPane.showMessageDialog(f, "Data deleted Succesfully");
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource()==b4) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_Demo","root","");
				String sql = "Select * from student where id = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					t2.setText(rs.getString("Fname"));
					t3.setText(rs.getString("Lname"));
					t4.setText(rs.getString("Email"));
					t5.setText(rs.getString("Mobile"));
				}
				else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Id not found");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
