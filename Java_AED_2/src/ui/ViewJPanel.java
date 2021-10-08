/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CarDetailHistory;
import model.CarDetails;

/**
 *
 * @author anupritadhamale
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    CarDetailHistory history;
    
    public ViewJPanel(CarDetailHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblExpiredCertificate = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtAvailability = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCityName = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        lblManufacturingYear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        Date_manufacturing_year = new com.toedter.calendar.JDateChooser();
        lblCityName = new javax.swing.JLabel();
        Date_expired_maintainance = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarDetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        lblExpiredCertificate.setText("Expired Maintainance Certificate:");

        txtNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamesActionPerformed(evt);
            }
        });

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("VIEW CAR DETAILS ");

        lblName.setText("Name:");

        lblAvailability.setText("Availability:");

        lblBrandName.setText("Brand:");

        lblManufacturingYear.setText("Manufacturing Year:");

        lblSeats.setText("Seats:");

        lblSerialNumber.setText("Serial Number:");

        lblModelNumber.setText("Model Number:");

        lblCityName.setText("CityName:");

        tblCarDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Availability", "Brand", "Manufacturing Year", "Seats", "Serial Number", "Model Number", "City Name", "Expired Maintainance Certificate"
            }
        ));
        jScrollPane1.setViewportView(tblCarDetails);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblExpiredCertificate)
                            .addComponent(lblCityName)
                            .addComponent(lblModelNumber)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblSeats)
                            .addComponent(lblManufacturingYear)
                            .addComponent(lblBrandName)
                            .addComponent(lblAvailability)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCityName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSeats, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBrand, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAvailability, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNames, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(Date_manufacturing_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_expired_maintainance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 314, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrandName)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturingYear)
                    .addComponent(Date_manufacturing_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityName)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExpiredCertificate)
                    .addComponent(Date_expired_maintainance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamesActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblCarDetails.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view ");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCarDetails.getModel();
        CarDetails selectedCar = (CarDetails)model.getValueAt(selectedRowIndex, 0);
        
        
        txtNames.setText(selectedCar.getCarName());
        txtAvailability.setText(selectedCar.getCarAvailability());
        txtBrand.setText(selectedCar.getBrandName());
        txtSeats.setText(String.valueOf(selectedCar.getSeats()));
        txtSerialNumber.setText(String.valueOf(selectedCar.getSerialNumber()));
        Date_manufacturing_year.setDate(selectedCar.getManufacturingYear());//(selectedCar.getManufacturingYear());
        txtModelNumber.setText(selectedCar.getModelNumber());
        txtCityName.setText(selectedCar.getCityName());
        Date_expired_maintainance.setDate(selectedCar.getExpiredCertificate());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCarDetails.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete ");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCarDetails.getModel();
        CarDetails selectedCar = (CarDetails)model.getValueAt(selectedRowIndex, 0);
        
        history.deleteCar(selectedCar);
       
        JOptionPane.showMessageDialog(this, " Car Details deleted ");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCarDetails.getModel();
        
        int selectedRowIndex = tblCarDetails.getSelectedRow();
        
        String carName = model.getValueAt(selectedRowIndex , 0).toString();
        String carAvailability = model.getValueAt(selectedRowIndex , 0).toString();
        String brandName = model.getValueAt(selectedRowIndex , 0).toString();
        Date manufacturingYear = (Date) model.getValueAt(selectedRowIndex, 0);
        int seats = (int) model.getValueAt(selectedRowIndex, 0);
        long serialNumber = (long) model.getValueAt(selectedRowIndex , 0);
        String modelNumber = model.getValueAt(selectedRowIndex , 0).toString();
        String cityName = model.getValueAt(selectedRowIndex , 0).toString();
        Date expiredCertificate = (Date) model.getValueAt(selectedRowIndex, 0);
        
        

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_expired_maintainance;
    private com.toedter.calendar.JDateChooser Date_manufacturing_year;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBrandName;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblExpiredCertificate;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCarDetails;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCarDetails.getModel();
        model.setRowCount(0);
       
        for(CarDetails cd: history.getHistory()){
            Object[] row = new Object[9];
            row[0] = cd;
            row[1] = cd.getCarAvailability();
            row[2] = cd.getBrandName();
            row[3] = cd.getManufacturingYear();
            row[4] = cd.getSeats();
            row[5] = cd.getSerialNumber();
            row[6] = cd.getModelNumber();
            row[7] = cd.getCityName();
            row[8] = cd.getExpiredCertificate();
            
            model.addRow(row);
            
        }
        
        
    }
}