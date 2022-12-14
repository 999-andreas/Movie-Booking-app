/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie_app;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import static movie_app.Member.deleteMember;
import static movie_app.superUser.getUsers;

/**
 *
 * @author Antoine
 */
public class AdminViewUsers extends javax.swing.JFrame {

    private Member selectedMember; //Member variable which we will pass into the next frame for modify user
    private ArrayList<Member> theMembers= getUsers(false);//takes the list of members which aren't admins
    private DefaultTableModel tableModel= new DefaultTableModel();//model for data, to insert into the table
    private Object[][] theTable;
    /**
     * Creates new form AdminViewUsers
     */
    public AdminViewUsers() {
        initComponents();
        tableModel.addColumn("id");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Username");
        tableModel.addColumn("Password");
        
        
        theTable= new Object[theMembers.size()][5];
        for (int j=0;j<theMembers.size();j++){
            theTable[j][0]=theMembers.get(j).getId();
            theTable[j][1]=theMembers.get(j).getFirst_name();
            theTable[j][2]=theMembers.get(j).getLast_name();
            theTable[j][3]=theMembers.get(j).getUsername();
            theTable[j][4]=theMembers.get(j).getPw();
        }
        
        for (int i=0; i<theMembers.size();i++){//fill the data model
            tableModel.addRow(theTable[i]);
        }
        tableTheUsers.setModel(tableModel);// set the model
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsers = new javax.swing.JLabel();
        btnDeleteUser = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnModifyUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTheUsers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsers.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        lblUsers.setText("The Users:");

        btnDeleteUser.setText("Delete a User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnModifyUser.setText("Modify a Member");
        btnModifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyUserActionPerformed(evt);
            }
        });

        tableTheUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableTheUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblUsers)
                .addGap(108, 108, 108)
                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyUser)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsers)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        if (!tableTheUsers.getSelectionModel().isSelectionEmpty()){// if the admin has selected a user
            int index = tableTheUsers.getSelectedRow(); //takes the index of the selected item in the list
            theMembers.remove(index);//don't think this line is usefull, but i'm still going to write it there
            tableModel.removeRow(index);//remove from the data model
            tableTheUsers.setModel(tableModel);//reajust the visual list
            deleteMember(index, false); //deletes the member
        }
        else{
            lblWarning.setText("Select a User First!");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        AdminMenuFrame backToMenuFrame= new AdminMenuFrame();
        backToMenuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyUserActionPerformed
        // TODO add your handling code here:
        if(!tableTheUsers.getSelectionModel().isSelectionEmpty()){ //if the admin has selected a user
            int index = tableTheUsers.getSelectedRow();//takes the index of the selected item in the list
            selectedMember=theMembers.get(index);//stocks the member corresponding to the selected index in a Member variable
            AdminModifyUser theModifyFrame= new AdminModifyUser(selectedMember);//sends the Member variable to the next frame, to be modified
            theModifyFrame.setVisible(true);
            this.dispose();
        }
        else{
            lblWarning.setText("Select a User First!");
        }
    }//GEN-LAST:event_btnModifyUserActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnModifyUser;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTable tableTheUsers;
    // End of variables declaration//GEN-END:variables
}
