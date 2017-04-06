/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swastik.erp;

import javax.swing.*;

/**
 *
 * @author rajug
 */
public class Swastik extends javax.swing.JFrame {
   
    /**
     * Creates new form NewJFrame
     */
    public Swastik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        erpMnuFile = new javax.swing.JMenu();
        erpMnuStudents = new javax.swing.JMenuItem();
        erpMnuExit = new javax.swing.JMenuItem();
        erpMnuHelp = new javax.swing.JMenu();
        erpMnuHelpContent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        erpMnuAbout = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP - Swastik College");
        setExtendedState(6);

        jLabel1.setIcon(new javax.swing.ImageIcon("/var/www/html/swastik-java/Swastik7Swing/build/classes/com/swastik/erp/swastik.png")); // NOI18N

        erpMnuFile.setText("File");

        erpMnuStudents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        erpMnuStudents.setBackground(new java.awt.Color(242, 240, 240));
        erpMnuStudents.setMnemonic('S');
        erpMnuStudents.setText("Students");
        erpMnuStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erpMnuStudentsActionPerformed(evt);
            }
        });
        erpMnuFile.add(erpMnuStudents);

        erpMnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        erpMnuExit.setMnemonic('E');
        erpMnuExit.setText("Exit");
        erpMnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erpMnuExitActionPerformed(evt);
            }
        });
        erpMnuFile.add(erpMnuExit);

        jMenuBar1.add(erpMnuFile);

        erpMnuHelp.setText("Help");

        erpMnuHelpContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        erpMnuHelpContent.setMnemonic('H');
        erpMnuHelpContent.setText("Help Content");
        erpMnuHelpContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erpMnuHelpContentActionPerformed(evt);
            }
        });
        erpMnuHelp.add(erpMnuHelpContent);
        erpMnuHelp.add(jSeparator1);

        erpMnuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        erpMnuAbout.setMnemonic('A');
        erpMnuAbout.setText("About");
        erpMnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erpMnuAboutActionPerformed(evt);
            }
        });
        erpMnuHelp.add(erpMnuAbout);

        jMenuBar1.add(erpMnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void erpMnuStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erpMnuStudentsActionPerformed
        new Student().setVisible(true);
    }//GEN-LAST:event_erpMnuStudentsActionPerformed
    
    private void exitErp(){
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure to exit?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            System.exit(0); // closes all the windows
        }
    }
    
    private void erpMnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erpMnuExitActionPerformed
        exitErp();
    }//GEN-LAST:event_erpMnuExitActionPerformed

    private void erpMnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erpMnuAboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_erpMnuAboutActionPerformed

    private void erpMnuHelpContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erpMnuHelpContentActionPerformed
        new HelpContent().setVisible(true);
    }//GEN-LAST:event_erpMnuHelpContentActionPerformed
    
//    private javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(new String[]);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem erpMnuAbout;
    private javax.swing.JMenuItem erpMnuExit;
    private javax.swing.JMenu erpMnuFile;
    private javax.swing.JMenu erpMnuHelp;
    private javax.swing.JMenuItem erpMnuHelpContent;
    private javax.swing.JMenuItem erpMnuStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}