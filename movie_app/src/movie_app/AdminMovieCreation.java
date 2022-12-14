/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie_app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static movie_app.superUser.KEYBOARDDATE;
import static movie_app.superUser.KEYBOARDSAFETY;

/**
 *
 * @author Antoine
 */
public class AdminMovieCreation extends javax.swing.JFrame {

    private static final int MAX = 8;
    private int nb_times;
    private ArrayList <session> files_times = new ArrayList<session>();
    private String file_path;
    /**
     * Creates new form AdminMovieCreation
     */
    public AdminMovieCreation() {
        initComponents();
        tfMovieTitle.addKeyListener(KEYBOARDSAFETY);
        tfGenre.addKeyListener(KEYBOARDSAFETY);
        tfDuration.addKeyListener(KEYBOARDSAFETY);
        tfReleaseDate.addKeyListener(KEYBOARDSAFETY);
        
        Date.addKeyListener(KEYBOARDDATE);
        
        
        
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
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        lblMovieTitle = new javax.swing.JLabel();
        tfMovieTitle = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblReleaseDate = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        tfGenre = new javax.swing.JTextField();
        lblCreateMovie = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        tfReleaseDate = new javax.swing.JTextField();
        rbAvailable = new javax.swing.JRadioButton();
        rbNotAvailable = new javax.swing.JRadioButton();
        lblAvailability = new javax.swing.JLabel();
        btnAddMovie = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jFormattedDiscount = new javax.swing.JFormattedTextField();
        jWarning = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        imagePath = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        minutes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        hours = new javax.swing.JComboBox<>();
        lblNumTickets = new javax.swing.JLabel();
        tfNumTickets = new javax.swing.JTextField();
        jFormattedPrice = new javax.swing.JFormattedTextField();
        lblPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jFormattedTextField1.setText("jFormattedTextField1");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMovieTitle.setText("Title : ");

        tfMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMovieTitleActionPerformed(evt);
            }
        });

        lblGenre.setText("Genre :");

        lblDuration.setText("Duration :");

        lblReleaseDate.setText("Release Date :");

        lblDiscount.setText("Discount (amount) :");

        lblCreateMovie.setText("New Movie");

        tfReleaseDate.setText("dd/MM/yyyy");
        tfReleaseDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfReleaseDateActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAvailable);
        rbAvailable.setText("Available ");

        buttonGroup1.add(rbNotAvailable);
        rbNotAvailable.setText("Not Available");

        lblAvailability.setText("Availability :");

        btnAddMovie.setText("Add Movie");
        btnAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovieActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jFormattedDiscount.setText("#.##");
        jFormattedDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedDiscountActionPerformed(evt);
            }
        });

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        imagePath.setText("file path");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        minutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));
        minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesActionPerformed(evt);
            }
        });

        jLabel2.setText(":");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Date.setText("DD/MM/YY");
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jLabel1.setText("Timings :");

        hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "16", "17", "18", "19", "20", "21", "22" }));

        lblNumTickets.setText("Number of tickets available :");

        jFormattedPrice.setText("#.##");
        jFormattedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedPriceActionPerformed(evt);
            }
        });

        lblPrice.setText("Ticket Price :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumTickets)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel3.setText("Sessions:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(lblCreateMovie)
                .addGap(29, 788, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAvailability)
                                .addGap(18, 18, 18)
                                .addComponent(rbAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(rbNotAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiscount)
                            .addComponent(lblReleaseDate)
                            .addComponent(lblDuration)
                            .addComponent(lblGenre)
                            .addComponent(lblMovieTitle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(tfMovieTitle)
                            .addComponent(tfDuration)
                            .addComponent(tfReleaseDate)
                            .addComponent(jFormattedDiscount))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePath)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCreateMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagePath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAvailable)
                            .addComponent(rbNotAvailable)
                            .addComponent(lblAvailability))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMovieTitleActionPerformed

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        // TODO add your handling code here:

         // if the user selects a file
        if (jFileChooser1.getSelectedFile()!= null)
        {
            session[] tab_sessions = new session[files_times.size()];
        
            for(int k=0; k<files_times.size();k++)
            {
                tab_sessions[k] = files_times.get(k);
            }

            try
            {
                movie theMovie = new movie(tfGenre.getText(),tfMovieTitle.getText(),tfReleaseDate.getText(),Integer.parseInt(tfDuration.getText()), rbAvailable.isSelected(), Double.parseDouble(jFormattedDiscount.getText()),tab_sessions, file_path );
                theMovie.saveMovie();
                
                AdminMenuFrame frame = new AdminMenuFrame();
                frame.setVisible(true);
                this.dispose();
            }
            catch(IllegalArgumentException  e )
            {
                jWarning.setText("wrong input format!");
            }
            catch (IOException ex) {
                Logger.getLogger(AdminMovieCreation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // if the user cancelled the operation
        else
        {
            jWarning.setText("please select a photo");
        }
            
    }//GEN-LAST:event_btnAddMovieActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        AdminMenuFrame theAdminFrame = new AdminMenuFrame();
        theAdminFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void minutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

//action when the add a session is clicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            
            
            SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar calendar = Calendar.getInstance();
            
            Date dateObj = calendar.getTime();
            String formattedDate = dtf.format(dateObj);
            System.out.println(formattedDate);// gives the actual date

            
            if(dateObj.after(dtf.parse(Date.getText())) || dtf.parse(Date.getText()).before(dtf.parse(tfReleaseDate.getText())))//checks if the date is correct
            {
                jWarning.setText("session not added, wrong date");
                return;
            }
            
            String timing =Date.getText()+"@"+(String)hours.getSelectedItem()+"@"+(String)minutes.getSelectedItem();// retrives the inputs for the session
            
            if(nb_times<MAX)
            {
                session aSession = new session(timing,Integer.parseInt(tfNumTickets.getText()), Double.parseDouble(jFormattedPrice.getText()) );
                for(int k=0;k<files_times.size();k++) // loop to check if the session is valid
                {
                    if((files_times.get(k).getNb_place()==aSession.getNb_place()) && (files_times.get(k).getPrice()== aSession.getPrice()) && (files_times.get(k).getTime().compareTo(aSession.getTime())==0))
                    {
                        jWarning.setText("session not added, already present");
                        return;
                    }
                }
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "session added!");
                System.out.println(aSession);
                files_times.add(aSession);
                nb_times++;
            }
        } catch (ParseException ex) 
        {
            jWarning.setText("wrong date format!");
        }
        catch(IllegalArgumentException  e )
        {
            jWarning.setText("wrong input format!");
        }
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedDiscountActionPerformed

    private void jFormattedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedPriceActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        try {
            // TODO add your handling code here:
            imagePath.setText(String.valueOf(jFileChooser1.getSelectedFile().getPath()));
            
            String sep = String.valueOf(jFileChooser1.getSelectedFile().getPath()).replace("\\", ";");
            file_path = String.valueOf(jFileChooser1.getSelectedFile().getPath());
            
            String name = sep.split(";" )[2];
            
            String file_name = jFileChooser1.getSelectedFile().getName();
            
            
            String dest = "C:\\Users\\"+name+"\\Documents\\GitHub\\Movie-Booking-app\\movie_app\\images\\"+file_name;
            Path tmp = Files.move(Paths.get(file_path), Paths.get(dest));
            
            if(tmp != null)
            {
                System.out.println("Fichier déplacé avec succès");
                file_path = "images/"+file_name;
            }
            else
            {
                System.out.println("Impossible de déplacer le fichier"); 
            }
        } catch (IOException ex) {
            Logger.getLogger(AdminMovieCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void tfReleaseDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfReleaseDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfReleaseDateActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMovieCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMovieCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMovieCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMovieCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMovieCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JLabel imagePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedDiscount;
    private javax.swing.JFormattedTextField jFormattedPrice;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jWarning;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCreateMovie;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblMovieTitle;
    private javax.swing.JLabel lblNumTickets;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblReleaseDate;
    private javax.swing.JComboBox<String> minutes;
    private javax.swing.JRadioButton rbAvailable;
    private javax.swing.JRadioButton rbNotAvailable;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfMovieTitle;
    private javax.swing.JTextField tfNumTickets;
    private javax.swing.JTextField tfReleaseDate;
    // End of variables declaration//GEN-END:variables
}
