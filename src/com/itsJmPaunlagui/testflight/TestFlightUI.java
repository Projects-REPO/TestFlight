/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itsJmPaunlagui.testflight;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author its-JmPaunlagui
 */
public class TestFlightUI extends javax.swing.JFrame {

    /**
     * Creates new form TestFlightUI
     */
    public TestFlightUI() {
        initComponents();setIcon();
        this.setTitle("FLIGHT SCHEDULER");
        UIManager.put("OptionPane.messageFont", new Font("Century Gothic", Font.PLAIN, 36));
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/com/itsJmPaunlagui/images/flight.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDestination = new javax.swing.JTextField();
        txtDepartureTime = new javax.swing.JTextField();
        txtArrivalTime = new javax.swing.JTextField();
        txtDateOfFlight = new javax.swing.JTextField();
        btnOrigin = new javax.swing.JButton();
        btnTravelRoute = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCheckSchedule = new javax.swing.JButton();
        lblAircraftName = new javax.swing.JLabel();
        lblOrigin = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        lblArrivalTime = new javax.swing.JLabel();
        lblDateOfFlight = new javax.swing.JLabel();
        lblDepartureTime = new javax.swing.JLabel();
        txtAircraftName = new javax.swing.JTextField();
        txtOrigin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDestination.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        txtDepartureTime.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        txtArrivalTime.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        txtDateOfFlight.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        btnOrigin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnOrigin.setText("Origin");
        btnOrigin.setActionCommand("2 Instance will pass to the constructor");
        btnOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginActionPerformed(evt);
            }
        });

        btnTravelRoute.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnTravelRoute.setText("Travel Route");
        btnTravelRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelRouteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCheckSchedule.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnCheckSchedule.setText("Check Schedule");
        btnCheckSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckScheduleActionPerformed(evt);
            }
        });

        lblAircraftName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAircraftName.setText("Aircraft name");

        lblOrigin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblOrigin.setText("Origin");

        lblDestination.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDestination.setText("Destination");

        lblArrivalTime.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblArrivalTime.setText("Arrival Time");

        lblDateOfFlight.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDateOfFlight.setText("Date of Flight");

        lblDepartureTime.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDepartureTime.setText("Departure Time");

        txtAircraftName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        txtOrigin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrigin)
                            .addComponent(lblAircraftName)
                            .addComponent(lblDestination)
                            .addComponent(lblArrivalTime)
                            .addComponent(lblDateOfFlight)
                            .addComponent(lblDepartureTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAircraftName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(txtOrigin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepartureTime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateOfFlight)
                            .addComponent(txtArrivalTime, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(btnTravelRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckSchedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAircraftName)
                    .addComponent(txtAircraftName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigin)
                    .addComponent(txtOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestination)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartureTime)
                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArrivalTime)
                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfFlight)
                    .addComponent(txtDateOfFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnOrigin)
                .addGap(18, 18, 18)
                .addComponent(btnTravelRoute)
                .addGap(18, 18, 18)
                .addComponent(btnCheckSchedule)
                .addGap(24, 24, 24)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final ImageIcon flightscheduleIcon = new ImageIcon("src/com/itsJmPaunlagui/images/flightschedule.png");
    private final ImageIcon warning = new ImageIcon("src/com/itsJmPaunlagui/images/warning.png");
    private final ImageIcon verified = new ImageIcon("src/com/itsJmPaunlagui/images/verified.png");

    public boolean isDataEntered() {
        // returns true if its not empty, otherwise it will return false
        while (rootPaneCheckingEnabled) {
            return !(txtAircraftName.getText().isEmpty() || txtOrigin.getText().isEmpty()
                    || txtDestination.getText().isEmpty() || txtDepartureTime.getText().isEmpty()
                    || txtArrivalTime.getText().isEmpty() || txtDateOfFlight.getText().isEmpty());
        }
        return false;
    }

    private void btnOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginActionPerformed
        // TODO add your handling code here:
        // Create an object of class Flight and we pass the parameters to the constructor which will set the values to it.
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setAircraftName(txtAircraftName.getText());
        flightSchedule.setOrigin(txtOrigin.getText());

        if (!isDataEntered()) { // if its empty it returns false, otherwise return true
            JOptionPane.showMessageDialog(
                    this, "All fields required!", "Warning!",
                    JOptionPane.WARNING_MESSAGE, warning
            );
        } else {
            JOptionPane.showMessageDialog(
                    this, "Aircraft Name: " + flightSchedule.getAircraftName() + "\n"
                    + "Origin: " + flightSchedule.getOrigin(),
                    "Flight Schedule Origin: " + flightSchedule.getOrigin(), JOptionPane.INFORMATION_MESSAGE, flightscheduleIcon
            );
        }
    }//GEN-LAST:event_btnOriginActionPerformed

    private void btnTravelRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelRouteActionPerformed
        // TODO add your handling code here:
        // Create an object of class Flight and we pass the parameters to the constructor which will set the values to it.
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setAircraftName(txtAircraftName.getText());
        flightSchedule.setOrigin(txtOrigin.getText());
        flightSchedule.setDestination(txtDestination.getText());

        if (!isDataEntered()) { // if its empty it returns false, otherwise return true
            JOptionPane.showMessageDialog(
                    this, "All fields required!", "Warning!",
                    JOptionPane.WARNING_MESSAGE, warning
            );
        } else {
            JOptionPane.showMessageDialog(
                    this, "Aircraft Name: " + flightSchedule.getAircraftName() + "\n"
                    + "Origin: " + flightSchedule.getOrigin() + "\n"
                    + "Destination: " + flightSchedule.getDestination(),
                    "Flight Schedule Route - " + "From: " + flightSchedule.getOrigin()
                    + "  To: " + flightSchedule.getDestination(), JOptionPane.INFORMATION_MESSAGE, flightscheduleIcon
            );
        }
    }//GEN-LAST:event_btnTravelRouteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCheckScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckScheduleActionPerformed
        // TODO add your handling code here:
        // Create an object of class Flight and we pass the parameters to the constructor which will set the values to it.
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setAircraftName(txtAircraftName.getText());
        flightSchedule.setOrigin(txtOrigin.getText());
        flightSchedule.setDestination(txtDestination.getText());
        flightSchedule.setDepartureTime(txtDepartureTime.getText());
        flightSchedule.setArrivalTime(txtArrivalTime.getText());
        flightSchedule.setDateOfFlight(txtDateOfFlight.getText());

        if (!isDataEntered()) { // if its empty it returns false, otherwise return true
            JOptionPane.showMessageDialog(
                    this, "All fields required!", "Warning!",
                    JOptionPane.WARNING_MESSAGE, warning
            );
        } else {
            JOptionPane.showMessageDialog(
                    this, "Aircraft Name: " + flightSchedule.getAircraftName() + "\n"
                    + "Origin: " + flightSchedule.getOrigin() + "\n"
                    + "Destination: " + flightSchedule.getDestination() + "\n"
                    + "Departure Time: " + flightSchedule.getDepartureTime() + "\n"
                    + "Arrival Time: " + flightSchedule.getArrivalTime() + "\n"
                    + "Date of Flight: " + flightSchedule.getDateOfFlight(),
                    "Check Flight Schedule", JOptionPane.INFORMATION_MESSAGE, flightscheduleIcon
            );
        }
    }//GEN-LAST:event_btnCheckScheduleActionPerformed

        //Clear field
    void clear() {
        txtAircraftName.setText("");
        txtOrigin.setText("");
        txtDestination.setText("");
        txtDepartureTime.setText("");
        txtArrivalTime.setText("");
        txtDateOfFlight.setText("");
        JOptionPane.showMessageDialog(
                this, "Cleared Successfully!", "Cleared",
                JOptionPane.INFORMATION_MESSAGE, verified
        );
    }
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
            java.util.logging.Logger.getLogger(TestFlightUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFlightUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFlightUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFlightUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFlightUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckSchedule;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrigin;
    private javax.swing.JButton btnTravelRoute;
    private javax.swing.JLabel lblAircraftName;
    private javax.swing.JLabel lblArrivalTime;
    private javax.swing.JLabel lblDateOfFlight;
    private javax.swing.JLabel lblDepartureTime;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblOrigin;
    public javax.swing.JTextField txtAircraftName;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtDateOfFlight;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtOrigin;
    // End of variables declaration//GEN-END:variables
}
