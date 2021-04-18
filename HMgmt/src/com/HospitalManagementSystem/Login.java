package com.HospitalManagementSystem;

import javax.swing.*;
import java.sql.*;

public class Login extends JFrame {
	
	JTextField idField;
    JButton loginBtn;
    JPanel panel2;
    JTextField passwordField;
    JButton regReqBtn;
    JLabel theDefaultAs;
    JLabel theID;
    JLabel theID1;
    JLabel theQuestion;
    JLabel theTitle;
    String iam;
    
    String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=Hospital;integratedSecurity=true;";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs;
    
    public void ConnectMe() {
		try {	
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url);
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"ERROR1: " + ex.toString(), "DataBase Connection Error: ", JOptionPane.ERROR_MESSAGE);
		}
	}	
    public Login(String iAm) {
    	ConnectMe();
    	iam = iAm;
        panel2 = new JPanel();
        theTitle = new JLabel();
        theID = new JLabel();
        theID1 = new JLabel();
        idField = new JTextField();
        passwordField = new JTextField();
        loginBtn = new JButton();
        theQuestion = new JLabel();
        theDefaultAs = new JLabel();
        regReqBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form");
        setPreferredSize(new java.awt.Dimension(932, 521));

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setForeground(new java.awt.Color(255, 255, 255));

        theTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48));
        theTitle.setForeground(new java.awt.Color(255, 255, 255));
        theTitle.setHorizontalAlignment(SwingConstants.CENTER);
        theTitle.setText("Hospital Management System");

        theID.setFont(new java.awt.Font("Tahoma", 1, 18));
        theID.setForeground(new java.awt.Color(255, 255, 255));
        theID.setHorizontalAlignment(SwingConstants.RIGHT);
        theID.setText("ID:  ");

        theID1.setFont(new java.awt.Font("Tahoma", 1, 18));
        theID1.setForeground(new java.awt.Color(255, 255, 255));
        theID1.setHorizontalAlignment(SwingConstants.RIGHT);
        theID1.setText("PASSWORD:  ");

        idField.setFont(new java.awt.Font("Arial Black", 1, 18));

        passwordField.setFont(new java.awt.Font("Arial Black", 1, 18));

        loginBtn.setFont(new java.awt.Font("Arial Black", 1, 18));
        loginBtn.setText("LOG IN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        theQuestion.setFont(new java.awt.Font("Tekton Pro", 3, 18));
        theQuestion.setForeground(new java.awt.Color(255, 255, 255));
        theQuestion.setHorizontalAlignment(SwingConstants.RIGHT);
        theQuestion.setText("Don't Have An Account??   ");

        theDefaultAs.setFont(new java.awt.Font("Monospaced", 1, 18));
        theDefaultAs.setForeground(new java.awt.Color(255, 255, 255));
        theDefaultAs.setHorizontalAlignment(SwingConstants.CENTER);
        regReqBtn.setText("Send Request to DEPARTMENT");
        if(iam == "department") {
        	theDefaultAs.setText("Department");
        	theID.setText("DEP. NAME:  ");
        	regReqBtn.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/register.jpg")));
        }
        else if(iam == "doctor") {
        	theDefaultAs.setText("Doctor");        	
        }
        else if(iam == "nurse") {
        	theDefaultAs.setText("Nurse");
        }
        else if(iam == "reception") {
        	theDefaultAs.setText("Reception");
        }
        else {
        	theDefaultAs.setText("Unknown User");
        }

        regReqBtn.setBackground(new java.awt.Color(0, 0, 0));        
        regReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regReqBtnActionPerformed(evt);
            }
        });

        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(theID, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(theQuestion, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regReqBtn, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(theID1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(theDefaultAs, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theDefaultAs, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(theID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(theID1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(theQuestion, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(regReqBtn)
                        .addGap(43, 43, 43))))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setVisible(true);
    }

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		String sql = "";
		 	      if(iam == "department") {
		 	    	 sql = "select Dep_Name , Password from Department where Dep_Name = ? and Password = ?";  					
		 	      }
		 	      else if(iam == "doctor") {
		 	    	 sql = "select Dr_ID , Password from Doctor where Dr_ID = ? and Password = ?";  							
		 	      }
		 	     else if(iam == "nurse") {
			    	 sql = "select Nu_ID, Password from Nurse where Nu_ID = ? and Password = ?"; 			
			      }
		 	     else if(iam == "reception") {
			    	 sql = "select Reception_Name , Password from Reception where Reception_Name = ? and Password = ?";						
			      }
		 	     else {
		 	    	 JOptionPane.showMessageDialog(null, "Unknown User", "ERROR: ", JOptionPane.ERROR_MESSAGE);
		 	     }
 	      
			 	    PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, idField.getText());
					pst.setString(2, passwordField.getText());
					
					rs = pst.executeQuery();
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, " ID = " + rs.getString(1) + "\n\n Password = " + rs.getString(2));
							setVisible(false);
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Incorrect User Name or Password");
						}
 			} catch (Exception e1) {
 				JOptionPane.showMessageDialog(null, e1.toString(), "Login ERROR: ", JOptionPane.ERROR_MESSAGE);
 			}
 		
    }

    private void regReqBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	if(iam == "department") {
    		RegisterMe reMe = new RegisterMe(con, iam);
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "Request Sent to Department","Request Sent",JOptionPane.INFORMATION_MESSAGE);
    	}
    }
    public static void main(String args[]) {
        
    }   
}
