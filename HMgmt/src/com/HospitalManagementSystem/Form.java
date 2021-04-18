package com.HospitalManagementSystem;
import java.awt.*;
import javax.swing.*;

public class Form extends JFrame {
	JButton DepBtn;
    JButton DocBtn;
    JButton NurseBtn;
    JButton ReceptionBtn;
    JLabel goBullet1;
    JLabel goBullet2;
    JLabel goBullet3;
    JLabel goBullet4;
    JPanel panel1;
    JLabel theLogin;
    JLabel theTitle; 
    
	public Form() {        
        panel1 = new JPanel();
        theTitle = new JLabel();
        theLogin = new JLabel();
        DepBtn = new JButton();
        goBullet1 = new JLabel();
        goBullet2 = new JLabel();
        goBullet3 = new JLabel();
        DocBtn = new JButton();
        NurseBtn = new JButton();
        ReceptionBtn = new JButton();
        goBullet4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        theTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); 
        theTitle.setForeground(new java.awt.Color(255, 255, 255));
        theTitle.setHorizontalAlignment(SwingConstants.CENTER);
        theTitle.setText("Hospital Management System");

        theLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        theLogin.setHorizontalAlignment(SwingConstants.RIGHT);
        theLogin.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/LoginBtn.jpg"))); 

        DepBtn.setBackground(new java.awt.Color(0, 0, 0));
        DepBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        DepBtn.setText("Department");
        DepBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        DepBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepBtnActionPerformed(evt);
            }
        });

        goBullet1.setFont(new java.awt.Font("Tahoma", 2, 48)); 
        goBullet1.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/bullet_go.png"))); 

        goBullet2.setFont(new java.awt.Font("Tahoma", 2, 48)); 
        goBullet2.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/bullet_go.png"))); 

        goBullet3.setFont(new java.awt.Font("Tahoma", 2, 48)); 
        goBullet3.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/bullet_go.png"))); 

        DocBtn.setBackground(new java.awt.Color(0, 0, 0));
        DocBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        DocBtn.setText("Doctor");
        DocBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        DocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocBtnActionPerformed(evt);
            }
        });

        NurseBtn.setBackground(new java.awt.Color(0, 0, 0));
        NurseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        NurseBtn.setText("Nurse");
        NurseBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        NurseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NurseBtnActionPerformed(evt);
            }
        });

        ReceptionBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReceptionBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        ReceptionBtn.setText("Reception");
        ReceptionBtn.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ReceptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceptionBtnActionPerformed(evt);
            }
        });

        goBullet4.setFont(new java.awt.Font("Tahoma", 2, 48)); 
        goBullet4.setIcon(new ImageIcon(getClass().getResource("/com/HospitalManagementSystem/imgs/bullet_go.png"))); 

        GroupLayout panel1Layout = new GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(theLogin, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goBullet1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepBtn, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(goBullet2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocBtn, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(goBullet3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NurseBtn, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(ReceptionBtn, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(goBullet4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(theTitle, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(DepBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DocBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NurseBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReceptionBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(goBullet1)
                                .addGap(30, 30, 30)
                                .addComponent(goBullet2)
                                .addGap(30, 30, 30)
                                .addComponent(goBullet3)
                                .addGap(30, 30, 30)
                                .addComponent(goBullet4))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(theLogin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setVisible(true);
    }

    private void DepBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	Login toLogin = new Login("department");
    }

    private void DocBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	Login toLogin = new Login("doctor");
    }

    private void NurseBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	Login toLogin = new Login("nurse");
    }

    private void ReceptionBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	Login toLogin = new Login("reception");
    }
    public static void main(String args[]) {
        Form form = new Form();
    }      
}
