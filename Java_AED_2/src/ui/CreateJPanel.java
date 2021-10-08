 //* To change this license header, choose License Headers in Project Properties.
 //* To change this template file, choose Tools | Templates
 //* and open the template in the editor.
 //*/
package ui;

import static java.lang.constant.ConstantDescs.NULL;
import java.util.Date;
import javax.swing.JOptionPane;
import model.CarDetailHistory;
import model.CarDetails;

/**
 *
 * @author anupritadhamale
 */
public class CreateJPanel extends javax.swing.JPanel {

     CarDetailHistory history;

    /**
     * Creates new form NewJPanel
     */
    public CreateJPanel(CarDetailHistory history) {
        initComponents();
        this.history = history;
    }

    CreateJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblBrandName = new javax.swing.JLabel();
        lblManufacturingYear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        lblExpiredCertificate = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtAvailability = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCityName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        Date_manufacturing_year = new com.toedter.calendar.JDateChooser();
        Date_expired_maintainance = new com.toedter.calendar.JDateChooser();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE CAR ");

        lblName.setText("Name:");

        lblAvailability.setText("Availability:");

        lblBrandName.setText("Brand:");

        lblManufacturingYear.setText("Manufacturing Year:");

        lblSeats.setText("Seats:");

        lblSerialNumber.setText("Serial Number:");

        lblModelNumber.setText("Model Number:");

        lblCityName.setText("CityName:");

        lblExpiredCertificate.setText("Expired Maintainance Certificate:");

        txtNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamesActionPerformed(evt);
            }
        });

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String names = txtNames.getText();
        String carAvailability = txtAvailability.getText();
        String brandName = txtBrand.getText();
        int seats = Integer.parseInt(txtSeats.getText());
        long serialNumber = Integer.parseInt(txtSerialNumber.getText());
        Date manufacturingYear = Date_manufacturing_year.getDate();
        String modelNumber = txtModelNumber.getText();
        String cityName = txtCityName.getText();
        Date expiredCertificate= Date_expired_maintainance.getDate();
        
        CarDetails cd = history.addNewDetails();
        cd.setCarName(names);
        cd.setCarAvailability(carAvailability);
        cd.setBrandName(brandName);
        cd.setSeats(seats);
        cd.setSerialNumber(serialNumber);
        cd.setManufacturingYear(manufacturingYear);
        cd.setModelNumber(modelNumber);
        cd.setCityName(cityName);
        cd.setExpiredCertificate(expiredCertificate);
        JOptionPane.showMessageDialog(this, "New  car details added");
        
        //txtNames.setText("");
        //txtAvailability.setText("");
        //txtBrand.setText("");
        //txtSeats.setText("");
        //txtSerialNumber.setText("");
        //Date_manufacturing_year.setDate(null);
        //txtModelNumber.setText("");
        //txtCityName.setText("");
        //Date_expired_maintainance.setDate(null);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamesActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_expired_maintainance;
    private com.toedter.calendar.JDateChooser Date_manufacturing_year;
    private javax.swing.JButton btnSave;
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
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
