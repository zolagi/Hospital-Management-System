package com.HospitalManagementSystem;

import javax.swing.*;

import java.sql.*;

public class RegisterMe extends JFrame {
	
	JTextField NurseIDField;
    JTextField depNameField;
    JTextField drIDField;
    JButton logReqBtn;
    JPanel panel3;
    JTextField passwordField;
    JButton registerBtn;
    JLabel theDefaultAs;
    JLabel theDepName;
    JLabel theDrID;
    JLabel theNurseID;
    JLabel thePassword;
    JLabel theQuestion;
    JLabel theTitle;
    JLabel theTreatmt;
    JLabel theWardName;
    JTextField treatmtField;
    JTextField wNameField;
	
	Connection con;
	Statement stmt = null;
	ResultSet rs;
	String iam;
	
    public RegisterMe(Connection c, String iAm) {   
    	con = c;
    	iam = iAm;
        panel3 = new JPanel();
        theTitle = new JLabel();
        theWardName = new JLabel();
        wNameField = new JTextField();
        theQuestion = new JLabel();
        theDefaultAs = new JLabel();
        logReqBtn = new JButton();
        theDepName = new JLabel();
        depNameField = new JTextField();
        drIDField = new JTextField();
        NurseIDField = new JTextField();
        theNurseID = new JLabel();
        theDrID = new JLabel();
        treatmtField = new JTextField();
        theTreatmt = new JLabel();
        thePassword = new JLabel();
        passwordField = new JTextField();
        registerBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");

        panel3.setBackground(new java.awt.Color(0, 0, 0));
        panel3.setForeground(new java.awt.Color(255, 255, 255));

        theTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48));
        theTitle.setForeground(new java.awt.Color(255, 255, 255));
        theTitle.setHorizontalAlignment(SwingConstants.CENTER);
        theTitle.setText("Hospital Management System");

        theWardName.setFont(new java.awt.Font("Tahoma", 1, 18));
        theWardName.setForeground(new java.awt.Color(255, 255, 255));
        theWardName.setHorizontalAlignment(SwingConstants.RIGHT);
        theWardName.setText("Ward Name:");

        wNameField.setFont(new java.awt.Font("Arial Black", 1, 18));

        theQuestion.setFont(new java.awt.Font("Tekton Pro", 3, 18));
        theQuestion.setForeground(new java.awt.Color(255, 255, 255));
        theQuestion.setHorizontalAlignment(SwingConstants.RIGHT);
        theQuestion.setText("Already Have An Account??   ");

        theDefaultAs.setFont(new java.awt.Font("Monospaced", 1, 18));
        theDefaultAs.setForeground(new java.awt.Color(255, 255, 255));
        theDefaultAs.setHorizontalAlignment(SwingConstants.CENTER);
        theDefaultAs.setText("Department");

        logReqBtn.setBackground(new java.awt.Color(0, 0, 0));
        logReqBtn.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/LoginBtn2.jpg")));
        logReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logReqBtnActionPerformed(evt);
            }
        });

        theDepName.setFont(new java.awt.Font("Tahoma", 1, 18));
        theDepName.setForeground(new java.awt.Color(255, 255, 255));
        theDepName.setHorizontalAlignment(SwingConstants.RIGHT);
        theDepName.setText("Dep. Name:");

        depNameField.setFont(new java.awt.Font("Arial Black", 1, 18));

        drIDField.setFont(new java.awt.Font("Arial Black", 1, 18));

        NurseIDField.setFont(new java.awt.Font("Arial Black", 1, 18));

        theNurseID.setFont(new java.awt.Font("Tahoma", 1, 18));
        theNurseID.setForeground(new java.awt.Color(255, 255, 255));
        theNurseID.setHorizontalAlignment(SwingConstants.RIGHT);
        theNurseID.setText("Nurse ID:");

        theDrID.setFont(new java.awt.Font("Tahoma", 1, 18));
        theDrID.setForeground(new java.awt.Color(255, 255, 255));
        theDrID.setHorizontalAlignment(SwingConstants.RIGHT);
        theDrID.setText("Dr. ID:");

        treatmtField.setFont(new java.awt.Font("Arial Black", 1, 18));

        theTreatmt.setFont(new java.awt.Font("Tahoma", 1, 18));
        theTreatmt.setForeground(new java.awt.Color(255, 255, 255));
        theTreatmt.setHorizontalAlignment(SwingConstants.RIGHT);
        theTreatmt.setText("Treatement:");

        thePassword.setFont(new java.awt.Font("Tahoma", 1, 18));
        thePassword.setForeground(new java.awt.Color(255, 255, 255));
        thePassword.setHorizontalAlignment(SwingConstants.RIGHT);
        thePassword.setText("Password:");

        passwordField.setFont(new java.awt.Font("Arial Black", 1, 18));

        registerBtn.setFont(new java.awt.Font("MV Boli", 1, 24));
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        GroupLayout panel3Layout = new GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(theQuestion, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logReqBtn, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(theDefaultAs, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(theWardName, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addComponent(theDrID, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                            .addComponent(theTreatmt, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addComponent(thePassword, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(drIDField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(theNurseID, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NurseIDField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(wNameField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(theDepName, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depNameField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                            .addComponent(treatmtField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(registerBtn, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theDefaultAs, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(theWardName)
                    .addComponent(wNameField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(theDepName)
                    .addComponent(depNameField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(theDrID)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(drIDField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NurseIDField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(theNurseID))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(treatmtField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(theTreatmt))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(thePassword))))
                .addGap(18, 18, 18)
                .addComponent(registerBtn, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(logReqBtn, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(theQuestion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }
    private void logReqBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Login backToLogin = new Login(iam);
    }
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		String sql = "";
	 	      if(iam == "department") {
	 	    	 sql = "insert into Department(Ward_Name, Dep_Name, Treatement, Dr_ID, Nu_ID, Password) Values(?, ?, ?, ?, ?, ?)";				
	 	      }
	 	      else if(iam == "doctor") {
	 	    	 sql = "Insert into Doctor(Dr_ID, First_Name, Last_Name, Gender, Age, Phone, Addres, Password, Dep_ID, Dep_Name, DoB, Salary) Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";  							
	 	      }
	 	     else if(iam == "nurse") {
		    	 sql = "insert into Nurse(Nu _ID, First_Name, Last_Name, Gender, Age, Phone, Addres, Password, Dep_ID, Room_Num, DoB, Salary) Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 			
		      }
	 	     else if(iam == "reception") {
		    	 sql = "insert into Reception (Reception_Name, Phone, Addres, Password) Values(?, ?, ?, ?)";						
		      }
	 	     else {
	 	    	 JOptionPane.showMessageDialog(null, "Unknown User", "ERROR: ", JOptionPane.ERROR_MESSAGE);
	 	     }
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, wNameField.getText());
				pst.setString(2, depNameField.getText());
				pst.setString(3, drIDField.getText());
				pst.setString(4, NurseIDField.getText());
				pst.setString(5, treatmtField.getText());
				pst.setString(6, passwordField.getText());
				
				try {
					pst.executeQuery();					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "ERROR: " + e1.toString(), "Query Excution ERROR: ", JOptionPane.ERROR_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "You have successfully Registered: ");
				setVisible(false);
				Home welcome = new Home();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "ERROR: " + e2.toString(), "Registration ERROR: ", JOptionPane.ERROR_MESSAGE);
			}
    }
    public static void main(String args[]) {
        
    }    
}
