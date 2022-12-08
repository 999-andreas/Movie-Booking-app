/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie_app;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import static movie_app.movie.getMovies;



/**
 *
 * @author Antoine
 */
public class MoviesFrames extends javax.swing.JFrame {

    private Member aMember;
    private ArrayList<movie> theMovies;
    private movie theChosenMovie;
    DefaultListModel listModel= new DefaultListModel();
    
    /**
     * Creates new form MoviesFrames
     * @param theMember
     */
    
    public MoviesFrames(Member theMember) {
        initComponents();
        aMember= theMember;//Retrieves the user from previous page
        theMovies= getMovies();// Retrieves the list of movies on txt file
        
        lblWelcome.setText("Welcome "+aMember.first_name+"!"); //Welcomes the user
        
        
        for (int i=0; i <theMovies.size(); i++){
            if (theMovies.get(i).isAvailability()==true){
                listModel.addElement(theMovies.get(i).getGenre()+"   ||    "+theMovies.get(i).getTitle());                            
            }            
        }
        
        listMovies.setModel(listModel);
        
        
    }
    
    public MoviesFrames(){
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

        btnDisconnect = new javax.swing.JButton();
        btnGoToLogin = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMovies = new javax.swing.JList<>();
        btnChooseMovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDisconnect.setText("Disconnect");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        btnGoToLogin.setText("Login");
        btnGoToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToLoginActionPerformed(evt);
            }
        });

        lblWelcome.setText("Welcome Guest!");

        jScrollPane1.setViewportView(listMovies);

        btnChooseMovie.setText("Choose a Movie!");
        btnChooseMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisconnect))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChooseMovie)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChooseMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToLoginActionPerformed
        // TODO add your handling code here:
        LoginFrame theLoginFrame= new LoginFrame();
        theLoginFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnGoToLoginActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        // TODO add your handling code here:
        MainFrame theMainFrame= new MainFrame();
        theMainFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void btnChooseMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseMovieActionPerformed
        // TODO add your handling code here:
        if (!listMovies.isSelectionEmpty()){
            int index= listMovies.getSelectedIndex();
            theChosenMovie= theMovies.get(index);
            SelectedMovieFrame theMovieFrame= new SelectedMovieFrame(theChosenMovie);
            theMovieFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnChooseMovieActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MoviesFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviesFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviesFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviesFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviesFrames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseMovie;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton btnGoToLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JList<String> listMovies;
    // End of variables declaration//GEN-END:variables
}
