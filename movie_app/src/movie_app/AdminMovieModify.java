/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie_app;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Antoine
 */
public class AdminMovieModify extends javax.swing.JFrame {

    private movie aMovieToModify;
    DefaultListModel listModel;
    private ArrayList <String> theTimes= new ArrayList<String>();
    private int nbTimes;
    private static int MAX=8;
    /**
     * Creates new form AdminMovieCreation
     * @param theMovie
     */
    public AdminMovieModify(movie theMovie) {
        initComponents();
        aMovieToModify=theMovie;//retrieve the movie data
        //set all the text fields with the corresponding data to prefill
        tfMovieTitle.setText(aMovieToModify.getTitle());
        tfGenre.setText(aMovieToModify.getGenre());
        tfDuration.setText(Integer.toString(aMovieToModify.getDuration()));
        tfReleaseDate.setText(aMovieToModify.getDate());
        tfPrice.setText(Double.toString(aMovieToModify.getPrice()));
        tfDiscount.setText(Double.toString(aMovieToModify.getDiscount()));
        tfNumTickets.setText(Integer.toString(aMovieToModify.getNb_place()));
        tfImageUrl.setText(aMovieToModify.getUrl());
        if(aMovieToModify.isAvailability()==true){
            rbAvailable.setSelected(true);
        }
        else{
            rbNotAvailable.setSelected(true);
        }
        
        nbTimes=aMovieToModify.getTimes().length;
        
        
        listModel= new DefaultListModel();
        for (int i=0; i<(aMovieToModify.getTimes().length);i++){
            listModel.addElement((aMovieToModify.getTimes())[i]);
        }
         
        
        listTimings.setModel(listModel);
        
        
    }
    
    public AdminMovieModify(){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblMovieTitle = new javax.swing.JLabel();
        tfMovieTitle = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblReleaseDate = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        tfGenre = new javax.swing.JTextField();
        lblModifyMovie = new javax.swing.JLabel();
        lblNumTickets = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        tfReleaseDate = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfDiscount = new javax.swing.JTextField();
        tfNumTickets = new javax.swing.JTextField();
        rbAvailable = new javax.swing.JRadioButton();
        rbNotAvailable = new javax.swing.JRadioButton();
        lblAvailability = new javax.swing.JLabel();
        btnModifyMovie = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tfImageUrl = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblTimings = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTimings = new javax.swing.JList<>();
        btnAddTime = new javax.swing.JButton();
        tfDate = new javax.swing.JTextField();
        cbHour = new javax.swing.JComboBox<>();
        lbl2Points = new javax.swing.JLabel();
        cbMinutes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMovieTitle.setText("Title : ");

        lblGenre.setText("Genre :");

        lblDuration.setText("Duration :");

        lblReleaseDate.setText("Release Date :");

        lblPrice.setText("Ticket Price :");

        lblDiscount.setText("Discount (amount) :");

        lblModifyMovie.setText("Modify a Movie");

        lblNumTickets.setText("Number of tickets available :");

        buttonGroup1.add(rbAvailable);
        rbAvailable.setText("Available ");

        buttonGroup1.add(rbNotAvailable);
        rbNotAvailable.setText("Not Available");

        lblAvailability.setText("Availability :");

        btnModifyMovie.setText("Modify Movie");
        btnModifyMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMovieActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblImage.setText("Image URL :");

        lblTimings.setText("Timings :");

        listTimings.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "item 2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTimings);

        btnAddTime.setText("Add");
        btnAddTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTimeActionPerformed(evt);
            }
        });

        tfDate.setText("DD/MM/YY");

        cbHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "16", "17", "18", "19", "20", "21", "22" }));

        lbl2Points.setText(":");

        cbMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30", "40", "50" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(lblModifyMovie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiscount)
                            .addComponent(lblNumTickets)
                            .addComponent(lblPrice)
                            .addComponent(lblReleaseDate)
                            .addComponent(lblDuration)
                            .addComponent(lblGenre)
                            .addComponent(lblMovieTitle)
                            .addComponent(lblAvailability)
                            .addComponent(lblImage)
                            .addComponent(lblTimings))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGenre)
                            .addComponent(tfMovieTitle)
                            .addComponent(tfDuration)
                            .addComponent(tfReleaseDate)
                            .addComponent(tfPrice)
                            .addComponent(tfDiscount)
                            .addComponent(tfNumTickets)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModifyMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rbAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbNotAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbHour, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl2Points, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 3, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddTime)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblModifyMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimings)
                    .addComponent(btnAddTime)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2Points)
                    .addComponent(cbMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNotAvailable)
                    .addComponent(rbAvailable)
                    .addComponent(lblAvailability))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMovieActionPerformed
        // TODO add your handling code here:
        //Set Methods to change the current object with all the parameters
        aMovieToModify.setTitle(tfMovieTitle.getText());
        aMovieToModify.setGenre(tfGenre.getText());
        aMovieToModify.setDuration(Integer.parseInt(tfDuration.getText()));
        aMovieToModify.setNb_place(Integer.parseInt(tfNumTickets.getText()));
        aMovieToModify.setDate(tfReleaseDate.getText());
        aMovieToModify.setPrice(Double.parseDouble(tfPrice.getText()));
        aMovieToModify.setDiscount(Double.parseDouble(tfDiscount.getText()));
        aMovieToModify.setUrl(tfImageUrl.getText());
        if (rbAvailable.isSelected()==true){
            aMovieToModify.setAvailability(true);
        }
        else{
            aMovieToModify.setAvailability(false);
        }
        
        String[] times= new String[theTimes.size()];
        
        for (int i=0; i<theTimes.size();i++){
            times[i]= theTimes.get(i);
            System.out.println(times[i]);
        }
        
        aMovieToModify.setTimes(times);
                
        aMovieToModify.modif_movie();
    }//GEN-LAST:event_btnModifyMovieActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        AdminSelectMovie backToSelect= new AdminSelectMovie();
        backToSelect.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTimeActionPerformed
        // TODO add your handling code here:
        String timing =tfDate.getText()+"@"+(String)cbHour.getSelectedItem()+"@"+(String)cbMinutes.getSelectedItem();
        
        if(nbTimes<MAX)
        {
            listModel.addElement(timing);
            listTimings.setModel(listModel);
            theTimes.add(timing);
        }
            
        nbTimes++;
    }//GEN-LAST:event_btnAddTimeActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMovieModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMovieModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMovieModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMovieModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMovieModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTime;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModifyMovie;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbHour;
    private javax.swing.JComboBox<String> cbMinutes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2Points;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblModifyMovie;
    private javax.swing.JLabel lblMovieTitle;
    private javax.swing.JLabel lblNumTickets;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblReleaseDate;
    private javax.swing.JLabel lblTimings;
    private javax.swing.JList<String> listTimings;
    private javax.swing.JRadioButton rbAvailable;
    private javax.swing.JRadioButton rbNotAvailable;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDiscount;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfImageUrl;
    private javax.swing.JTextField tfMovieTitle;
    private javax.swing.JTextField tfNumTickets;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfReleaseDate;
    // End of variables declaration//GEN-END:variables
}
