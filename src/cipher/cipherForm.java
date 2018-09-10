package cipher;

import java.awt.*;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author Armaan Sandhu
 */
public class cipherForm extends javax.swing.JFrame {

    cipherFunction obj = new cipherFunction();
    String filename;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        encryptBtn = new javax.swing.JButton();
        decryptBtn = new javax.swing.JButton();
        switchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        decryptText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        encryptText = new javax.swing.JTextArea();
        aboutBtn = new javax.swing.JButton();
        keyText = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cipher by Armaan");
        setMaximumSize(new java.awt.Dimension(648, 534));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(95, 163, 248));

        encryptBtn.setBackground(new java.awt.Color(255, 255, 255));
        encryptBtn.setFont(new java.awt.Font("The Slavic Font", 1, 24)); // NOI18N
        encryptBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        encryptBtn.setBorderPainted(false);
        encryptBtn.setLabel("Encrypt");
        encryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptBtnActionPerformed(evt);
            }
        });

        decryptBtn.setBackground(new java.awt.Color(255, 255, 255));
        decryptBtn.setFont(new java.awt.Font("The Slavic Font", 1, 24)); // NOI18N
        decryptBtn.setText("Decrypt");
        decryptBtn.setActionCommand("");
        decryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBtnActionPerformed(evt);
            }
        });

        switchBtn.setBackground(new java.awt.Color(255, 255, 102));
        switchBtn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        switchBtn.setText("↹ ");
        switchBtn.setToolTipText("Switch the Text");
        switchBtn.setActionCommand("");
        switchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchBtnActionPerformed(evt);
            }
        });

        decryptText.setBackground(new java.awt.Color(247, 247, 247));
        decryptText.setColumns(20);
        decryptText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        decryptText.setForeground(new java.awt.Color(0, 204, 0));
        decryptText.setLineWrap(true);
        decryptText.setRows(5);
        decryptText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(decryptText);

        encryptText.setBackground(new java.awt.Color(247, 247, 247));
        encryptText.setColumns(20);
        encryptText.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        encryptText.setForeground(new java.awt.Color(0, 51, 255));
        encryptText.setLineWrap(true);
        encryptText.setRows(5);
        encryptText.setToolTipText("Enter text to encrypt");
        jScrollPane2.setViewportView(encryptText);

        aboutBtn.setBackground(new java.awt.Color(255, 51, 51));
        aboutBtn.setFont(new java.awt.Font("The Slavic Font", 0, 24)); // NOI18N
        aboutBtn.setText("About");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("The Slavic Font", 0, 24)); // NOI18N
        jLabel1.setText("Key");

        showPassword.setFont(new java.awt.Font("The Slavic Font", 0, 18)); // NOI18N
        showPassword.setText("Show Key");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(encryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showPassword))
                                    .addComponent(keyText)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(switchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPassword))
                        .addGap(10, 10, 10)
                        .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(switchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(decryptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encryptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        jMenu1.setText("File");

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBtnActionPerformed
        String s = encryptText.getText();
        String key = keyText.getText();
        decryptText.setText(obj.decrypt(s,key));
    }//GEN-LAST:event_decryptBtnActionPerformed

    private void encryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptBtnActionPerformed
        String s = encryptText.getText();
        String key = keyText.getText();
        decryptText.setText(obj.encrypt(s,key));
    }//GEN-LAST:event_encryptBtnActionPerformed

    private void switchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchBtnActionPerformed
        encryptText.setText(decryptText.getText());
        decryptText.setText("");
        
    }//GEN-LAST:event_switchBtnActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog file =  new FileDialog(cipherForm.this,"Load", FileDialog.LOAD);
        file.setVisible(true);
        
        if(file.getFile() != null){
            filename = file.getDirectory() + file.getFile() ;
            setTitle("Cipher - " + file.getFile());
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            
            String line = null;
            
            while((line = reader.readLine()) != null){
                sb.append(line + "\n");
                encryptText.setText(sb.toString());
            }     
            reader.close();     
        }
        catch(Exception e){}
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog file =  new FileDialog(cipherForm.this,"Save File", FileDialog.SAVE);
        file.setVisible(true);
        
        if(file.getFile() != null){
            filename = file.getDirectory() + file.getFile() + ".armn";
            setTitle("Cipher - " + file.getFile());
        }
        try{
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(decryptText.getText());
            setTitle("Cipher - " + file.getFile());
            fileWriter.close();
        }catch(Exception e){}
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        
        new about().setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
      keyText.setEchoChar((char)0); //password = JPasswordField
   } else {
      keyText.setEchoChar('*');
   }
    }//GEN-LAST:event_showPasswordActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cipherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cipherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cipherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cipherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cipherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton decryptBtn;
    private javax.swing.JTextArea decryptText;
    private javax.swing.JButton encryptBtn;
    private javax.swing.JTextArea encryptText;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField keyText;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton switchBtn;
    // End of variables declaration//GEN-END:variables
}
